package com.circleciapp;


import android.app.Activity;
import android.os.Bundle;

import com.circleciapp.fragment.LoginFragment;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction().add(R.id.frameLayout, new LoginFragment())
                .addToBackStack(LoginFragment.class.getSimpleName())
                .commit();
    }
}
