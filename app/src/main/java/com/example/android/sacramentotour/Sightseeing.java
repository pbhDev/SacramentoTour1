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

public class Sightseeing extends Fragment {

    ArrayList<SiteData> sightseeingArray;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_businesses, container, false);
        ImageView imageOfThePlace = rootView.findViewById(R.id.imageView_business);
        imageOfThePlace.setImageResource( R.drawable.oldsacmain);

        sightseeingArray =  new ArrayList<>();

        sightseeingArray.add(new SiteData(getString(R.string.s1address),
                getString(R.string.s1phone),getString(R.string.s1web),
                getString(R.string.s1name),R.drawable.capitol));
        sightseeingArray.add(new SiteData(getString(R.string.s2address),
                getString(R.string.s2phone),getString(R.string.s2web),
                getString(R.string.s2name),R.drawable.goldenbridge));
        sightseeingArray.add(new SiteData(getString(R.string.s3address),
                getString(R.string.s3phone),getString(R.string.s3web),
                getString(R.string.s3name),R.drawable.saczoo));
        sightseeingArray.add(new SiteData(getString(R.string.s4address),
                getString(R.string.s4phone),getString(R.string.s4web),
                getString(R.string.s4name),R.drawable.trainmuseum));
        sightseeingArray.add(new SiteData(getString(R.string.s5address),
                getString(R.string.s5phone), getString(R.string.s5web),
                getString(R.string.s5name), R.drawable.oldsac));

        RecyclerView siteListView = rootView.findViewById(R.id.recyclerView_businesses);
        siteListView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        RecyclerViewAdapter rAdapter = new RecyclerViewAdapter(sightseeingArray,this.getContext());
        siteListView.setAdapter(rAdapter);

        return rootView;
    }
}
