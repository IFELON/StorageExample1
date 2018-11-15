package com.example.suriya.storageexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        e1=findViewById(R.id.names);
        e2=findViewById(R.id.email);
        e3=findViewById(R.id.pass);
        e4=findViewById(R.id.phone);
        b1=findViewById(R.id.button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=e1.getText().toString();
                String email=e2.getText().toString();
                String password=e3.getText().toString();
                String phone=e4.getText().toString();
                if (name.isEmpty()){
                    e1.setError("please enter name");
                    return;
                }
                if (email.isEmpty()){
                    e2.setError("please enter  valid email");
                    return;

                }
                if (password.isEmpty()){
                    e3.setError("please enter valid password");
                    return;
                }
                if (phone.isEmpty()){
                    e4.setError("please enter correct phone number");
                    return;
                }


            }
        });
    }
}
