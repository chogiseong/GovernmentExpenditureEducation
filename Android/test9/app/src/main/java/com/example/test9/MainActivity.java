package com.example.test9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int[] images = new int[]{
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
    };

    ArrayList<FavoritePicture> pictures = new ArrayList<FavoritePicture>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images = retrieveData();
        pictures = retrieveFavoritePictures();
        FavoritePictureAdapter adapter =
                new FavoritePictureAdapter(this, R.layout.list_item, pictures);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = view.findViewById(R.id.picture_title);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    ArrayList<FavoritePicture> retrieveFavoritePictures(){
        ArrayList<FavoritePicture> pictures = new ArrayList<FavoritePicture>();
        for( int i = 0; i < images.length; i ++){
            pictures.add( new FavoritePicture("명화" + i, images[i], 0.0f));
        }
        return pictures;
    };

    //file, db, rest api
    int[] retrieveData(){
        return new int[] {
                R.drawable.pic1,
                R.drawable.pic2,
                R.drawable.pic3,
                R.drawable.pic4,
                R.drawable.pic5,
                R.drawable.pic6,
                R.drawable.pic7,
                R.drawable.pic8,
                R.drawable.pic9,
        };
    }


}