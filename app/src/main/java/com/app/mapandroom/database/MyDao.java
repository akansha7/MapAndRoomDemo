package com.app.mapandroom.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void addLocation(Location location);

    @Query("select * from location")
    public List<Location> getLocation();
}
