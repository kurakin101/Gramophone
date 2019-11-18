package com.j2d.nudle.gramophone;

import java.io.Serializable;

/**
 * Created by digit_000 on 19.04.2018.
 */

public class Music implements Serializable {
    public  String title;
    public String posterPath;

    public Music(String title, String posterPath) {
        this.title = title;
        this.posterPath = posterPath;
    }
}
