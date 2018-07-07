package com.example.android.sacramentotour;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class Businesses extends Fragment   {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_businesses, container, false);

        ArrayList<SiteData> businessArray = new ArrayList<>();


        businessArray.add(new SiteData(2,"1518 Broadway Ave, Sacramento, CA 95818",
                "916-441-0222","http://towercafe.com",
                "Tower Cafe",R.drawable.towercafe ));

        businessArray.add(new SiteData(2, "4800 Riverside Boulevard, Sacramento, CA 95822",
                "916-443-8400", "http://www.scottsseafood.net/",
                "Scott's Seafood", R.drawable.scottsseafood));

        businessArray.add(new SiteData(2,"1525 L St, Sacramento, CA 95818",
                "916-442-8899", "https://mixdowntown.net/",
                "Mix Downtown", R.drawable.mix));

        businessArray.add(new SiteData(2, "1116 15th St, Sacramento, CA 95814",
                "916-802-3036", "https://www.theparksac.com/",
                "The Park Sacramento",R.drawable.thepark ));

        businessArray.add(new SiteData(2,"2801 Franklin Boulevard, Sacramento, CA 95818",
                "916-457-6646","http://gunthersicecream.com/",
                "Gunther’s Quality Ice Cream", R.drawable.gunthers));


        ImageView imageOfThePlace = rootView.findViewById(R.id.imageView_business);
        imageOfThePlace.setImageResource( R.drawable.sacramento);

        RecyclerView businessListView = rootView.findViewById(R.id.recyclerView_businesses);
        businessListView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        RecyclerViewAdapter rAdapter = new RecyclerViewAdapter(businessArray,this.getContext());
        businessListView.setAdapter(rAdapter);

        return rootView;
    }






}


