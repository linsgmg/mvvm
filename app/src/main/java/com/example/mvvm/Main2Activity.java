package com.example.mvvm;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mvvm.databinding.ActivityMain2Binding;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain2Binding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        dataBinding.setUser(new User("https://ss0.baidu.com/73F1bjeh1BF3odCf/it/u=2004045669,3373563793&fm=85&s=1D24C4141E227E151A9DC993030050AF","美女"));
//        dataBinding.setUser(new User("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg","美女"));
    }
}
