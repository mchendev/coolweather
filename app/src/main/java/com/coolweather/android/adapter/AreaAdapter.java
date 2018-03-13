package com.coolweather.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.coolweather.android.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fang on 2018/3/12.
 */

public class AreaAdapter extends BaseAdapter {

    private Context context;
    private List<String> areaData = new ArrayList<>();

    public AreaAdapter(Context context,List<String> areaData) {
        this.context = context;
        this.areaData = areaData;
    }

    @Override
    public int getCount() {
        return areaData.size();
    }

    @Override
    public Object getItem(int i) {
        return areaData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_area,viewGroup,false);
            holder = new ViewHolder();
            holder.tv_area = view.findViewById(R.id.tv_area);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tv_area.setText(areaData.get(i));
        return view;
    }

    class ViewHolder {
        TextView tv_area;
    }
}
