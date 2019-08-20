package com.example.notestakers;

import android.os.Parcel;
import android.os.Parcelable;

public class Note implements Parcelable {
    private String photoNote, title, category, subject, isVerified,price,author,photoAuthor;

    public Note(){
    }

    protected Note(Parcel in) {
        photoNote = in.readString();
        title = in.readString();
        category = in.readString();
        subject = in.readString();
        isVerified = in.readString();
        price = in.readString();
        author = in.readString();
        photoAuthor = in.readString();
    }

    public static final Creator<Note> CREATOR = new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel in) {
            return new Note(in);
        }

        @Override
        public Note[] newArray(int size) {
            return new Note[size];
        }
    };

    public String getPhotoNote() {
        return photoNote;
    }

    public void setPhotoNote(String photoNote) {
        this.photoNote = photoNote;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(String isVerified) {
        this.isVerified = isVerified;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPhotoAuthor() {
        return photoAuthor;
    }

    public void setPhotoAuthor(String photoAuthor) {
        this.photoAuthor = photoAuthor;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(photoNote);
        dest.writeString(title);
        dest.writeString(category);
        dest.writeString(subject);
        dest.writeString(isVerified);
        dest.writeString(price);
        dest.writeString(author);
        dest.writeString(photoAuthor);
    }
}
