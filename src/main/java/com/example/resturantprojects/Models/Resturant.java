package com.example.resturantprojects.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Resturant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String img;
    private String description;


    public Resturant(){ 
        
    }

    public Resturant(Long id,String name , String address , String img , String description){
        this.id=id;
        this.name=name;
        this.address=address;
        this.img=img;
        this.description=description;
    
  }

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

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
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


   }