package com.micoder.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.micoder.collegeapp.faculty.UpdateFaculty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice, addGalleryImage,addEbook,faculty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice=findViewById(R.id.addNotice);
        addGalleryImage=findViewById(R.id.addGalleryImage);
        addEbook=findViewById(R.id.addEbook);
        faculty=findViewById(R.id.faculty);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        faculty.setOnClickListener(this);
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
            case R.id.addEbook:
                startActivity(new Intent(MainActivity.this,UploadPdfActivity.class));
                break;
            case R.id.faculty:
                startActivity(new Intent(MainActivity.this, UpdateFaculty.class));
                break;
        }
    }
}