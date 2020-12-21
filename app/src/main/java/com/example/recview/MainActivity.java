package com.example.recview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    String s1[], s2[];

    int images[] = {R.drawable.ic_baseline_copyright_24, R.drawable.ic_baseline_copyright_24,
            R.drawable.ic_baseline_copyright_24, R.drawable.ic_baseline_copyright_24};

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.language);
        s2 = getResources().getStringArray(R.array.desc);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));






    }
}