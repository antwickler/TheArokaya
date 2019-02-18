package com.antwickler.thearokaya.Basic;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.antwickler.thearokaya.R;

public class CustomHolder extends RecyclerView.ViewHolder {

    public TextView textViewName;
    public TextView textViewDetail;

    public CustomHolder(View convertView) {
        super(convertView);
        textViewName = (TextView)convertView.findViewById(R.id.textView_name);
        textViewDetail = (TextView)convertView.findViewById(R.id.textView_detail);
    }
}
