package com.projects.anil.studentdatalifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.projects.anil.studentdatalifecycle.FirstYear.FirstYearActivity;
import com.projects.anil.studentdatalifecycle.FourthYear.FourthYearActivity;
import com.projects.anil.studentdatalifecycle.ProfileDetails.ProfileActivity;
import com.projects.anil.studentdatalifecycle.SecondYear.SecondYearActivity;
import com.projects.anil.studentdatalifecycle.ThirdYear.ThirdYearActivity;

public class AddActivity extends AppCompatActivity {

    Button btnProfile,btn1year,btn2ndyear,btn3rdyear,btn4rtyear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Add Student Profile");


        btnProfile=(Button)findViewById(R.id.btnProfile);
        btn1year=(Button)findViewById(R.id.btn1styear);
        btn2ndyear=(Button)findViewById(R.id.btn2ndyear);
        btn3rdyear=(Button)findViewById(R.id.btn3rdyear);
        btn4rtyear=(Button)findViewById(R.id.btn4rtYear);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(AddActivity.this,ProfileActivity.class));
            }
        });

        btn1year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(AddActivity.this,FirstYearActivity.class));
            }
        });

        btn2ndyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddActivity.this,SecondYearActivity.class));
            }
        });

        btn3rdyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddActivity.this,ThirdYearActivity.class));
            }
        });

        btn4rtyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddActivity.this,FourthYearActivity.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case android.R.id.home:
                onBackPressed();

                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
