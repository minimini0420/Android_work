package com.aijava.android_workspace.join;

import android.content.Intent;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.aijava.android_workspace.R;

public class JoinActivity extends AppCompatActivity {
    EditText et_1, et_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        init();
    }

    private void init() {
        et_1 = findViewById(R.id.et_1);
        et_2 = findViewById(R.id.et_2);

    }

    public void clkConfirm(View v) {
        String name = et_1.getText().toString();
        String age = et_2.getText().toString();
        moveToIntent(name,age);
    }

    private void moveToIntent(String name, String age) {
        Intent intent = new Intent(JoinActivity.this,ResultActivity.class);

        intent.putExtra("name",name);
        intent.putExtra("age",Integer.parseInt(age));

        startActivity(intent); //안드로이드 스튜디오에다 다른 액티비티를 띄워 달라 명령령하는것
       finish();   // 메모리를 날려버리는 것 없으면 그대로 남아있는다.
    }
}
