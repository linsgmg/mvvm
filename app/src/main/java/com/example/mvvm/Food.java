package com.example.mvvm;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by lin on 2019/5/10.
 */
public class Food extends BaseObservable {
    private String description;
    private String img;
    private String keywords;
    private String summary;
    private int index;

    public Food() {
    }

    //    public Food(String description, String img, String keywords, String summary) {
//        this.description = description;
//        this.img = img;
//        this.keywords = keywords;
//        this.summary = summary;
//    }
    public Food(String description, String img, String keywords, int index) {
        this.description = description;
        this.img = img;
        this.keywords = keywords;
        this.index = index;
    }

    @BindingAdapter("img")
    public static void loadInternetImage(ImageView iv, String img) {
        Picasso.with(iv.getContext()).load(img).into(iv);
    }

    public void onItemClick(View view) {
        if (index % 2 == 1) {
            Toast.makeText(view.getContext(), getDescription(), Toast.LENGTH_SHORT).show();
        }
        setImg("http://img2.imgtn.bdimg.com/it/u=3157709739,1819601757&fm=26&gp=0.jpg");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Bindable
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
        notifyPropertyChanged(com.example.mvvm.BR.img);
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}