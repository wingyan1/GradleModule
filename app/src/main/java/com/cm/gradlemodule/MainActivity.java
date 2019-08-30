package com.cm.gradlemodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.cm.wingsdk.WingTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void wingBtnClick(View v) {
        WingTest.wing(this);
    }
}
