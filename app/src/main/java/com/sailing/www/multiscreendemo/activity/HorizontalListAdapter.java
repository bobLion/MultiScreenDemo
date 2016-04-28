package com.sailing.www.multiscreendemo.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sailing.www.multiscreendemo.R;

/**
 * Created by Bob on 2016/4/26.
 */
public class HorizontalListAdapter extends BaseAdapter{
    private Context mContext;

    public HorizontalListAdapter(Context context){
        this.mContext = context;
    }
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_horizontal_list,null);
        TextView textView = (TextView)convertView.findViewById(R.id.tv_horizontal);
        return convertView;
    }
}
