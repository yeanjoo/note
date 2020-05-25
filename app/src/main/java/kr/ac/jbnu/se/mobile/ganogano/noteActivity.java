package kr.ac.jbnu.se.mobile.ganogano;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class noteActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    List<Note> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);

        //데이터삽입
        for (int i=0; i < 20; i++){
            list.add(new Note(R.mipmap.ic_launcher, "list " + i + "번째", "값 " + i));
        }
        //리사이클뷰에 객체 지정
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(false);
        //리사이클뷰에 어뎁터 지정
        recyclerView.setAdapter(new RecyclerAdapter(list));
    }
}

