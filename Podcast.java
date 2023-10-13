package com.example.media;

public class Podcast  extends MediaFile implements Playable{

    public Podcast (){}
    
    public Podcast(String type, int leanth, String content) {
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
        System.out.println("Подкаст на паузе.");
    }

    @Override
    public void rewind() {
        System.out.println("Мотаю подкаст назад!");
    }
}
