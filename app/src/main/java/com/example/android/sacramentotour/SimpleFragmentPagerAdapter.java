package com.example.android.sacramentotour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context mContext) {

        super(fm);
        context = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Sightseeing();
        } else if (position == 1){
            return new Businesses();
        } else if (position == 2){
            return new LocalEvents();
        } else {
            return new Hotels();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position){

        switch (position){
            case 0:

                return context.getString(R.string.tab1);
            case 1:
                return context.getString(R.string.tab2);
            case 2:
                return context.getString(R.string.tab3);
            case 3:
                return context.getString(R.string.tab4);
            default:
                return null;
        }
    }


}
