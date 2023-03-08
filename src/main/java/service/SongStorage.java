/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.File;
import org.springframework.stereotype.Service;

@Service
public class SongStorage {
    
    public File getSong(){
        File file = new File("src/main/resources/static/AIDARBEKOV REMIX.mp3");
        return file;
    }
}
