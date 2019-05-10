package com.example.mvvm;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by lin on 2019/5/10.
 */
public class Food {
    private String description;
    private String img;
    private String keywords;
    private String summary;

    public Food() {
    }

    public Food(String description, String img, String keywords, String summary) {
        this.description = description;
        this.img = img;
        this.keywords = keywords;
        this.summary = summary;
    }

    @BindingAdapter("img")
    public static void loadInternetImage(ImageView iv, String img) {
        Picasso.with(iv.getContext()).load(img).into(iv);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}