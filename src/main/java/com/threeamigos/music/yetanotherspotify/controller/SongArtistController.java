package com.threeamigos.music.yetanotherspotify.controller;

import com.threeamigos.music.yetanotherspotify.model.Artist;
import com.threeamigos.music.yetanotherspotify.model.Song;
import com.threeamigos.music.yetanotherspotify.service.ArtistService;
import com.threeamigos.music.yetanotherspotify.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class SongArtistController {

    private final ArtistService artistService;
    private final SongService songService;

//    TODO: Transfer Services to external module (autoconfiguration)
//    This instantiates an object from an external module (autoconfiguration in dependencies,
//    that will be used in place of artistService and songService
//    @Autowired
//    private MusicContentService musicContentService;

//    TODO: remove constructor and use Lombok
    @Autowired
    public SongArtistController(ArtistService artistService, SongService songService) {
        this.artistService = artistService;
        this.songService = songService;
    }

    @GetMapping("/getArtists")
    public List<Artist> getArtist(@RequestParam(required=true) String artistName) {
        return artistService.getArtists(artistName);
    }

    @GetMapping("/getSongsByArtistId")
    public List<Song> getSongsByArtistId(@RequestParam(required = true) int artistId) {
        return songService.getSongsByArtistId(artistId);
    }

}
