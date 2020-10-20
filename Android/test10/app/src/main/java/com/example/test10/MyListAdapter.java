package com.example.test10;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MyListAdapter extends ListActivity {

    MyListAdapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState){
        mAdapter = new MyListAdapter(this, items);
        setListAdapter(mAdapter);
    }

    class MyListAdapter extends ArrayAdapter<MyMemo> {
        public MyListAdapter (Context context, ArrayList<MyMemo> list){

        }
        @Override
        public long getItemId(int position){
        }
        @Override
        public int getCount(){
        }
        @Override
        public View getView(int position, View v, ViewGroup parent){
        }
    }
}
