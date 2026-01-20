package com.example.csv;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCall = findViewById(R.id.btnCall);
        Button btnEmail = findViewById(R.id.btnEmail);
        Button btnPortfolio = findViewById(R.id.btnPortfolio);

        // Call Button
        btnCall.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:+639568195582"));
            startActivity(intent);
        });

        // Email Button
        btnEmail.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:dbriancarlo@hotmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "CV Inquiry");
            startActivity(intent);
        });

        // Portfolio Button
        btnPortfolio.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.github.com/scarfer14"));
            startActivity(intent);
        });
    }
}
