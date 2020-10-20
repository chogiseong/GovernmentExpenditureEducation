
package apps.db.mynote_db;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.util.ArrayList;

public class MemoMainActivity extends AppCompatActivity {
    private final static int REQ_NEW_MEMO = 100;
    private final static int REQ_EDIT_CODE = 200;
    
    private DatabaseHelper mOpenHelper;

    MyListAdapter mAdapter;
    ArrayList<MyMemo> items = new ArrayList<MyMemo>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notemain1);

        ListView listView = findViewById(R.id.memo_list);
        listView.setOnItemClickListener(itemClickListner);
        
        mOpenHelper = new DatabaseHelper(this);

        mOpenHelper.retriveData(items);

        mAdapter = new MyListAdapter(this, items);

        listView.setAdapter(mAdapter);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (Activity.RESULT_OK == resultCode) {
            Bundle extra = data.getExtras();
            MyMemo memo = new MyMemo( extra.getInt(DatabaseHelper._ID),
                    extra.getString(DatabaseHelper.TITLE),
                    extra.getString(DatabaseHelper.BODY));

            if( requestCode == REQ_EDIT_CODE) {
                mOpenHelper.update(memo);
            } else {
                mOpenHelper.insert(memo);
            }
            
            mOpenHelper.retriveData(items);
            
            mAdapter.notifyDataSetChanged();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Create and add new menu items.
        MenuItem itemAdd = menu.add(0, 0, Menu.NONE, "새 메모");
        MenuItem itemRem = menu.add(0, 1, Menu.NONE, "종료");

        // Assign icons
        itemAdd.setIcon(android.R.drawable.ic_menu_add);
        itemRem.setIcon(android.R.drawable.ic_menu_close_clear_cancel);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent( this, MemoEditActivity.class);
        switch (item.getItemId()) {
            case 0:
//                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivityForResult(intent, REQ_NEW_MEMO);
                return true;
            case 1:
                finish();
                return true;
        }
        return (super.onOptionsItemSelected(item));
    }

    OnItemClickListener itemClickListner = new OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View view, int position, long id) {
//            ArrayAdapter<MyMemo> adapter = (ArrayAdapter<MyMemo>)arg0.getAdapter();
//            MyMemo address = adapter.getItem(position);
//            items.get(position);
            
            Intent intent = new Intent( MemoMainActivity.this, MemoEditActivity.class );
            intent.putExtra(DatabaseHelper._ID, (int)id);
            startActivityForResult( intent, REQ_EDIT_CODE);
        }
    };
    
    
    class MyListAdapter extends ArrayAdapter<MyMemo> {
        ArrayList<MyMemo> rows;
        Context mContext;

        public MyListAdapter(Context context, ArrayList<MyMemo> list) {
            super(context, R.layout.notelist_item, list);
            mContext = context;
            rows = list;
        }

        
        
        @Override
        public long getItemId(int position) {
            return getItem(position)._ID;
        }

        @Override
        public int getCount() {
            return rows.size();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View item = null;
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(getBaseContext());
                item = inflater.inflate(R.layout.notelist_item, null);
            } else {
                item = convertView;
            }
            TextView row1 = (TextView) item.findViewById(R.id.name);
            TextView row2 = (TextView) item.findViewById(R.id.country);

            MyMemo memo = rows.get(position);
//            uriCapturedImage = Uri.fromFile(new File(Environment
//                    .getExternalStorageDirectory(), "capture_file.jpg"));
            row1.setText(memo.title);
            row2.setText(memo.body);
            return item;
        }

    }

}
