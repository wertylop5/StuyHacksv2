package com.seuvend.stuyhacksv2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Stanley on 10/10/2015.
 */
public class DatabaseModel extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION = 1
    public static final String DATABASE_NAME = "Thing";

    //public static final String COLUMN_NAME_ENTRY_ID ;

    public DatabaseModel(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        //db.execSQL(SQL_CREATE_ENTRIES);
    }

    ContentValues values = new ContentValues();

    values.put()
}
