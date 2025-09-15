package com.example.resturantprojects.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resturantprojects.Models.Resturant;
import com.example.resturantprojects.Repository.ResturantRepo;


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
       public Optional<Resturant> getSingleResturant(@PathVariable  Long id){
        return resturantRepo.findById(id);
     }

     @PostMapping("/add")
     public Resturant addResturant(@RequestBody Resturant resturant){
        return resturantRepo.save(resturant);
     }
       
     @PutMapping("update/{id}")
      public Resturant updateResturant(@PathVariable Long id, @RequestBody Resturant resturant){
         Resturant rest=resturantRepo.findById(id).get();
         rest.setName(resturant.getName());
         rest.setAddress(rest.getAddress());
         rest.setImg(rest.getImg());
         rest.setDescription(rest.getDescription());
         
         return  resturantRepo.save(resturant);       
     }

   //   @DeleteMapping("delete/{id}")
   //   public String  deleteResturant(@PathVariable Long id){
   //      if(resturantRepo.existsById(id)){
   //         resturantRepo.deleteById(id);

   //         return "Successfully deleted by dish : " +id;
   //      }
   //      else
   //        return "Failed";
   //   }

     @DeleteMapping("delete/{id}")
     public void deleteResturant(@PathVariable Long id){
        resturantRepo.deleteById(id);
     }  
}
