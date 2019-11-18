package com.j2d.nudle.gramophone;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by digit_000 on 19.04.2018.
 */

public class MusicViewHolder extends RecyclerView.ViewHolder {

    TextView titleTextView;
    ImageView posterImageView;
    View itemView;


    public MusicViewHolder(View itemView) {
        super(itemView);

        this.itemView = itemView;

        titleTextView = itemView.findViewById(R.id.image);
        posterImageView = itemView.findViewById(R.id.poster_image_view);
    }
}
