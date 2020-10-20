package com.example.test8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] data = new String[] {"하나", "둘"};

        ArrayAdapter stringAdapter = new ArrayAdapter<String>(this,
                R.layout.list_item1,
                //android.R.layout.simple_list_item_1,
                data);

        ListView listView = findViewById(R.id.listView1);
        listView.setAdapter(stringAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                TextView tv = (TextView) view;
                Toast.makeText(MainActivity.this, "Position: " + data[position]
                        +"\n"
                        +"View: " + tv.getText().toString()
                        , Toast.LENGTH_SHORT).show();
            }
        });


    }

    class MyUserAdapter extends ArrayAdapter<User>{
        public MyUserAdapter(@NonNull Context context, int resource, @NonNull List<User> objects){
            View view = null;
            if (convertView == null){
                view = View.inflate(mContext, R.layout.listitem_picture, null);
            } else{
                View = convertView;
            }

            User user = rows.get(position);
            TextView txt1 = (TextView)view.findViewById(R.id.textView1);
            TextView txt2 = (TextView)view.findViewById(R.id.textView2);

            ImageView imag = (ImageView)view.findViewById((R.id.imageView1));
            txt1.setText(user.getName());
            txt2.setText(user.getAddress());
            imag.setImageResource(user.getImage());

            return view;

        }
    }
}