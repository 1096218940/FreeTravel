package com.ma.freetravel.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ma.freetravel.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BournFragment extends Fragment {

    private View view;
    private ListView listView_place;
    private String[] adapterData=new String[]{"去哪玩","亚洲","欧洲","北美洲","非洲","南美洲","大洋洲"};
    private ArrayAdapter <String> lvAdapter;


    public BournFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_bourn, container, false);
        initView();
        initAdapter();

        return view;
    }

    private void initAdapter() {
        lvAdapter =new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,adapterData);
        listView_place.setAdapter(lvAdapter);
    }

    private void initView() {
        listView_place = ((ListView) view.findViewById(R.id.lv_place));
    }

}
