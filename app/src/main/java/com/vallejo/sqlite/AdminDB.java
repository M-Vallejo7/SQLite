package com.vallejo.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminDB extends SQLiteOpenHelper {
    public AdminDB(@Nullable Context contexto, @Nullable String nombre, @Nullable SQLiteDatabase.CursorFactory factor, int version) {
        super(contexto, nombre, factor, version);
    }

    //Construir la DataBase
    @Override
    public void onCreate(SQLiteDatabase Luisa){
        Luisa.execSQL("CREATE TABLE usuario(cedula int primary key, nombre text, telefono int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase Eliza, int i, int i1){

    }
}
