package com.example.media;

import java.util.Objects;

public class MediaFile implements Playable{
    private String type;
    private int leanth;
    private String content;
    public MediaFile(String type, int leanth, String content) {
        this.type = type;
        this.leanth = leanth;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLeanth() {
        return leanth;
    }

    public void setLeanth(int leanth) {
        this.leanth = leanth;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MediaFile mediaFile)) return false;
        return getLeanth() == mediaFile.getLeanth() && Objects.equals(getType(), mediaFile.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getLeanth());
    }


    @Override
    public String toString() {
        return  "type='" + type + '\'' +
                ", leanth=" + leanth +
                ", content='" + content + '\'';
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void rewind() {

    }
}