package org.monky.roomapp.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface StudentDao {
    @Query("SELECT * FROM students")
    List<Student> getAll();

    @Update
    void update(Student student);

    @Insert
    void insert(Student student);

    @Delete
    void delete(Student student);
}
