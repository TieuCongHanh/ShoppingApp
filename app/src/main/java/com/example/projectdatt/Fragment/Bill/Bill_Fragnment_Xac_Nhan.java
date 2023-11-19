package com.example.projectdatt.Fragment.Bill;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectdatt.Adapter.Profile.History.HistoryAdapter;
import com.example.projectdatt.Model.Bill;
import com.example.projectdatt.R;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Bill_Fragnment_Xac_Nhan#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Bill_Fragnment_Xac_Nhan extends Fragment {

private RecyclerView recyclerView ;
private ArrayList<Bill> arrayList ;

private HistoryAdapter adapter;

    public Bill_Fragnment_Xac_Nhan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_bill__fragnment__xac__nhan, container, false);
        recyclerView = view.findViewById(R.id.rclxacnhandonadmin);
//        arrayList = new ArrayList<>();
//        arrayList = (ArrayList<Bill>) BillDatabase.getInstance(getContext()).billDAO().getlistBillbyStatus(0,1);
//        adapter = new HistoryAdapter(arrayList , getContext());
//        LinearLayoutManager manager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(manager);
//        recyclerView.setAdapter(adapter);
        return view;
    }
}