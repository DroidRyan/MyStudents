package com.example.ryan.mystudents;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "biodatadiri.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated buat sub konstruktor
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method
        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
                Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata (no, nama, tgl, jk, alamat) VALUES ('1', 'Ilham Abrori', 'Jakarta, 28 Oktober 2018', 'L','Jakarta Raya');";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
    }
}
