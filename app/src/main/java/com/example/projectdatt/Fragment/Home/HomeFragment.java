package com.example.projectdatt.Fragment.Home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.projectdatt.Adapter.Home.HomeAdapter;
import com.example.projectdatt.Adapter.Home.ProductsAdapterManager;
import com.example.projectdatt.Adapter.viewpager2.SlideAdapterHome;
import com.example.projectdatt.FirebaseDAO.FirebaseDao;
import com.example.projectdatt.Interface.StatusGetProducts;
import com.example.projectdatt.Model.Photo;
import com.example.projectdatt.Model.Products;
import com.example.projectdatt.R;
import com.google.firebase.database.DatabaseError;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    //
    private ViewPager vpr;
    private List<Photo> photoList;
    private Timer timer;
    Button btnAdd;
    private SlideAdapterHome slideAdapter;
    private List<Products> productList;
    private RecyclerView recyclerView;
    private GridLayoutManager layoutManager;
    private SearchView searchView;
    HomeAdapter homeAdapter;
    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        GetView(view);

        searchView=view.findViewById(R.id.seachView);
        //slider
        vpr = (ViewPager) view.findViewById(R.id.vpr);
        photoList = getListPhoto();
        slideAdapter = new SlideAdapterHome(getContext(), photoList);
        vpr.setAdapter(slideAdapter);
        autoSlide();

        // Khởi tạo RecyclerView và Adapter
        recyclerView = view.findViewById(R.id.recycler_listproducts);
        layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        homeAdapter = new HomeAdapter(getActivity());
        recyclerView.setAdapter(homeAdapter);

        // Khởi tạo danh sách sản phẩm
        productList = new ArrayList<>();

        // Đọc danh sách sản phẩm từ Firebase và cập nhật Adapter
        FirebaseDao.ReadProducts(new StatusGetProducts() {
            @Override
            public void onSuccess(List<Products> productsList) {
                productList.clear();
                productList.addAll(productsList);
                homeAdapter.setDataProducts(productList);
            }

            @Override
            public void onError(DatabaseError error) {
                // Xử lý lỗi nếu có
                Toast.makeText(getActivity(), "Lỗi khi đọc danh sách sản phẩm", Toast.LENGTH_SHORT).show();
            }
        });

        //
        searchProduct();


    }
    private void GetView(View view){
        recyclerView = view.findViewById(R.id.recycler_listproducts);
        layoutManager = new GridLayoutManager(getContext(), 2);
    }
    private List<Photo> getListPhoto() {
        List<Photo> list = new ArrayList<>();
        list.add(new Photo(R.drawable.bn1));
        list.add(new Photo(R.drawable.bn2));
        list.add(new Photo(R.drawable.bn3));
        list.add(new Photo(R.drawable.bn4));
        return list;
    }
    private void autoSlide() {
        if (photoList == null || photoList.isEmpty() || vpr == null) {
            return;
        }
        if (timer == null) {
            timer = new Timer();
        }
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        int curentItem = vpr.getCurrentItem();
                        int toltalItem = photoList.size() - 1;
                        if (curentItem < toltalItem) {
                            curentItem++;
                            vpr.setCurrentItem(curentItem);
                        } else {
                            vpr.setCurrentItem(0);
                        }
                    }
                });
            }
        }, 5000, 6000);
    }
    private void searchProduct(){
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterliss(newText);
                return true;
            }



            private void filterliss(String Text) {
                List<Products> fiteliss = new ArrayList<>();
                for (Products product : productList) {
                    if (product.getProduct_name().toLowerCase().contains(Text.toLowerCase())) {
                        fiteliss.add(product);
                    }
                }
                if (fiteliss.isEmpty()) {

                } else {
                    homeAdapter.setfilterliss(fiteliss);
                }
            }
        });
    }
}