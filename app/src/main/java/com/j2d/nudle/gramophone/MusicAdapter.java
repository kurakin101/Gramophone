package com.j2d.nudle.gramophone;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by digit_000 on 19.04.2018.
 */

public class MusicAdapter extends RecyclerView.Adapter<MusicViewHolder>{

    Context context;

    public MusicAdapter(Context context) {
        this.context = context;
    }

    @Override
    public MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater =  LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.layout_music_item,parent,false);
        MusicViewHolder vH =  new MusicViewHolder(v);

        return vH;
    }

    @Override
    public void onBindViewHolder(MusicViewHolder holder, int position) {
        final Music music = DataBase.MUSICS[position];
        String title  = music.title;
        holder.titleTextView.setText(title);
        int randomColor  = 0xFF000000 + (int) (Math.random() * 0x01000000);
        holder.posterImageView.setBackgroundColor(randomColor);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMusicActivity(music);
            }
        });
    }

    @Override
    public int getItemCount() {
        return DataBase.MUSICS.length;
    }

    private  void startMusicActivity (Music music)  {
        Intent intent = new Intent(context,MusicActivity.class);
        intent.putExtra("MUSIC", music);
        context.startActivity(intent);
    }
}
