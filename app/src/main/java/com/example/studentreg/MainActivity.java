package com.example.studentreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        EditText ed1 = (EditText) findViewById(R.id.ed1);
        EditText ed2 = (EditText) findViewById(R.id.ed2);
        EditText ed3 = (EditText) findViewById(R.id.ed3);
        EditText ed4 = (EditText) findViewById(R.id.edit1);
        EditText ed5 = (EditText) findViewById(R.id.edit3);
        EditText ed6 = (EditText) findViewById(R.id.edit4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Toast.makeText(getApplicationContext(),"Student Roll no="+ed4.getText().toString()+"\n Student your name="+ed1.getText().toString()+"\n Student class"+ed5.getText().toString()+"\n Student Contact No.="+ed2.getText().toString() +"\n Student Email Address"+ed6.getText().toString()+"\n Student Address"+ed3.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });


    }
}