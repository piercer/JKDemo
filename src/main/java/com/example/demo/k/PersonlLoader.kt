package com.example.demo.k

import com.example.demo.j.Directory
import org.springframework.stereotype.Component

@Component
class PersonLoader(val directory: Directory) {

    fun addUsers() {
        directory.addPerson("Kristen", "Bell", 38)
        directory.addPerson("William", "Harper", 39)
    }

}