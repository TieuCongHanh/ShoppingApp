package com.example.projectdatt.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.projectdatt.Fragment.Bill.Bill_Fragnment_Da_Huy;
import com.example.projectdatt.Fragment.Bill.Bill_Fragnment_Xac_Nhan;
import com.example.projectdatt.Fragment.Bill.Bill_Fragnment_Da_Nhan;

public class ViewPagerAdapterAdminBill extends FragmentStateAdapter {


    public ViewPagerAdapterAdminBill(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Bill_Fragnment_Xac_Nhan();


            case 1:
                return new Bill_Fragnment_Da_Nhan();

            case 2:
                return new Bill_Fragnment_Da_Huy();

            default:
                return new Bill_Fragnment_Xac_Nhan();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}