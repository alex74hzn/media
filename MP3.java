package com.example.media;

public class MP3 extends MediaFile implements Playable{

    public MP3(){}

    public MP3(String type, int leanth, String  content) {
        super(type, leanth, content);
    }

    @Override
    public void play() {
        for(int i = 0; i < this.getLeanth(); i++) {
            System.out.println(this.getContent());
        }
    }

    @Override
    public void pause() {
        System.out.println("Пауза для MP3.");
    }

    @Override
    public void rewind() {
        System.out.println("Мотаю MP3 назад!");
    }


}
