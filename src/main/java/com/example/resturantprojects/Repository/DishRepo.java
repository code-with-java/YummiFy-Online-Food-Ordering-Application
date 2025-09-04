package com.example.resturantprojects.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resturantprojects.Models.Dish;

public interface DishRepo  extends JpaRepository<Dish ,Integer>{

    List<Dish> findByResturant_Id(Long id);
} 