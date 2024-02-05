package com.zeuspec.practice1.web.controller;


import com.zeuspec.practice1.web.model.DogDto;
import com.zeuspec.practice1.web.service.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/dogs")
@RestController
public class DogController
{
    private final DogService dogService;

    public DogController(DogService dogService)
    {
        this.dogService = dogService;
    }

    @GetMapping({"/{dogId}"})
    public ResponseEntity<DogDto> getDog(@PathVariable("dogId") int dogId)
    {
        return new ResponseEntity<>(dogService.getdogbyId(dogId), HttpStatus.OK);
    }
}
