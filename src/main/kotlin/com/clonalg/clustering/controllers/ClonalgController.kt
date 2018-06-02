package com.clonalg.clustering.controllers

import com.clonalg.clustering.services.ClonalgService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/clonalg")
class ClonalgController(val clonalgService: ClonalgService) {

    @GetMapping
    fun run(): ResponseEntity<String> {
        return ResponseEntity.ok("Ok")
    }

}