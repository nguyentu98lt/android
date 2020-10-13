package com.example.ex9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ImageView iv1=(ImageView) findViewById(R.id.imageView);
        final CheckBox cb1=(CheckBox) findViewById(R.id.checkBox);
        final RadioButton rdbtn1=(RadioButton) findViewById(R.id.rdbtn1);
        final RadioButton rdbtn2=(RadioButton) findViewById(R.id.rdbtn2);
        final RadioButton rdbtn3=(RadioButton) findViewById(R.id.rdbtn3);
        final View layout=(View) findViewById(R.id.layout);



        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //Code khi trạng thái check thay đổi
                if (cb1.isChecked())
                {
                    //Checked

                    iv1.setVisibility(View.INVISIBLE);
                }
                else
                {
                    //Unchecked
                    iv1.setVisibility(View.VISIBLE);
                }

            }
        });

        rdbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View root = layout.getRootView();

                // Set the color
                root.setBackgroundColor(getResources().getColor(android.R.color.background_dark));





            }
        });

        rdbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View root = layout.getRootView();

                // Set the color
                root.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));





            }
        });

        rdbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View root = layout.getRootView();

                // Set the color
                root.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));





            }
        });




        
    }
}