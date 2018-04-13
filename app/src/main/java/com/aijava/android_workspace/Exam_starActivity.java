package com.aijava.android_workspace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Exam_starActivity extends AppCompatActivity {
    EditText et_1;
    TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_star);
        init();

    }

    private void init() {
        et_1 = findViewById(R.id.et_1);
        tv_1 = findViewById(R.id.tv_1);
    }

    public void clkBtn(View v) {
        String num = et_1.getText().toString();
        String str_total = "";
        String str = "*";

        if(num.equals(""))
            return;

        int int_num = Integer.parseInt(num);

        for(int i = 0; i<=int_num; i++){
            for(int j = 0; j<i; j++){
                str_total += str;
            }
            str_total+="\n";
        }

        tv_1.setText(str_total);
    }
}
