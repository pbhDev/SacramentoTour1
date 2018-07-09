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

public class Hotels extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_businesses, container, false);
        ArrayList<SiteData> hotelsArray = new ArrayList<>();

        hotelsArray.add(new SiteData(getString(R.string.h1address),
                getString(R.string.h1phone),
                getString(R.string.h1web),
                getString(R.string.h1name), R.drawable.hyattregencysac2));
        hotelsArray.add(new SiteData(getString(R.string.h2address),
                getString(R.string.h2phone), getString(R.string.h2web),
                getString(R.string.h2name), R.drawable.citizenhotel));
        hotelsArray.add(new SiteData(getString(R.string.h3address),
                getString(R.string.h3phone), getString(R.string.h3web),
                getString(R.string.h3name), R.drawable.thegovinn));
        hotelsArray.add(new SiteData(getString(R.string.h4address),
                getString(R.string.h4phone), getString(R.string.h4web),
                getString(R.string.h4name), R.drawable.sheraton));
        hotelsArray.add(new SiteData(getString(R.string.h5address),
                getString(R.string.h5phone), getString(R.string.h5web),
                getString(R.string.h5name), R.drawable.deltaking));
        ImageView imageOfThePlace = rootView.findViewById(R.id.imageView_business);
        imageOfThePlace.setImageResource(R.drawable.hyattregencysac);

        RecyclerView hotelsListView = rootView.findViewById(R.id.recyclerView_businesses);
        hotelsListView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        RecyclerViewAdapter rAdapter = new RecyclerViewAdapter(hotelsArray, this.getContext());
        hotelsListView.setAdapter(rAdapter);

        return rootView;
    }
}
