//package com.example.projectdatt;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//import androidx.viewpager2.widget.ViewPager2;
//
//import android.os.Bundle;
//import android.view.MenuItem;
//
////import com.example.foodorderbasic.AdapterAdmin.ViewPagerAdapterAdminBill;
//import com.example.projectdatt.Adapter.Profile.History.HistoryAdapter;
//import com.example.projectdatt.Adapter.ViewPagerAdapterAdminBill;
//import com.example.projectdatt.Fragment.Cart.CartFragment;
//
//import com.example.projectdatt.R;
//
//import com.google.android.material.tabs.TabLayout;
//import com.google.android.material.tabs.TabLayoutMediator;
//
//public class OrderManagerActivity extends AppCompatActivity {
//        TabLayout mTabLayout ;
//        ViewPager2 mviewPager;
//
//        Toolbar toolbar ;
//
//        ViewPagerAdapterAdminBill viewPagerAdapterAdminBill ;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.layout_orderact);
//
//        mTabLayout = findViewById(R.id.tablayout_bill_admin);
//        mviewPager = findViewById(R.id.viewpager_bill_admin);
//
//        toolbar = findViewById(R.id.toolbar_admin_bill);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//
//        viewPagerAdapterAdminBill = new ViewPagerAdapterAdminBill(OrderManagerActivity.this);
//        mviewPager.setAdapter(viewPagerAdapterAdminBill);
//        new TabLayoutMediator(mTabLayout, mviewPager, (tab, position) -> {
//            switch (position){
//                case 0:
//                    tab.setText("Xác Nhận đơn hàng");
//                    break;
//                case 1:
//                    tab.setText("Đã nhận");
//                    break;
//                case 2:
//                    tab.setText("Đã hủy");
//                    break;
//
//
//            }
//        }).attach();
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int  i = item.getItemId() ;
//
//        if (i== android.R.id.home) {
//            // Xử lý sự kiện nút "Back" ở đây
//            onBackPressed(); // Hoặc thực hiện hành động tùy chỉnh của bạn
//        }
//        return true;
//    }
//}