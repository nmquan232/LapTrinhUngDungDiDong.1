package com.example.myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class tuan31MainActivity extends AppCompatActivity {
    ListView lv;
    T31Adapter adapter;
    ArrayList<T31Contact> ls=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan31_main);
        lv=findViewById(R.id.tuan31lv);
        ls.add(new T31Contact("Nguyen Van A","18",R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Tran Van B","19",R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Thi D","16",R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Van C","22",R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Van A","18",R.drawable.ic_launcher_background));
        ls.add(new T31Contact("Nguyen Van A","18",R.drawable.ic_launcher_background));
        adapter=new T31Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}