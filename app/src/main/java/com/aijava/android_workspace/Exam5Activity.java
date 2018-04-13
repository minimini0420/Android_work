package com.aijava.android_workspace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exam5Activity extends AppCompatActivity {
    EditText et_1, et_2;
    Button btn_1;
    TextView tv_1, tv_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam5);
        init();
//        calc(); //

    }

    private void init() {    // R에는 resourse에 있는 모든 것들이 저장된다. 전역변수로!! (정수로)
        et_1 = findViewById(R.id.et_1);
        et_2 = findViewById(R.id.et_2);
        btn_1 = findViewById(R.id.btn_1);
        tv_1 = findViewById(R.id.tv_1);
        tv_2 = findViewById(R.id.tv_2);
    }

    public void calc(View v) {

        String str_1 = et_1.getText().toString();
        String str_2 = et_2.getText().toString();

        if(str_1.equals("") || str_2.equals("")){
            return;  // return을 하면 메소드가 끝나기 때문에 밑에 있는 프로그램이 돌아가지 않는다.
        }

        int int_et_1 = Integer.parseInt(str_1);
        int int_et_2 = Integer.parseInt(str_2);


        int sum = int_et_1 + int_et_2;
        int mul = int_et_1 * int_et_2;

        String result_sum = String.valueOf(sum);
        String result_mul = String.valueOf(mul);

        tv_1.setText(result_sum);
        tv_2.setText(result_mul);
    }
}
