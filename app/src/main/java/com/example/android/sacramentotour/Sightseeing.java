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


public class Sightseeing extends Fragment {

    ArrayList<SiteData> sightseeingArray;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_sightseeing, container, false);
        ImageView imageOfThePlace = rootView.findViewById(R.id.imageView_site);
        imageOfThePlace.setImageResource( R.drawable.oldsacmain);

        sightseeingArray =  new ArrayList<>();

        sightseeingArray.add(new SiteData("10th & L St, Sacramento, CA 95814",
                "916-324-0333","http://assembly.ca.gov/statecapitol",
                "Capitol",R.drawable.capitol));
        sightseeingArray.add(new SiteData(" 342 L St, Sacramento, CA 95814",
                "916-808-8795","http://www.cityofsacramento.org/",
                "Tower Bridge",R.drawable.goldenbridge));
        sightseeingArray.add(new SiteData("3930 W Land Park Dr, Sacramento, CA 95822",
                " 916-808-5888","https://www.saczoo.org/",
                "Sacramento Zoo",R.drawable.saczoo));
        sightseeingArray.add(new SiteData("125 I St, Sacramento, CA 95814",
                "916-323-9280","http://www.parks.ca.gov/?page_id=668",
                "California State Railroad Museum",R.drawable.trainmuseum));
        sightseeingArray.add(new SiteData("1014 2nd St #200, Sacramento, CA 95814",
                "916-970-5226", "http://oldsacramento.com/about/history",
                "Old Sacramento", R.drawable.oldsac));

        RecyclerView siteListView = rootView.findViewById(R.id.recyvlerView_sightseeing);
        siteListView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        RecyclerViewAdapter rAdapter = new RecyclerViewAdapter(sightseeingArray,this.getContext());
        siteListView.setAdapter(rAdapter);

        return rootView;
    }


}
