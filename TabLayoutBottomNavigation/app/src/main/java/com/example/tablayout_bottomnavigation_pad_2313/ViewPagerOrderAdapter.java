package com.example.tablayout_bottomnavigation_pad_2313;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerOrderAdapter extends FragmentStateAdapter {
    public ViewPagerOrderAdapter(@NonNull FragmentOrder fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new TabOne();
            case 1: return new TabTwo();
            case 2: return new TabThree();
            default: return new TabOne();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }


}
