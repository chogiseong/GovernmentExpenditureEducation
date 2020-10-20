package com.example.homework1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class freetimeListAdapter extends BaseAdapter {

    private Context context;
    private List<Freetime> freetimeList;

    public freetimeListAdapter(Context context, List<Freetime> freetimeList) {
        this.context = context;
        this.freetimeList = freetimeList;
    }

    @Override
    public int getCount() {
        return freetimeList.size();
    }

    @Override
    public Object getItem(int i) {
        return freetimeList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.freetime, null);
        TextView freetimeTitle = (TextView) v.findViewById(R.id.freetimeTitle);
        TextView freetimeName = (TextView) v.findViewById(R.id.freetimeName);
        TextView freetimeMaster = (TextView) v.findViewById(R.id.freetimeMaster);
        TextView freetimeTime = (TextView) v.findViewById(R.id.freetimeTime);
        TextView freetimePlace = (TextView) v.findViewById(R.id.freetimePlace);
        TextView freetimeLimit = (TextView) v.findViewById(R.id.freetimeLimit);

        freetimeTitle.setText(freetimeList.get(i).getFreetimeTitle());
        freetimeName.setText(freetimeList.get(i).getFreetimeName());
        freetimeMaster.setText(freetimeList.get(i).getFreetimeMaster());
        freetimeTime.setText(freetimeList.get(i).getFreetimeTime());
        freetimePlace.setText(freetimeList.get(i).getFreetimePlace());
        freetimeLimit.setText(freetimeList.get(i).getFreetimeTitle());

        v.setTag(freetimeList.get(i).getFreetimeID());
        return v;
    }
}
