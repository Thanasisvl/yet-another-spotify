package com.threeamigos.music.yetanotherspotify.model;

import lombok.*;

@Data
@AllArgsConstructor
public class Song {

    //    TODO: Discuss if Models will be transferred to external module
    private int id;
    private int artistId;
    private String title;
    private String album;
    private String artist;
    private int year;

}
