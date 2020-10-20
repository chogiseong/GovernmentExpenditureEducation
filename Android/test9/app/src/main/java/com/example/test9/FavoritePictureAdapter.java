package com.example.test9;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FavoritePictureAdapter extends ArrayAdapter<FavoritePicture> {

    ArrayList<FavoritePicture> pictures;
    int layoutId;
    Context mContext;

    public FavoritePictureAdapter(@NonNull Context context, int layoutId, @NonNull ArrayList<FavoritePicture> objects){

        super(context, layoutId, objects);
        this.pictures = objects;
        this.layoutId = layoutId;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = null;
        if(convertView == null){
            view = View.inflate(mContext, this.layoutId, null);
        }else {
            view = convertView;
        }

        TextView txt1 = (TextView) view.findViewById(R.id.picture_title);
        RatingBar rating = view.findViewById(R.id.ratingBar1);
        rating.setOnRatingBarChangeListener(barChangeListener);
        ImageView img = (ImageView) view.findViewById(R.id.imageView);

        FavoritePicture picture = pictures.get(position);

        txt1.setText(picture.getTitle());
        rating.setRating(picture.getRating());
        img.setImageResource(picture.getImgUri());

        return view;
    }

    RatingBar.OnRatingBarChangeListener barChangeListener = new RatingBar.OnRatingBarChangeListener() {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
            Log.i("ratingbar: ", v + ":::::" + b);
        }
    }
}
