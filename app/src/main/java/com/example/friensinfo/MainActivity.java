package com.example.friensinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button amit,mudit,rahul,hardeep,manas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amit=findViewById(R.id.amit);
        mudit=findViewById(R.id.mudit);
        rahul=findViewById(R.id.rahul);
        hardeep=findViewById(R.id.hardeep);
        manas=findViewById(R.id.manas);

        amit.OnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,
                        com.example.friensinfo.MainActivity2.class );
            intent.putExtra("name","1");
            startActivity(intent);
            }
        });
    }

}