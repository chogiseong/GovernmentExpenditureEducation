package com.example.simple_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] data = new String[] {"하나", "둘", "셋", "넷",
                "하나1", "둘1", "셋1", "넷1",
                "하나2", "둘2", "셋2", "넷2",
                "하나2", "둘2", "셋2", "넷2",
                "하나2", "둘2", "셋2", "넷2",
                "하나2", "둘2", "셋2", "넷2", };

        ArrayAdapter stringAdapter = new ArrayAdapter<String>(this,
                R.layout.list_item1,
                data);

        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(stringAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TextView tv = (TextView) view;

                Toast.makeText(MainActivity.this, "Position: " + data[position]
                        + "\n"
                        + "View: " + tv.getText().toString()
                        , Toast.LENGTH_SHORT).show();
            }
        });


    }
}
