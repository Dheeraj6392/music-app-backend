package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Music;
import com.example.repository.MusicRepository;

@Service
public class MusicService {
     
    @Autowired
    private MusicRepository musicRepository;

    public List<Music>getAllMusic(){
        return musicRepository.findAll();
    }

    public Music saveMusic(Music song) {
        return musicRepository.save(song);
    }
}
