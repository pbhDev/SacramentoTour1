package com.example.android.sacramentotour;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>  {

    private ArrayList<SiteData> listSitesData;
    private Context context;
    SiteData currentSite;
    int mainImageViewID;

    int currentPosition;

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
        holder.img_front_pic.setImageResource(currentSite.getImageResourceID());
        mainImageViewID = currentSite.getImageResourceID();
        currentPosition= holder.getAdapterPosition();
    }

    @Override
    public int getItemCount() {
        return listSitesData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tv_nameOftheSite;
        private ImageView img_front_pic;

        private ViewHolder(View itemView) {
            super(itemView);
            tv_nameOftheSite = itemView.findViewById(R.id.site_name);
            img_front_pic = itemView.findViewById(R.id.image_of_site);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, OneSiteFullScreen.class);
            if(currentSite != null){
                intent.putParcelableArrayListExtra("listOfSites", listSitesData);
                intent.putExtra("position",getAdapterPosition() );
                context.startActivity(intent);
            }
        }
    }
}
