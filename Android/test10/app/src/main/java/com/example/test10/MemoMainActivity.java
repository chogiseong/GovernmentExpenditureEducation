package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MemoMainActivity extends ListActivity {

    private final static int NEW_CODE = 0;
    private final static int EDIT_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mymemos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem itemAdd = menu.add(0, 0, Menu.NONE, "새메모");
        MenuItem itemRem = menu.add(0, 1, Menu.NONE, "종료");
        itemAdd.setIcon(android.R.drawable.ic_menu_add);
        itemRem.setIcon(android.R.drawable.ic_menu_close_clear_cancel);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case 0:
                startActivityForResult(new Intent(this, NewMemoActivity.class), NEW_CODE);

                return true;

            case 1:
                finish();
                return true;
        }
        return(super.onOptionsItemSelected(item));
    }
}