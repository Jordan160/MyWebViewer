package com.jvetter2.mywebviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebsite(View view) {
        Intent intent;

        if(view.getTag().toString().equalsIgnoreCase(getString(R.string.uscd_tag))) {
            intent = new Intent(getApplicationContext(), USCDWebViewActivity.class);
        } else {
            intent = new Intent(getApplicationContext(), MemeWebViewActivity.class);
        }

        startActivity(intent);
    }
}
