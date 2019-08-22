package com.example.notestakers.Home;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.notestakers.R;

import java.util.ArrayList;
import java.util.List;

public class ListNoteAdapter extends RecyclerView.Adapter<ListNoteAdapter.CategoryViewHolder> {
    private List<Note> listNote;
    public ListNoteAdapter(List<Note> listNote){this.listNote = listNote;}
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback{
        void onItemClicked(Note data);
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_profile,viewGroup,false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        final Note note = listNote.get(i);
        Glide.with(categoryViewHolder.itemView.getContext())
                .load(note.getPhotoNote())
                .apply(new RequestOptions())
                .into(categoryViewHolder.imgPhotoNote);
        Glide.with(categoryViewHolder.itemView.getContext())
                .load(note.getPhotoAuthor())
                .apply(new RequestOptions().override(55,55))
                .into(categoryViewHolder.imgPhotoAuthor);
        categoryViewHolder.tvNoteTitle.setText(note.getTitle());
        categoryViewHolder.tvCategory.setText(note.getCategory());
        categoryViewHolder.tvSubject.setText(note.getSubject());
        categoryViewHolder.tvIsVerified.setText(note.getIsVerified());
        categoryViewHolder.tvPrice.setText(note.getPrice());
        categoryViewHolder.tvAuthor.setText(note.getAuthor());

    }

    @Override
    public int getItemCount() {
        return listNote.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhotoNote,imgPhotoAuthor;
        TextView tvNoteTitle,tvCategory,tvSubject,tvIsVerified,tvPrice,tvAuthor;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhotoNote = itemView.findViewById(R.id.img_item_photo);
            imgPhotoAuthor = itemView.findViewById(R.id.img_item_photo_otherUser);
            tvNoteTitle = itemView.findViewById(R.id.tv_item_noteTitle);
            tvCategory = itemView.findViewById(R.id.tv_item_category);
            tvSubject = itemView.findViewById(R.id.tv_item_subject);
            tvIsVerified = itemView.findViewById(R.id.tv_item_isVerified);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            tvAuthor = itemView.findViewById(R.id.tv_item_author);
        }
    }
}
