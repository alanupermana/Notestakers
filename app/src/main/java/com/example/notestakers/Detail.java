package com.example.notestakers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        final Note note = intent.getParcelableExtra("note");

        ImageView viewDetailImageNote = (ImageView)findViewById(R.id.img_detail_photo);
        ImageView viewDetailImageAuthor = (ImageView)findViewById(R.id.img_detail_author);
        TextView viewDetailTitleNote = (TextView)findViewById(R.id.tv_detail_noteTitle);
        TextView viewDetailCategory = (TextView)findViewById(R.id.tv_detail_category);
        TextView viewDetailSubject = (TextView)findViewById(R.id.tv_detail_subject);
        TextView viewDetailIsVerified = (TextView)findViewById(R.id.tv_detail_isVerified);
        TextView viewPrice = (TextView)findViewById(R.id.tv_detail_price);
        TextView otherPerson = (TextView)findViewById(R.id.tv_detail_author);
        TextView emailOtherPerson = (TextView)findViewById(R.id.tv_detail_email);
        TextView purchase = (TextView)findViewById(R.id.tv_detail_purchaseCount);
        TextView like = (TextView)findViewById(R.id.tv_detail_likeCount);


        viewDetailTitleNote.setText(note.getTitle());
        viewDetailCategory.setText(note.getCategory());
        viewDetailSubject.setText(note.getSubject());
        viewDetailIsVerified.setText(note.getIsVerified());
        viewPrice.setText(note.getPrice());
        purchase.setText(note.getPurchaseCount());
        like.setText(note.getLikeCount());
        otherPerson.setText(note.getAuthor());
        emailOtherPerson.setText(note.getEmailAuthor());
        Glide.with(this).load(note.getPhotoNote()).apply(new RequestOptions()).into(viewDetailImageNote);
        Glide.with(this).load(note.getPhotoAuthor()).apply(new RequestOptions()).into(viewDetailImageAuthor);
    }
}
