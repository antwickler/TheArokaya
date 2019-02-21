package com.antwickler.thearokaya.Food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.antwickler.thearokaya.R;

import java.util.ArrayList;
import java.util.Locale;

public class GridListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<FoodModel> arrayList;
    private LayoutInflater inflater;
    private boolean isListView;
    private ArrayList<FoodModel> filterArrayList;

    public GridListAdapter(Context context, ArrayList<FoodModel> arrayList, boolean isListView) {
        this.context = context;
        this.arrayList = arrayList;
        this.isListView = isListView;
        inflater = LayoutInflater.from(context);

        this.filterArrayList = new ArrayList<>();
        this.filterArrayList.addAll(arrayList);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = inflater.inflate(R.layout.list_custom_row_layout, viewGroup, false);

            viewHolder.element = (TextView) view.findViewById(R.id.element_label);
            viewHolder.food = (TextView) view.findViewById(R.id.food_label);
            viewHolder.herb = (TextView) view.findViewById(R.id.herb_label);

            view.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) view.getTag();

        FoodModel model = arrayList.get(i);
        viewHolder.element.setText(model.getElement());
        viewHolder.food.setText(model.getFood());
        viewHolder.herb.setText(model.getHerb());

        return view;
    }

    private class ViewHolder {
        private TextView element, food, herb;
    }

    // Filter Class to filter data
    public void filter(FilterType filterType, String charText, boolean isSearchWithPrefix) {
        //If Filter type is NAME and EMAIL then only do lowercase, else in case of NUMBER no need to do lowercase because of number format
        if (filterType == FilterType.ELEMENT || filterType == FilterType.HERB)
            charText = charText.toLowerCase(Locale.getDefault());

        arrayList.clear();//Clear the main ArrayList

        //If search query is null or length is 0 then add all filterList items back to arrayList
        if (charText.length() == 0) {
            arrayList.addAll(filterArrayList);
        } else {
            //Else if search query is not null do a loop to all filterList items
            for (FoodModel model : filterArrayList) {
                //Now check the type of search filter
                switch (filterType) {
                    case ELEMENT:
                        if (isSearchWithPrefix) {
                            //if STARTS WITH radio button is selected then it will match the exact NAME which match with search query
                            if (model.getElement().toLowerCase(Locale.getDefault()).startsWith(charText))
                                arrayList.add(model);
                        } else {
                            //if CONTAINS radio button is selected then it will match the NAME wherever it contains search query
                            if (model.getElement().toLowerCase(Locale.getDefault()).contains(charText))
                                arrayList.add(model);
                        }
                        break;

                    case HERB:
                        if (isSearchWithPrefix) {
                            //if STARTS WITH radio button is selected then it will match the exact EMAIL which match with search query
                            if (model.getHerb().toLowerCase(Locale.getDefault()).startsWith(charText))
                                arrayList.add(model);
                        } else {
                            //if CONTAINS radio button is selected then it will match the EMAIL wherever it contains search query
                            if (model.getHerb().toLowerCase(Locale.getDefault()).contains(charText))
                                arrayList.add(model);
                        }
                        break;

                    case FOOD:
                        if (isSearchWithPrefix) {
                            //if STARTS WITH radio button is selected then it will match the exact NUMBER which match with search query
                            if (model.getFood().startsWith(charText))
                                arrayList.add(model);
                        } else {
                            //if CONTAINS radio button is selected then it will match the NUMBER wherever it contains search query
                            if (model.getFood().contains(charText))
                                arrayList.add(model);
                        }
                        break;
                }
            }
        }
        notifyDataSetChanged();
    }
}
