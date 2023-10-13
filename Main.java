package com.example.media;

public class Main {
    public static void main(String[] args) {
               MediaFile mp3 =  new MP3("MP3", 5, "Ля-ля-ля", 256);
        MediaFile video = new Video("video", 12, "  Кадр ");
        MediaFile podcast = new Podcast("podcast", 8, "Бла-бла");
        mp3.play();
        mp3.pause();
        String string = mp3.toString();
        System.out.println(string);

        video.play();
        video.pause();
        video.rewind();
        System.out.println(video);

        podcast.play();
        podcast.pause();
        podcast.rewind();
        System.out.println(podcast);
    }
}
