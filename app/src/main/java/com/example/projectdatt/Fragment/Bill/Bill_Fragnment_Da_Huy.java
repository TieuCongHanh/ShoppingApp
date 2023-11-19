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
 * Use the {@link Bill_Fragnment_Da_Huy#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Bill_Fragnment_Da_Huy extends Fragment {
    private RecyclerView recyclerView ;
    private ArrayList<Bill> arrayList ;

    private HistoryAdapter adapter;

    public Bill_Fragnment_Da_Huy() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_bill__fragnment__da__huy, container, false);
        recyclerView = view.findViewById(R.id.rclbilldahuyadmin);
//        arrayList = new ArrayList<>();
//        arrayList = (ArrayList<Bill>) BillDatabase.getInstance(getContext()).billDAO().getlistBillbyStatus(6 ,7);
//        adapter = new HistoryAdapter(arrayList , getContext());
//        LinearLayoutManager manager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(manager);
//        recyclerView.setAdapter(adapter);

        return view;
    }
}