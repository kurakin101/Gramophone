package com.j2d.nudle.gramophone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;

import static com.j2d.nudle.gramophone.R.id.recycle_view_album;
import static com.j2d.nudle.gramophone.R.id.recyclerv_view;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    private static final String TAG = "MainActivity";

    private ArrayList<String> aNames = new ArrayList<>();
    private ArrayList<String> aImageUrls = new ArrayList<>();
    private HashMap<String, String> aDescriptions = new HashMap<>();


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_two, container, false);
//        Log.d(TAG, "onCreate: started.");
//        RecyclerView recyclerView =  v.findViewById(recycle_view_album);
//        MusicAdapter adapter = new MusicAdapter(getContext());
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        initImageBitmaps();
//        initRecyclerView(v);
        return v;
    }
    //заполняем список содержимым
//    private void initImageBitmaps(){
//        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
//
//        aImageUrls.add("https://outstyle.org/images/news/2/6/9/Cu7l3YWhDE8.jpg");
//        aNames.add("Night Lovell");
//
//        aImageUrls.add("https://f4.bcbits.com/img/a3122189327_16.jpg");
//        aNames.add("KLNV");
//
//        aImageUrls.add("https://themoscowtimes.com/static/uploads/events/2018/1/13/9bf854b016e8454ea6a26c05d8eafd15.jpg");
//        aNames.add("Bones");
//
//        aImageUrls.add("https://scontent-ort2-1.cdninstagram.com/vp/bd9389358ff9bdda3e11881dc5458998/5B671C4A/t51.2885-15/e35/p320x320/23098878_503791613318823_1925708690933940224_n.jpg?ig_cache_key=MTYzNzMxNjcyMjUxMTI3MDAwNQ%3D%3D.2");
//        aNames.add("Scarlxrd");
//
//        aImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSPrVOWKsk7ELLDGfo8DUhC-LT_ftDyi70dGRbdIMyKfVNSnph");
//        aNames.add("Lil Yachty");
//
//        aImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0HvePQa5q7Q57plX1PFYLEQDm3_lQKkKBshBYrL_vGax8Bwu7");
//        aNames.add("Beatles");
//
//        aImageUrls.add("https://is2-ssl.mzstatic.com/image/thumb/Features4/v4/bf/ba/ff/bfbaff63-caf9-1e2d-7991-cee13297e955/dj.mtwvirjq.jpg/1200x630bb.jpg");
//        aNames.add("AC&DC");
//
//        aImageUrls.add("https://thenypost.files.wordpress.com/2018/02/sting.jpg?quality=90&strip=all&w=618&h=410&crop=1");
//        aNames.add("Sting");
//
//        aDescriptions.put("Scarlxrd", "SASADSADSAD");
//
//
//    }
//
//    public void initRecyclerView(View v){
//        RecyclerView recyclerView = v.findViewById(recycle_view_album);
//        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(), aNames, aImageUrls, aDescriptions);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//    }


}
