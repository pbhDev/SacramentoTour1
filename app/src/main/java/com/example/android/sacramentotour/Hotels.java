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
        View rootView = inflater.inflate(R.layout.fragment_hotels, container, false);
        ArrayList<SiteData> hotelsArray = new ArrayList<>();

        hotelsArray.add(new SiteData("1209 L St, Sacramento, CA 95814",
                "916-443-1234",
                "https://www.hyatt.com/en-US/hotel/california/hyatt-regency-sacramento/sacra",
                "Hyatt Regency Sacramento", R.drawable.hyattregencysac2));
        hotelsArray.add(new SiteData("926 J St, Sacramento, CA 95814",
                "916-447-2700", "https://www.thecitizenhotel.com/en-us",
                "The Citizen Hotel, Autograph Collection", R.drawable.citizenhotel));
        hotelsArray.add(new SiteData(" 210 Richards Blvd, Sacramento, CA 95811",
                "800-999-689", "http://governorsinnhotel.com/",
                "Governors Inn Hotel", R.drawable.thegovinn));
        hotelsArray.add(new SiteData("1230 J St, Sacramento, CA 95814",
                "916-802-3036", "https://www.theparksac.com/",
                "Sheraton Grand Sacramento Hotel", R.drawable.sheraton));
        hotelsArray.add(new SiteData("1000 Front St, Sacramento, CA 95814",
                "916-444-5464", "http://deltaking.com/",
                "Delta King", R.drawable.deltaking));
        ImageView imageOfThePlace = rootView.findViewById(R.id.imageView_hotel);
        imageOfThePlace.setImageResource(R.drawable.hyattregencysac);

        RecyclerView hotelsListView = rootView.findViewById(R.id.recyclerView_hotels);
        hotelsListView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        RecyclerViewAdapter rAdapter = new RecyclerViewAdapter(hotelsArray, this.getContext());
        hotelsListView.setAdapter(rAdapter);

        return rootView;
    }
}
