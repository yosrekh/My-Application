package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void test(View view){

                 Intent i = new Intent(getApplicationContext(),activity2.class);
                 startActivity(i);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get Button By Id
//        Button   btn = (Button)findViewById(R.id.btn);
//
//
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent i = new Intent(getApplicationContext(),activity2.class);
//                    startActivity(i);
//                }
//            });

    }
}
