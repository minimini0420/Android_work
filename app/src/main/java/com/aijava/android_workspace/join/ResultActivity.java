package com.aijava.android_workspace.join;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.aijava.android_workspace.R;

public class ResultActivity extends AppCompatActivity {

    TextView tv_1, tv_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        init();
        Intent intent = getIntent();
        setValue(intent);
    }

    private void init() {
        tv_1 = findViewById(R.id.tv_1);
        tv_2 = findViewById(R.id.tv_2);
    }

    public void setValue(Intent intent) {
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age",0);

        tv_1.setText(name);
        tv_2.setText(String.valueOf(age));
    }
}
