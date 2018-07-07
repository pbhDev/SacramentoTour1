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
        View rootView = inflater.inflate(R.layout.fragment_local_events, container, false);

        ImageView imageOfThePlace = rootView.findViewById(R.id.imageview_localevent);
        imageOfThePlace.setImageResource( R.drawable.goldenonecenter);

        localEventArray = new ArrayList<>();
        localEventArray.add(new SiteData(3,"1600 Exposition Blvd, Sacramento, CA 95815",
                "916-263-3247", "http://www.castatefair.org/special-events/",
                "California State Fair", R.drawable.statefair));

        localEventArray.add(new SiteData(3,"500 David J Stern Walk, Sacramento, CA 95814",
                "888-915-4647", "https://www.golden1center.com/events",
                "Golden 1 Center", R.drawable.sacarena));

        localEventArray.add(new SiteData(3, "1600 Exposition Blvd, Sacramento, CA 95815",
                "(916) 307-6100", "https://www.sacrepublicfc.com/",
                "Sacramento Republic FC", R.drawable.sacrep ));

        localEventArray.add(new SiteData(3, "1206 Front Street, Sacramento CA 95814",
                "916-446-1185","https://www.hornblower.com/home/sac",
                "Hornblower", R.drawable.hornblower));

        RecyclerView localEventListView = rootView.findViewById(R.id.recyvlerView_LocalEvent);
        localEventListView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        RecyclerViewAdapter rAdapter = new RecyclerViewAdapter(localEventArray,this.getContext());
        localEventListView.setAdapter(rAdapter);

        return rootView;
    }


}
