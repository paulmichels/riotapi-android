package com.endive.dummy.data.riot.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.endive.dummy.data.riot.database.dao.BaseDao;
import com.endive.dummy.data.riot.database.dao.SummonerDao;
import com.endive.dummy.data.riot.models.lol.summoner.Summoner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Summoner.class}, version = 1, exportSchema = false)
public abstract class RiotDatabase extends RoomDatabase {

    private static volatile RiotDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;

    public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static RiotDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (RiotDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), RiotDatabase.class, "summoner_database")
                            .fallbackToDestructiveMigration()
                            .addCallback(roomDataBaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback roomDataBaseCallback = new RoomDatabase.Callback() {

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
        }

        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }

        @Override
        public void onDestructiveMigration(@NonNull SupportSQLiteDatabase db) {
            super.onDestructiveMigration(db);
        }

    };

    public abstract SummonerDao summonerDao();

}
