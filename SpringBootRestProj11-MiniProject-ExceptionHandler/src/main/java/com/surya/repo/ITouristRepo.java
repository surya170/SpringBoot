package com.surya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.entity.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> {
        
}
