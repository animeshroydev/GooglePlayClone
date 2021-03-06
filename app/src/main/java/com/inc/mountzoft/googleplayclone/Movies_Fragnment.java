package com.inc.mountzoft.googleplayclone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Movies_Fragnment extends Fragment {

    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<Integer> subList1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            subList1.add(i);
        }


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(subList1);
        }

        View view = inflater.inflate(R.layout.movies_fragnment_layout, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        VerticalRecyclerAdapter adapter = new VerticalRecyclerAdapter(list);
        mRecyclerView.setAdapter(adapter);
        return view;
    }
}
