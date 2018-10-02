package com.batch2.m0nk3y.ourproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterForAbout extends RecyclerView.Adapter<AdapterForAbout.ViewHolder> {


    private Context mCtx;

    private List<AboutUs> memberList;

    public AdapterForAbout(Context mCtx, List<AboutUs> memberList) {
        this.mCtx = mCtx;
        this.memberList = memberList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.id_view, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AboutUs AboutUs = memberList.get(position);

        holder.textViewName.setText(AboutUs.getTitle());
        holder.textViewId.setText(AboutUs.getShortdesc());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(AboutUs.getImage()));

    }

    @Override
    public int getItemCount() {
        return memberList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName, textViewId;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewId = itemView.findViewById(R.id.textViewId);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
