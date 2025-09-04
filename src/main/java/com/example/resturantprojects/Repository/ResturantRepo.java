package com.example.resturantprojects.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resturantprojects.Models.Resturant;

public interface ResturantRepo extends JpaRepository<Resturant ,Long>{

    
} 
