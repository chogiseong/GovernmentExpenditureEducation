
package apps.db.mynote_db;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

public class MemoEditActivity extends Activity {
    EditText title, body, country, age;
    DatabaseHelper mOpenHelper;
    int item_id = -1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note1);

        mOpenHelper = new DatabaseHelper(this);
        
        title = findViewById(R.id.note_title);
        body = findViewById(R.id.note_body);
        
        Intent data = getIntent();
        if( data != null) {
            TextView txtTop = findViewById(R.id.txtLog);
            txtTop.setText("메모를 수정합니다.");
            
            item_id = data.getIntExtra( DatabaseHelper._ID, -1);
            MyMemo memo = mOpenHelper.retrive(item_id);
            if( memo != null ) {
                title.setText(memo.title);
                body.setText(memo.body);
            }
        }
    }

    public void buttonClick(View v) {
        final int id = v.getId();
        switch (id) {
            case R.id.btn_ok:
                Intent data = getIntent();
                data.putExtra( DatabaseHelper._ID, item_id);

                data.putExtra( DatabaseHelper.TITLE, title.getText().toString());
                data.putExtra( DatabaseHelper.BODY, body.getText().toString());

                setResult(RESULT_OK, data);
                finish();
                break;
            case R.id.btn_cancel:
                setResult(RESULT_CANCELED);
                finish();
                break;
        }
    }

    @Override
    protected void onPause() {

        Intent data = getIntent();
        data.putExtra( DatabaseHelper._ID, item_id);

        data.putExtra( DatabaseHelper.TITLE, title.getText().toString());
        data.putExtra( DatabaseHelper.BODY, body.getText().toString());

        setResult(RESULT_OK, data);
//
//        Intent intent = new Intent();
//        try {
//            if( MemoMainActivity.saveFile( title, content) ) {
//
//                intent.putExtra( MemoMainActivity.INTENT_TITLE, title);
//                setResult(RESULT_OK, intent);
//            } else {
//                intent.putExtra("msg", "SDCard를 사용 할 수 없습니다.");
//                setResult(RESULT_CANCELED, intent);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        finish();
        super.onPause();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        onPause();
    }


}
