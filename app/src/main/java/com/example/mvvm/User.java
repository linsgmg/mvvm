package com.example.mvvm;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by lin on 2019/5/10.
 */
public class User {
    private String username;
    private String userface;

    public User() {
    }

    public User(String userface, String username) {
        this.userface = userface;
        this.username = username;
    }

    @BindingAdapter("userface")
    public static void getInternetImage(ImageView iv, String userface) {
        Picasso.with(iv.getContext()).load(userface).into(iv);
    }

    public String getUserface() {
        return userface;
    }

    public void setUserface(String userface) {
        this.userface = userface;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}