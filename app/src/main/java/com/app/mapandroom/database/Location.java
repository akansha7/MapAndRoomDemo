package com.app.mapandroom.database;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "location")
public class Location {

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @PrimaryKey
    private Long id;

    @ColumnInfo(name = "latitude")
    private Double lat;

    @ColumnInfo(name = "longitude")
    private Double lang;

    @ColumnInfo(name = "address")
    private String address;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLang() {
        return lang;
    }

    public void setLang(Double lang) {
        this.lang = lang;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
