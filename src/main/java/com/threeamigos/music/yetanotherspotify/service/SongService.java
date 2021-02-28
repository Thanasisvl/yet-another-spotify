package com.threeamigos.music.yetanotherspotify.service;

import com.threeamigos.music.yetanotherspotify.model.Song;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class SongService {

    //    TODO: Transfer Service to external module
    private List<Song> mockedSongsList = new ArrayList<>(List.of(
            new Song(1, 1, "For whom the bell tolls", "Ride the Lightning", "Metallica", 1984),
            new Song(2, 1, "Master of Puppets", "Master of Puppets", "Metallica", 1986),
            new Song(3, 1, "The call of Ktulu", "Ride the Lightning", "Metallica", 1984),
            new Song(4, 2, "Black Sabbath", "Black Sabbath", "Black Sabbath", 1970),
            new Song(5, 2, "War Pigs", "Paranoid", "Black Sabbath", 1970),
            new Song(6, 2, "Children of the grave", "Master of Reality", "Black Sabbath", 1972),
            new Song(7, 3, "Gardenia", "Welcome to Sky Valley", "Kyuss", 1994),
            new Song(8, 3, "Space Cadet", "Welcome to Sky Valley", "Kyuss", 1994),
            new Song(9, 3, "Demon Cleaner", "Welcome to Sky Valley", "Kyuss", 1994),
            new Song(10, 4, "Dazed and Confused", "Led Zeppelin", "Led Zeppelin", 1969),
            new Song(11, 4, "Whole Lotta Love", "Led Zeppelin II", "Led Zeppelin", 1969),
            new Song(12, 4, "Immigrant Song", "Led Zeppelin III", "Led Zeppelin", 1970),
            new Song(13, 4, "Schism", "Lateralus", "Tool", 2001),
            new Song(14, 4, "Parabola", "Lateralus", "Tool", 2001),
            new Song(15, 4, "Right in Two", "10,000 days", "Tool", 2006)
    ));

    public List<Song> getSongsByArtistId(int artistId) {
        List<Song> listWithSongsToServe = new ArrayList<>();
        for (Song song : mockedSongsList) {
            if (song.getArtistId() == artistId) {
                log.info("Song found. Adding to list.");
                listWithSongsToServe.add(song);
            }
        }
        return listWithSongsToServe;
    }
}
