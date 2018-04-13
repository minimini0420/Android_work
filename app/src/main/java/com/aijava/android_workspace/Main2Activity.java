package com.aijava.android_workspace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button btn_4;
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2); // layout 을 쓰겠다고 한거

//        btn_4 = findViewById(R.id.btn_4);  // 레이아웃중에  주소값이 해당하는 아이를 만들어!! 이런말임
//
//        String str = btn_4.getText().toString();  // btn_4에 있는 Text 값을 가져온다(BUTTON4)
//        btn_4.setText("버튼4");
//        btn_4.getText();

        btn_4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(v.getId()==R.id.btn_4){
                    String str = btn_4.getText().toString();
                    if(str.equals("버튼4")){
                        btn_4.setText("BUTTON4");
                    } else {
                        btn_4.setText("버튼4");
                    }
                }
//                Toast
//                        .makeText(getApplicationContext(), "Thanks!!",Toast.LENGTH_SHORT)
//                        .show();  // 이벤트가 걸려있는것
            }
        }); //이벤트 거는 방법

    }

    public void clkBtn(View v) {
        if(v.getId()==R.id.btn_1){// getid로 주소값을 찾는것
            Toast
                    .makeText(getApplicationContext(), "Hi",Toast.LENGTH_SHORT)
                    .show();  // 이벤트가 걸려있는것
        } else if(v.getId()==R.id.btn_3){
            Toast
                    .makeText(getApplicationContext(), "Bye",Toast.LENGTH_SHORT)
                    .show();  // 이벤트가 걸려있는것
        }



    }

    public void clkBtn2(View v) {
        Toast // 이벤트가 걸려있는것
        .makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT)
        .show();
    }
}
