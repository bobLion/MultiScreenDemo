package com.sailing.www.multiscreendemo.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.sailing.www.multiscreendemo.R;
import com.sailing.www.multiscreendemo.activity.HorizontalListAdapter;
import com.sailing.www.multiscreendemo.base.BasePadFragment;

/**
 * Created by Bob on 2016/4/5.
 */
public class LeftFragment extends BasePadFragment implements View.OnClickListener{

    private Button btnNextPage,btnNextAnother;
//    private ListView mLvHorizontal;
private RecyclerView mRecyclerView;
    private HorizontalListAdapter horizontalListAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_left, null);
//        mLvHorizontal = (ListView)view.findViewById(R.id.lv_horizontal);
        btnNextPage = (Button)view.findViewById(R.id.btn_next_page);
        btnNextAnother = (Button)view.findViewById(R.id.btn_next_another);
        btnNextPage.setOnClickListener(this);
        btnNextAnother.setOnClickListener(this);
//        horizontalListAdapter = new HorizontalListAdapter(getActivity());
//        mLvHorizontal.setAdapter(horizontalListAdapter);
        mRecyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//		layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        // 设置布局管理器
        mRecyclerView.setLayoutManager(layoutManager);

        String[] dataset = new String[100];
        for (int i = 0; i < dataset.length; i++) {
            dataset[i] = "item" + i;
        }
        RecyclerAdapter mAdapter = new RecyclerAdapter(dataset);
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_next_page:
                AnotherFragment anotherFragment  = new AnotherFragment();
                startToFragment(getActivity(), R.id.layout_container, anotherFragment);
//                startToAnotherFragment(anotherFragment);
                break;
            case R.id.btn_next_another:
                NextAnotherFragment nextAnotherFragment = new NextAnotherFragment();
                startToFragment(getActivity(),R.id.layout_container,nextAnotherFragment);
//                startToAnotherFragment(nextAnotherFragment);
                break;
            default:
                break;
        }
    }


//    private void startToAnotherFragment(Fragment otherFragment) {
//        FragmentManager manager = getFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.replace(R.id.layout_container, otherFragment);
//        transaction.addToBackStack(LeftFragment.class.getName());
//        transaction.commit();
//    }

    public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
        private String[] mDataset;

        /**
         * @Description: TODO
         */
        public RecyclerAdapter(String[] dataset) {
            mDataset = dataset;
        }

        public  class ViewHolder extends RecyclerView.ViewHolder {

            public TextView mTextView;

            /**
             * @Description: TODO
             * @param itemView
             */
            public ViewHolder(View itemView) {
                super(itemView);
                mTextView = (TextView) itemView;
            }
        }

        /**
         * @Method: getItemCount
         * @Description: TODO
         * @return
         * @see android.support.v7.widget.RecyclerView.Adapter#getItemCount()
         */
        @Override
        public int getItemCount() {
            return mDataset.length;
        }

        /**
         * @Method: onBindViewHolder
         * @Description: TODO
         * @param holder
         * @param position
         * @see android.support.v7.widget.RecyclerView.Adapter#onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder,
         *      int)
         */
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.mTextView.setText(mDataset[position]);
        }

        /**
         * @Method: onCreateViewHolder
         * @Description: TODO
         * @param parent
         * @param viewType
         * @return
         * @see android.support.v7.widget.RecyclerView.Adapter#onCreateViewHolder(android.view.ViewGroup,
         *      int)
         */
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = View.inflate(parent.getContext(),
                    android.R.layout.simple_list_item_1, null);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }
    }
}
