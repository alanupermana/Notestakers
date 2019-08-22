package com.example.notestakers.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.notestakers.Login;
import com.example.notestakers.NoteData;
import com.example.notestakers.Profile;
import com.example.notestakers.R;
import com.example.notestakers.SignUp;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment{
    private ArrayList<com.example.notestakers.Note> list = new ArrayList<>();
    private List<Note> mLists = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private ViewGroup toProfile;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mRecyclerView = view.findViewById(R.id.rv_ListNotes);
        mRecyclerView.setHasFixedSize(true);
        list.addAll(NoteData.getListData());
        showRecyclerList();



        toProfile = view.findViewById(R.id.onClickToProfile);

        toProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Profile.class);
                startActivity(i);
            }
        });



        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }


    private void showRecyclerList(){
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ListNoteAdapter listNoteAdapter = new ListNoteAdapter(list);
        mRecyclerView.setAdapter(listNoteAdapter);


    }


}

