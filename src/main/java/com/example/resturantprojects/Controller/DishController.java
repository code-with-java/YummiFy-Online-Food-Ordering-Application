package com.example.resturantprojects.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resturantprojects.Models.Dish;
import com.example.resturantprojects.Repository.DishRepo;




@RestController 
@CrossOrigin("*")
@RequestMapping("/api/disk/")
public class DishController {
    
     @Autowired
     private DishRepo dishRepo;

    @GetMapping("/list")
    public List<Dish> getMethodName() {
        return dishRepo.findAll();
    }

    @GetMapping("/byresturant/{id}")
    public List<Dish> getMethodName(@PathVariable Long  id) {
        return dishRepo.findByResturant_Id(id);
    }
    

    @PostMapping("/add")
        public Dish adddish(@RequestBody Dish dish){
            return dishRepo.save(dish);
        }
    }

