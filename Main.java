package com.example.media;

public class Main {
    public static void main(String[] args) {
        MediaFile mp3 =  new MP3("MP3", 5, "Ля-ля-ля");
        MediaFile video = new Video("video", 12, "  Кадр ");
        MediaFile podcast = new Podcast("podcast", 8, "Бла-бла");
        mp3.play();
        video.play();
        mp3.pause();
        
    }
}