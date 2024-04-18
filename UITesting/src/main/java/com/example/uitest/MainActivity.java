package com.example.uitest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a2_lab7_ui_testing.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textView);

        // Initialize a click counter
        btn.setOnClickListener(new View.OnClickListener() {
            int clickCount = 0;
            @Override
            public void onClick(View v) {
                updateTextColor(textView, clickCount);

                clickCount++;
            }
        });
    }


    private void updateTextColor(TextView textView, int clickCount) {
        if (clickCount % 3 == 0) {
            textView.setTextColor(Color.parseColor("#964B00")); // Brown color
        } else if (clickCount % 3 == 1) {
            textView.setTextColor(Color.parseColor("#008000")); // Green color
        } else if (clickCount % 3 == 2) {
            textView.setTextColor(Color.parseColor("#00FFFF")); // Cyan color
        }
    }



}
