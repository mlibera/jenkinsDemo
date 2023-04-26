package com.example.jenkinsDemo.model

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long, val name: String, val email: String, val password: String ) {
}