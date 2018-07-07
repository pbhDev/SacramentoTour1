package com.example.android.sacramentotour;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class OneSiteFullScreen extends AppCompatActivity {

    String mNameOfthePlace = "Sacramento";

    ArrayList<SiteData> myListOfSites;
    int itemPosition;

    TextView tvNameOfthePlace;
    TextView tvAddress;
    TextView tvPhoneNumner;
    TextView tvWebsite;
    ImageView imImageResourceID;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_one_site_full_screen);

        Bundle extras = getIntent().getExtras();
        myListOfSites = new ArrayList<>();

        tvNameOfthePlace = findViewById(R.id.site_name1);
        tvAddress = findViewById(R.id.address1);
        tvPhoneNumner = findViewById(R.id.website1);
        tvWebsite = findViewById(R.id.phone_number1);
        imImageResourceID = findViewById(R.id.image_of_site1);

        myListOfSites = extras.getParcelableArrayList("listOfSites");
        itemPosition = extras.getInt("position");

        mNameOfthePlace = myListOfSites.get(itemPosition).getNameOfthePlace();
        tvNameOfthePlace.setText(myListOfSites.get(itemPosition).getNameOfthePlace());
        tvAddress.setText(myListOfSites.get(itemPosition).getAddress());
        tvPhoneNumner.setText(myListOfSites.get(itemPosition).getPhoneNumner());
        tvWebsite.setText(myListOfSites.get(itemPosition).getWebsite());
        imImageResourceID.setImageResource(myListOfSites.get(itemPosition).getImageResourceID());

        actionBar = getSupportActionBar();
        actionBar.setTitle(mNameOfthePlace);
        actionBar.setDisplayHomeAsUpEnabled(true);


    }


}
