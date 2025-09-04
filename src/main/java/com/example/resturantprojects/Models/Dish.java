package com.example.resturantprojects.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String img;
   

    public Dish(Long id, String name, String description, String img) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.img = img;
       
    }

     public Dish() { }


     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getDescription() {
         return description;
     }

     public void setDescription(String description) {
         this.description = description;
     }

     public String getImg() {
         return img;
     }

     public void setImg(String img) {
         this.img = img;
     }

     

     public Resturant getResturant() { 
        return resturant; 
    }

    public void setResturant(Resturant resturant) { 
        this.resturant = resturant;
     }
     
 @ManyToOne
    @JoinColumn(name = "resturant_id", nullable = false)
    private Resturant resturant;

}