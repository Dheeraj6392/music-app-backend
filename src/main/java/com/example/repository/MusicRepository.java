package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Music;

public interface MusicRepository extends JpaRepository<Music , Long>{

}
