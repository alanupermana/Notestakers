package com.example.notestakers;

import java.util.ArrayList;

public class NoteData {
    public static String[][] data = new String[][]{
            {"https://y2x5y9m4.stackpathcdn.com/assets/thumbs/ff0/ff0f88627e68a02d5af5f6236d14671e.jpg", "Grammar Bahasa Inggris", "Note", "English", "Verified", "10.000", "Alanu", "https://avatars2.githubusercontent.com/u/46804112?s=460&v=4", "alanu@gmail.com", "100", "90"},
            {"https://y2x5y9m4.stackpathcdn.com/assets/thumbs/68e/68eb6b98e11b38eff80eee1b3bbd1ce1.jpg", "Kalkulus Dasar", "Exercise", "Math", "Unverified", "20.000", "Choirul Rizal", "https://avatars3.githubusercontent.com/u/36992996?s=460&v=4", "choirul@gmail.com", "29", "42"},
            {"https://s.pdfdrive.com/assets/thumbs/7d5/7d5e463c41773210aee8b3db56979f25.jpg", "Design Kehidupan sehari-hari", "Note", "Art", "Verified", "15.000", "Rakha", "https://avatars2.githubusercontent.com/u/15273012?s=460&v=4", "rakha@gmail.com", "21", "43"},
            {"https://s.pdfdrive.com/assets/thumbs/117/1172d60144940241d2677b1f5e381935.jpg", "Tips kaya dari date app", "Note", "Physics", "Verified", "20.000", "Naufal Rizaldi", "https://avatars0.githubusercontent.com/u/27726885?s=460&v=4", "naufal@gmail.com", "45", "76"},
            {"https://s.pdfdrive.com/assets/thumbs/483/483306a8982b400090915fd9a16bd030.jpg", "Budidaya Cupang", "Note", "Biology", "Unverified", "30.000", "Paldip", "https://avatars1.githubusercontent.com/u/37257941?s=460&v=4", "paldip@gmail.com", "54", "23"},
            {"https://s.pdfdrive.com/assets/thumbs/551/551bf85261c818408940e9768e5e78a0.jpg", "Cara lulus 3.5", "Note", "Indonesian", "Verified", "20.000", "Daffa", "https://avatars2.githubusercontent.com/u/25927580?s=460&v=4", "daffa@gmail.com", "90", "45"},
            {"https://s.pdfdrive.com/assets/thumbs/a5a/a5a6de309681ad6d482867d06deffed1.jpg", "jQgrid is magic", "Excercise", "Math", "Verified", "20.000", "Achmad choirul", "https://avatars3.githubusercontent.com/u/36992996?s=460&v=4", "achmad@gmail.com", "56", "11"},
            {"https://s.pdfdrive.com/assets/thumbs/b59/b59e1b748ae7fec61b9c43be542e68a6.jpg", "Khilaf beli hotweel", "Note", "Civic", "Verified", "50.000", "Paldip", "https://avatars1.githubusercontent.com/u/37257941?s=460&v=4", "paldip@gmail.com", "65", "62"},
            {"https://s.pdfdrive.com/assets/thumbs/491/491bde82953ed7d597c9c39d7577384f.jpg", "Coding Android on MAC", "Note", "Biology", "Verified", "30.000", "Daffa", "https://avatars2.githubusercontent.com/u/25927580?s=460&v=4", "daffa@gmail.com", "72", "12"},
            {"https://s.pdfdrive.com/assets/thumbs/b47/b47b86e02f2fe6d8f7510c1fbb458810.jpg", "Nama-nama ikan", "Note", "Biology", "Verified", "30.000", "Naufal Rizaldi", "https://avatars0.githubusercontent.com/u/27726885?s=460&v=4", "rizaldi@gmail.com", "51", "22"}
    };

    public static ArrayList<Note> getListData(){
        ArrayList<Note> list = new ArrayList<>();
        for(String[] aData : data){
            Note note = new Note();
            note.setPhotoNote(aData[0]);
            note.setTitle(aData[1]);
            note.setCategory(aData[2]);
            note.setSubject(aData[3]);
            note.setIsVerified(aData[4]);
            note.setPrice(aData[5]);
            note.setAuthor(aData[6]);
            note.setPhotoAuthor(aData[7]);
            note.setEmailAuthor(aData[8]);
            note.setPurchaseCount(aData[9]);
            note.setLikeCount(aData[10]);
            list.add(note);
        }
        return list;
    }

}
