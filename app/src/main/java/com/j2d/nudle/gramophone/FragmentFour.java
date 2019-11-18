package com.j2d.nudle.gramophone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;

import static com.j2d.nudle.gramophone.R.id.recyclerv_view;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFour extends Fragment {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private HashMap<String, String> mDescriptions = new HashMap<>();


    public FragmentFour() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View v = inflater.inflate(R.layout.fragment_fragment_four, container, false);
        Log.d(TAG, "onCreate: started.");
        RecyclerView recyclerView =  v.findViewById(recyclerv_view);
        MusicAdapter adapter = new MusicAdapter(getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        initImageBitmaps();
        initRecyclerView(v);
        return v;
    }


    //заполняем список содержимым
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://outstyle.org/images/news/2/6/9/Cu7l3YWhDE8.jpg");
        mNames.add("Night Lovell");

        mImageUrls.add("https://f4.bcbits.com/img/a3122189327_16.jpg");
        mNames.add("KLNV");

        mImageUrls.add("https://themoscowtimes.com/static/uploads/events/2018/1/13/9bf854b016e8454ea6a26c05d8eafd15.jpg");
        mNames.add("Bones");

        mImageUrls.add("https://scontent-ort2-1.cdninstagram.com/vp/bd9389358ff9bdda3e11881dc5458998/5B671C4A/t51.2885-15/e35/p320x320/23098878_503791613318823_1925708690933940224_n.jpg?ig_cache_key=MTYzNzMxNjcyMjUxMTI3MDAwNQ%3D%3D.2");
        mNames.add("Scarlxrd");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSPrVOWKsk7ELLDGfo8DUhC-LT_ftDyi70dGRbdIMyKfVNSnph");
        mNames.add("Lil Yachty");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0HvePQa5q7Q57plX1PFYLEQDm3_lQKkKBshBYrL_vGax8Bwu7");
        mNames.add("Beatles");

        mImageUrls.add("https://is2-ssl.mzstatic.com/image/thumb/Features4/v4/bf/ba/ff/bfbaff63-caf9-1e2d-7991-cee13297e955/dj.mtwvirjq.jpg/1200x630bb.jpg");
        mNames.add("AC&DC");

        mImageUrls.add("https://thenypost.files.wordpress.com/2018/02/sting.jpg?quality=90&strip=all&w=618&h=410&crop=1");
        mNames.add("Sting");

        mDescriptions.put("Scarlxrd", "SASADSADSAD");


    }

    public void initRecyclerView(View v){
        RecyclerView recyclerView = v.findViewById(recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(), mNames, mImageUrls, mDescriptions);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }


}
