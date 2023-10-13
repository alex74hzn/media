package com.example.media;

public class Video  extends MediaFile implements Playable{

    public Video(){}
    
    public Video(String type, int leanth, String content) {
        super(type, leanth, content);
    }

    @Override
    public void play() {
        for(int i = 0; i < this.getLeanth(); i++) {
            System.out.println(this.getContent().toString());
        }
    }

    @Override
    public void pause() {
        System.out.println("Видос на паузе.");
    }

    @Override
    public void rewind() {
        System.out.println("Видос мотается назад!");
    }
}
