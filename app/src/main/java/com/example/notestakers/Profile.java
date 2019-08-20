package com.example.notestakers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class Profile extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Note> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(NoteData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListNoteAdapter listNoteAdapter = new ListNoteAdapter(list);
        rvCategory.setAdapter(listNoteAdapter);

        listNoteAdapter.setOnItemClickCallback(new ListNoteAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Note data) {
                showSelectedNote(data);
            }
        });

    }

    private void showSelectedNote(Note note){
        Toast.makeText(this, "Kamu memilih "+note.getTitle(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        showRecyclerList();
        return super.onOptionsItemSelected(item);
    }

}
