package com.sailing.www.multiscreendemo.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sailing.www.multiscreendemo.activity.MainActivity;
import com.sailing.www.multiscreendemo.R;
import com.sailing.www.multiscreendemo.activity.PatrolActivity;

/**
 * Created by Bob on 2016/4/5.
 */
public class RightFragment extends Fragment implements View.OnClickListener{

    private Button btnTomain,btnToNext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.layout_right,null);
        btnTomain = (Button)view.findViewById(R.id.btn_to_main);
        btnToNext = (Button)view.findViewById(R.id.btn_to_nextactivity);
        btnTomain.setOnClickListener(this);
        btnToNext.setOnClickListener(this );
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_to_main:
                Intent intent  = new Intent(getActivity(),MainActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.btn_to_nextactivity:
                Intent intent1 = new Intent(getActivity(), PatrolActivity.class);
                getActivity().startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
