package com.zeuspec.practice1.web.service;

import com.zeuspec.practice1.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerbyId(int beerId);
}
