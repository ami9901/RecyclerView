package com.latest.status.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.latest.status.Adapter.ProgrammingAdapter;
import com.latest.status.R;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        RecyclerView programmingList= findViewById(R.id.proList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] itemlist={"Attitude","Love","Fun","Egoistic","Friendship","Life","Sad","Motivational","Cool","AmAzing","Angry","Anniversary","blahblah..."};
        programmingList.setAdapter(new ProgrammingAdapter(itemlist));
    }
}
