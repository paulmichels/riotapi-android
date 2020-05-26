package com.endive.dummy.data.riot.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import java.util.List;

@Dao
public interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(T object);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insert(List<T> objects);

    @Update
    int update(T object);

    @Update
    int update(List<T> objects);

    @Delete
    int delete(T object);

    @Delete
    int delete(List<T> objects);
}