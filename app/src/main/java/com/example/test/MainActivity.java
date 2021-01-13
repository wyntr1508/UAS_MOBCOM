package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final EditText editTextTextEmailAddress = (EditText) findViewById(R.id.editTextTextEmailAddress);//get the id for edit text
//        Button button = (Button) findViewById(R.id.button);//get the id for button
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (editTextTextEmailAddress.getText().toString() != null)//check whether the entered text is not null
//                {
//                    Toast.makeText(getApplicationContext(), editTextTextEmailAddress.getText().toString(), Toast.LENGTH_LONG).show();//display the text that you entered in edit text
//                }
//            }
//        });

    }
}