package com.sailing.www.multiscreendemo.base;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import java.util.List;

/**
 * Created by Bob on 2016/4/11.
 */
public class BasePadFragment extends Fragment{

    public Context mContext;

    public void startToFragment(Context context,int container,Fragment newFragment){

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container,newFragment);
        transaction.addToBackStack(context.getClass().getName());
        transaction.commit();
    }

}
