package com.example.greetings;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial views
        TextView txtInitial = findViewById(R.id.txtInitial);
        Button btnAnimate = findViewById(R.id.btnAnimate);

        // Christmas views
        ImageView imgTree = findViewById(R.id.imgTree);
        TextView txtGreeting = findViewById(R.id.txtGreeting);
        TextView txtMessage = findViewById(R.id.txtMessage);

        // Animations
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        Animation fadeSlideIn = AnimationUtils.loadAnimation(this, R.anim.fade_slide);

        btnAnimate.setOnClickListener(v -> {

            // Fade out initial content
            txtInitial.startAnimation(fadeOut);
            btnAnimate.startAnimation(fadeOut);

            txtInitial.setVisibility(View.GONE);
            btnAnimate.setVisibility(View.GONE);

            // Show Christmas card
            imgTree.setVisibility(View.VISIBLE);
            txtGreeting.setVisibility(View.VISIBLE);
            txtMessage.setVisibility(View.VISIBLE);

            imgTree.startAnimation(fadeSlideIn);
            txtGreeting.startAnimation(fadeSlideIn);
            txtMessage.startAnimation(fadeSlideIn);
        });
    }
}
