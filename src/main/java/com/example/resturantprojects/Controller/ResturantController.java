package com.example.resturantprojects.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resturantprojects.Models.Resturant;
import com.example.resturantprojects.Repository.ResturantRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/resturant")
public class ResturantController {
    
      @Autowired
      private ResturantRepo resturantRepo;

     @GetMapping("/list")
     public List<Resturant> getMethodName() {
         return  resturantRepo.findAll();
     }


     @GetMapping("/{id}")
     public Optional<Resturant> getOneResturnat(Long id){
        return resturantRepo.findById(id);
     }

     @PostMapping("/add")
     public Resturant addResturant(@RequestBody Resturant resturant){
        return resturantRepo.save(resturant);
     }
     
}
