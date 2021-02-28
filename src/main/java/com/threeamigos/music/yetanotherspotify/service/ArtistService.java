package com.threeamigos.music.yetanotherspotify.service;

import com.threeamigos.music.yetanotherspotify.model.Artist;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ArtistService {

//    TODO: Transfer Service to external module
    private List<Artist> mockedArtistsList = new ArrayList<>(List.of(
            new Artist(1, 1, "Metallica"),
            new Artist(2,2, "Black Sabbath"),
            new Artist(3,3,"Kyuss"),
            new Artist(4,4,"Led Zeppelin"),
            new Artist(5,5,"Tool")
    ));

    public List<Artist> getArtists(String artistName) {
        List<Artist> listWithArtistsToServe = new ArrayList<>();
        for (Artist artist: mockedArtistsList) {
            if (artist.getArtistName().equals(artistName)) {
                log.info("Artist with artistName: " + artistName + " found.");
                listWithArtistsToServe.add(artist);
            }
        }
        if (listWithArtistsToServe.isEmpty()) {
            log.info("Artist with artistName: " + artistName + " was not found.");
            throw new IllegalStateException("The artist does not exist.");
        }
        return listWithArtistsToServe;
    }

}