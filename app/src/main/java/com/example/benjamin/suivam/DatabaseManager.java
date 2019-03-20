package com.example.benjamin.suivam;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.util.List;

public class DatabaseManager extends OrmLiteSqliteOpenHelper {
    private  static  final String DATABASE_NAME ="gsbbdd.db";
    private  static  final int DATABASE_VERSION = 1;
    public DatabaseManager(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try{
            TableUtils.createTable(connectionSource, Visiteur.class);
            TableUtils.createTable(connectionSource, Rendezvous.class);
            TableUtils.createTable(connectionSource, Medecien.class);
            TableUtils.createTable(connectionSource, Cabinet.class);
            Log.i("DataBase", "onCreate");
        }
        catch (Exception exception){
            Log.e("Database","ne peu pas créer", exception);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        Log.i("DataBase", "onCreate");
    }

    public List<Medecien> selectMedecien(){
        try{
            Dao<Rendezvous,Integer> dao = getDao(Medecien.class);
            dao.que;
            return ;
        }catch (Exception exception){
            Log.e("Database","ne peu pas selectionner de medeciens dans database", exception);
        }
    }

    public List<Cabinet> selectCabinet(){
        try{
            Dao<Rendezvous,Integer> dao = getDao(Cabinet.class);
            dao.que;
            return ;
        }catch (Exception exception){
            Log.e("Database","ne peu pas selectionner de cabinet dans database", exception);
        }
    }

    public void selectRendezvous(Rendezvous rendezvous){
        try{
            Dao<Rendezvous,Integer> dao = getDao(Rendezvous.class);
            dao.que;
        }catch (Exception exception){
            Log.e("Database","ne peu pas selectionner de rendezvous dans database", exception);
        }
    }

    public void inserteRendezvous(Rendezvous rendezvous){
        try{
            Dao<Rendezvous,Integer> dao = getDao(Rendezvous.class);
            dao.create(rendezvous);
        }catch (Exception exception){
            Log.e("Database","ne peu pas ajouter de rendezvous dans database", exception);
        }
    }
}

