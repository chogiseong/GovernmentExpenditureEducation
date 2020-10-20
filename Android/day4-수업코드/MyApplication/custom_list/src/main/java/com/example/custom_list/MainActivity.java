package com.example.custom_list;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<User> myUsers = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyUserAdapter adapter = new MyUserAdapter(this, R.layout.listitem_picture, myUsers);

        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);

        retrieveUsers();
    }

    private void retrieveUsers() {
        for (int i = 0; i < 10; i++) {
            myUsers.add(new User("이름" + i, "주소" + i, R.drawable.profile_1));
        }
    }


    class MyUserAdapter extends ArrayAdapter<User> {

        Context mContext;

        public MyUserAdapter(@NonNull Context context, int resource, @NonNull List<User> objects) {
            super(context, resource, objects);

            mContext = context;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view = null;
            if (convertView == null) {
                // LayoutInflater intlater = LayoutInflater.from( mContext );
                view = View.inflate( mContext, R.layout.listitem_picture, null);
            } else {
                view = convertView;
            }
            TextView txt1 = (TextView) view.findViewById(R.id.textView);
            TextView txt2 = (TextView) view.findViewById(R.id.textView2);
            ImageView img = (ImageView)view.findViewById(R.id.imageView);


            User user = myUsers.get(position);
            txt1.setText(user.getName());
            txt2.setText(user.getAddress());
            img.setImageResource(user.getImgUri());

            return view;
        }
    }



}
