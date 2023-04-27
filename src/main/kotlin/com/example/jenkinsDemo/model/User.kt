package com.example.jenkinsDemo.model

import lombok.Getter
import lombok.Setter
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "User")
@Getter
@Setter
data class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
                var id: Long,
                val name: String,
                val email: String,
                val password: String){
}