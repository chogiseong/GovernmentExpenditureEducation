package apps.db.mynote_db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


class DatabaseHelper extends SQLiteOpenHelper {
    public static String DATABASE_NAME = "memodb.db";

    public static String DATABASE_TABLE = "memo_table";

    public static int DATABASE_VERSION = 1;
    
    public static final String _ID = "_id";
    public static final String TITLE = "title";
    public static final String BODY = "body";
    
    
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + DATABASE_TABLE + "(" + _ID + " INTEGER PRIMARY KEY,"
                + TITLE + " VARCHAR, " 
                + BODY + " VARCHAR"
                + ");");
        String insertMe = "INSERT INTO " + DATABASE_TABLE
                + "("+ TITLE +"," + BODY +") " + "VALUES ";
        db.execSQL(insertMe + "('메모1','첫번째 메모입니다.');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
        onCreate(db);
    }

    public void retriveData(ArrayList<MyMemo> items) {
        SQLiteDatabase db = getReadableDatabase();

        try( Cursor c = db.query(DATABASE_TABLE,
                new String[] { _ID, TITLE, BODY },
                null, null, null, null, null)) {
            items.clear();

            if (c.moveToFirst()) {
                do {
                    MyMemo memo = getMemo(c);
                    items.add(memo);
                } while (c.moveToNext());
            }
        }
/* java6
        Cursor c = db.query(DATABASE_TABLE,
                new String[] { _ID, TITLE, BODY }, 
                null, null, null, null, null);
        try {
            items.clear();
            
            if (c.moveToFirst()) {
                do {
                    MyMemo memo = getMemo(c);
                    items.add(memo);
                } while (c.moveToNext());
            }
        } finally {
            if (c != null)
                c.close();
        }
*/
    }
    
    
    private MyMemo getMemo(Cursor c) {
        String title = c.getString(c.getColumnIndex(TITLE));
        String body = c.getString(c.getColumnIndex(BODY));
        int id = c.getInt(c.getColumnIndex(_ID));
        
        MyMemo memo = new MyMemo( id, title, body);
        return memo;
    }

    public MyMemo retrive(int id) {
        MyMemo memo = null;
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.query(DATABASE_TABLE, 
                new String[] { _ID, TITLE, BODY },
                _ID + "=?", new String[] {id+""}, null, null, null);
        
        if( c.moveToFirst() ) {
            memo = getMemo( c );
            c.close();
        }
        return memo;
        
    }
    
    
    public void insert(MyMemo memo) {
        SQLiteDatabase db = getReadableDatabase();
        String insertMe = "INSERT INTO " + DATABASE_TABLE
                + "("+ TITLE +"," + BODY +") " + "VALUES ";
        db.execSQL(insertMe + "('" + memo.title + "',"
                + "'" + memo.body + "');");
    }
    
    public int update(MyMemo memo) {
        SQLiteDatabase db = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put( TITLE, memo.title);
        values.put( BODY, memo.body);
        return db.update( DATABASE_TABLE, values, "_id=?", new String[]{ memo._ID+""});
    }
    
    public void delete(int id) {
        SQLiteDatabase db = getReadableDatabase();
        String delete = "DELETE from " + DATABASE_TABLE 
            + " WHERE _id=" + id;
        db.execSQL(delete);
    }
}


class MyMemo {
    public MyMemo(int id, String title, String body) {
        this._ID = id;
        this.title = title;
        this.body = body;
    }

    int _ID;
    String title;
    String body;
}
