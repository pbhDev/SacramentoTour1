package com.example.android.sacramentotour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;


public class LocalEvents extends Fragment {

    ArrayList<SiteData> localEventArray;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_businesses, container, false);

        ImageView imageOfThePlace = rootView.findViewById(R.id.imageView_business);
        imageOfThePlace.setImageResource( R.drawable.goldenonecenter);

        localEventArray = new ArrayList<>();
        localEventArray.add(new SiteData(getString(R.string.l1address),
                getString(R.string.l1phone), getString(R.string.l1web),
                getString(R.string.l1name), R.drawable.statefair));
        localEventArray.add(new SiteData(getString(R.string.l2address),
                getString(R.string.l2phone), getString(R.string.l2web),
                getString(R.string.l2name), R.drawable.sacarena));
        localEventArray.add(new SiteData(getString(R.string.l3address),
                getString(R.string.l3phone), getString(R.string.l3web),
                getString(R.string.l3name), R.drawable.sacrep ));
        localEventArray.add(new SiteData(getString(R.string.l4address),
                getString(R.string.l4phone),getString(R.string.l4web),
                getString(R.string.l4name), R.drawable.hornblower));
        RecyclerView localEventListView = rootView.findViewById(R.id.recyclerView_businesses);
        localEventListView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        RecyclerViewAdapter rAdapter = new RecyclerViewAdapter(localEventArray,this.getContext());
        localEventListView.setAdapter(rAdapter);

        return rootView;
    }


}
