package com.sailing.www.multiscreendemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sailing.www.multiscreendemo.R;

/**
 * Created by Bob on 2016/4/11.
 */
public class ThirdFragment extends Fragment {
    private TextView tvName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_third_fragment, null);
        tvName = (TextView)view.findViewById(R.id.tv_name);
        Bundle bundle  = getArguments();
        String name =bundle.getString("name");
        String password = bundle.getString("password");
        if(null != name){
            tvName.setText(name+"    "+password);
        }
        return view;
    }
}
