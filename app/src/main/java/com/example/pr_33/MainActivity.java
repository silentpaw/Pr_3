package com.example.pr_33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //программная установка внутренних и внешних отступов
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setText("Hello");
        textView.setTextSize(26);
        int margin50inDp = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics());

        int margin40inDp = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());

        int margin60inDp = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 60, getResources().getDisplayMetrics());


        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(margin60inDp, margin50inDp, margin60inDp, margin50inDp);
        layoutParams.leftToLeft = ViewGroup.LayoutParams.WRAP_CONTENT;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        textView.setLayoutParams(layoutParams);
        textView.setPadding(margin40inDp, margin40inDp, margin40inDp, margin40inDp);
        constraintLayout.addView(textView);
        setContentView(constraintLayout);
        /*
        //задание 10
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setText("Hello");
        textView.setTextSize(26);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, 200);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.WRAP_CONTENT;
        layoutParams.topToTop = ViewGroup.LayoutParams.MATCH_PARENT;
        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);
        setContentView(constraintLayout);
        */

        //задание 6
        /*
        setContentView(R.layout.second_layout);
        TextView textView = findViewById(R.id.header);
        textView.setText("Hello from Java!");
        */

        /*
        задание 3
        TextView textView = new TextView(this);
        textView.setText("HELLOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        textView.setTextSize(22);
        setContentView(textView);
        */
        //4
        //загрузка интерфэйса с activity_main.xml
        setContentView(R.layout.activity_main);
        //загрузка интерфэйса с second_layout.xml
        setContentView(R.layout.second_layout);
    }
}