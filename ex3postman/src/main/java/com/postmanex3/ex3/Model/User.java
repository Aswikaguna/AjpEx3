package com.postmanex3.ex3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DairyProducts")
public class User {
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String username;
    private String emailid;
    private String password;
    private String productquery; 
}
