/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tuvamusic.music.repository;

import com.tuvamusic.music.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kbuty
 */
public interface SongRepository extends JpaRepository<Song, String>{
    
}
