package com.batch2.m0nk3y.ourproject;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public AboutFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AboutFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AboutFragment newInstance(String param1, String param2) {
        AboutFragment fragment = new AboutFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    List<AboutUs> memberList;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_about, container, false);

        recyclerView = v.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        memberList = new ArrayList<>();

        memberList.add(new AboutUs(
                1,
                "Minhaz Rahman",
                "20161012010",
                R.drawable.minhaz));

        memberList.add(new AboutUs(
                1,
                "Fahmi Farzana",
                "20161012010",
                R.drawable.fahmi));

        memberList.add(new AboutUs(
                1,
                "Mahbuba Ani",
                "20161012010",
                R.drawable.oni));
        memberList.add(new AboutUs(
                1,
                "Senjuti Biswas",
                "20161017010",
                R.drawable.senjuti));

        memberList.add(new AboutUs(
                1,
                "Minhaz Rahman",
                "20161012010",
                R.drawable.minhaz));

        memberList.add(new AboutUs(
                1,
                "Fahmi Farzana",
                "20161012010",
                R.drawable.fahmi));

        memberList.add(new AboutUs(
                1,
                "Mahbuba Ani",
                "20161012010",
                R.drawable.oni));
        memberList.add(new AboutUs(
                1,
                "Senjuti Biswas",
                "20161017010",
                R.drawable.senjuti));

        AdapterForAbout adapter = new AdapterForAbout(getActivity(),memberList);
        recyclerView.setAdapter(adapter);


        return v;
    }
}
