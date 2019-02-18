package com.antwickler.thearokaya.Basic;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antwickler.thearokaya.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomHolder> {

    private Context mContext;
    private List<CustomItem> mItems;

    public CustomAdapter(Context context, List<CustomItem> items) {
        mContext = context;
        mItems = items;
    }

    public interface OnItemClickListener {
        void onItemClick(View item, int position);
    }

    private OnItemClickListener mListener;

    public void setOnClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public CustomHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        final View view = inflater.inflate(R.layout.custom_layout, parent, false);
        final CustomHolder vHolder = new CustomHolder(view);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null) {
                    int pos = vHolder.getAdapterPosition();
                    if(pos != RecyclerView.NO_POSITION) {
                        mListener.onItemClick(view, pos);
                    }
                }
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(CustomHolder vHolder, int position) {
        CustomItem item = mItems.get(position);
        vHolder.textViewName.setText(item.textName);
        vHolder.textViewDetail.setText(item.textDetail);
    }
}