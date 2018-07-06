package com.example.android.sacramentotour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>  {

    private ArrayList<SiteData> listSitesData;
    private Context context;
    SiteData currentSite;
    int mainImageViewID;

    public int getCurrentPosition() {
        return currentPosition;
    }

    int currentPosition;



    public int getMainImageView() {
        return mainImageViewID;
    }






    public RecyclerViewAdapter(ArrayList<SiteData> listSitesData, Context context) {
        this.listSitesData = listSitesData;
        this.context = context;



    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_site_data,parent,false);



        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        currentSite = listSitesData.get(position);


        holder.tv_nameOftheSite.setText(currentSite.getNameOfthePlace());
        holder.tv_addresse.setText(currentSite.getAddress());
        holder.tv_phone.setText(currentSite.getPhoneNumner());
        holder.tv_website.setText(currentSite.getWebsite());
        holder.img_front_pic.setImageResource(currentSite.getImageResourceID());
        mainImageViewID = currentSite.getImageResourceID();
        currentPosition= holder.getAdapterPosition();




    }

    @Override
    public int getItemCount() {
        return listSitesData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_nameOftheSite;
        private TextView tv_addresse;
        private TextView tv_phone;
        private TextView tv_website;
        private ImageView img_front_pic;



        private ViewHolder(View itemView) {
            super(itemView);

            tv_nameOftheSite = itemView.findViewById(R.id.site_name);
            tv_addresse = itemView.findViewById(R.id.address);
            tv_phone = itemView.findViewById(R.id.phone_number);
            tv_website = itemView.findViewById(R.id.website);
            img_front_pic = itemView.findViewById(R.id.image_of_site);


        }



    }





}
