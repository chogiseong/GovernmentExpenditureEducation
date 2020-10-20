package android.media.mediaplayer;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class MediaListAdapter extends ArrayAdapter<FileItem> {
    private LayoutInflater mInflater;
    private int layout;
    private ArrayList<FileItem> data;

    public MediaListAdapter(Context context, int layout, ArrayList<FileItem> data) {
        super(context, layout, data);
        mInflater = LayoutInflater.from(context);
        this.layout = layout;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv = null;

        if (convertView == null) {
            tv = (TextView) mInflater.inflate(layout, null);
        } else {
            tv = (TextView) convertView;
        }

        tv.setText(data.get(position).getDisplayName());

        return tv;
    }
}