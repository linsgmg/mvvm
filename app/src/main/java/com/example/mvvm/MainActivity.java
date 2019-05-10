package com.example.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserEntity userEntity = new UserEntity();
//        userEntity.setUsername("小明");
        userEntity.setNickname("面朝大海，心暖花开");
        userEntity.setAge(32);
        activityMainBinding.setUser(userEntity);
    }
}
