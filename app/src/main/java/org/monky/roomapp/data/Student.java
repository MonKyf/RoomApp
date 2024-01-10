package org.monky.roomapp.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "students")
public class Student {
    @PrimaryKey
    public long id;
    @ColumnInfo(name = "name")
    public String name;
    @ColumnInfo(name = "address")
    public String address;
    @ColumnInfo(name = "phone_number")
    public String phoneNumber;
}
