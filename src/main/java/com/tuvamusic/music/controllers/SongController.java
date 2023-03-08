/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuvamusic.music.controllers;

import com.tuvamusic.music.model.Song;
import com.tuvamusic.music.repository.SongRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kbuty
 */
@RestController
public class SongController {
         
    @Autowired
    SongRepository songRepository;
    
    @GetMapping("/songs")
    public List<Song> getAllSong(){
        return songRepository.findAll();
    }
    
//    @GetMapping("/play")
//    public Song getSongById(String id){
//        return songRepository.getReferenceById(id);
//    }
    
    @GetMapping("/play")
    public Song getSong(){
        return new Song("AIDARBEKOV REMIX.mp3", "123");
    }
}
