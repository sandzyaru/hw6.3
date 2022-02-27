package com.example.hw6;

public class Track {
    private String trackName;
    private String singer;
    private String length;
    private Integer keyId;
    public Track (String trackName,String singer,String length,Integer keyId){
        this.trackName=trackName;
        this.singer=singer;
        this.length=length;
        this.keyId = keyId;
    }

    public Track(String trackName, String singer, String length) {
        this.trackName=trackName;
        this.singer=singer;
        this.length=length;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Integer getKeyId() {
        return  keyId;
    }
}
