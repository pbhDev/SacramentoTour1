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

        businessArray.add(new SiteData(getString(R.string.b1address),
                getString(R.string.b1phone),getString(R.string.b1web),
                getString(R.string.b1name),R.drawable.towercafe ));
        businessArray.add(new SiteData(getString(R.string.b2address),
                getString(R.string.b2phone), getString(R.string.b2web),
                getString(R.string.b2name), R.drawable.scottsseafood));
        businessArray.add(new SiteData(getString(R.string.b3address),
                getString(R.string.b3phone), getString(R.string.b3web),
                getString(R.string.b3name), R.drawable.mix));
        businessArray.add(new SiteData(getString(R.string.b4address),
                getString(R.string.b4phone), getString(R.string.b4web),
                getString(R.string.b4name),R.drawable.thepark ));
        businessArray.add(new SiteData(getString(R.string.b5address),
                getString(R.string.b5phone),getString(R.string.b5web),
                getString(R.string.b5name), R.drawable.gunthers));

        ImageView imageOfThePlace = rootView.findViewById(R.id.imageView_business);
        imageOfThePlace.setImageResource( R.drawable.sacramento);

        RecyclerView businessListView = rootView.findViewById(R.id.recyclerView_businesses);
        businessListView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        RecyclerViewAdapter rAdapter = new RecyclerViewAdapter(businessArray,this.getContext());
        businessListView.setAdapter(rAdapter);

        return rootView;
    }






}


