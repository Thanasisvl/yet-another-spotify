package com.threeamigos.music.yetanotherspotify.model;

import lombok.*;

@Data
@AllArgsConstructor
public class Artist {

    //    TODO: Discuss if Models will be transferred to external module
    private int id;
    private int artistId;
    private String artistName;

}
