package org.monky.roomapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import org.monky.roomapp.data.AppDatabase;
import org.monky.roomapp.data.Student;
import org.monky.roomapp.data.StudentDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    AppDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),
                        AppDatabase.class, "std.sqlite")
                .allowMainThreadQueries()
                .build();

        insertData();
        loadStudent();
    }

    private void insertData() {
        for (long i = 0; i < 100000; i++){
            Student std = new Student();
            std.id = i;
            std.name = "Chinh";
            std.address = "Hue";
            std.phoneNumber = "09809890";
            db.studentDao().insert(std);
        }
    }


    private void loadStudent(){

        StudentDao studentDao = db.studentDao();
        List<Student> studentList = studentDao.getAll();
        Log.i("size", studentList.size() + "");
    }
}