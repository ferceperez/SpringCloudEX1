package com.zeuspec.practice1.web.controller;
import com.zeuspec.practice1.web.model.BeerDto;
import com.zeuspec.practice1.web.service.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/beer")
@org.springframework.web.bind.annotation.RestController
public class RestController
{
    private final BeerService beerService;

    public RestController(BeerService beerService) {
        this.beerService = beerService;
    }


    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") int beerId)
    {
        return new ResponseEntity<>(beerService.getBeerbyId(beerId), HttpStatus.OK);
    }
}
