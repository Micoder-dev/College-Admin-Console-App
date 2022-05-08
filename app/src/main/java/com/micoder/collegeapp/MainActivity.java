package com.micoder.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice, addGalleryImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice=findViewById(R.id.addNotice);
        addGalleryImage=findViewById(R.id.addGalleryImage);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.addNotice:
                startActivity(new Intent(MainActivity.this,UploadNotice.class));
                break;
            case R.id.addGalleryImage:
                startActivity(new Intent(MainActivity.this,UploadImage.class));
                break;
        }
    }
}