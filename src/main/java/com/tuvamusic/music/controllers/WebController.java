/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuvamusic.music.controllers;

import com.tuvamusic.music.model.Song;
import com.tuvamusic.music.repository.SongRepository;
import java.io.File;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class WebController {
    
    @Autowired
    SongRepository songRepository;
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @PostMapping("/add")
    public String handleFileUpload(@RequestParam("file")MultipartFile file) throws IOException{
        System.out.println(file.getOriginalFilename());
        String fileName = "C:\\Users\\kbuty\\Documents\\NetBeansProjects\\music\\src\\main"
                +File.separator+"resources"+File.separator+"static"
                +File.separator+file.getOriginalFilename();
        File f = new File(fileName);
        FileCopyUtils.copy(file.getBytes(), f);
        
        songRepository.save(new Song(file.getOriginalFilename()));
        
    return "redirect:/";
    }
}
