package com.zeuspec.practice1.web.service.impl;

import com.zeuspec.practice1.web.model.BeerDto;
import com.zeuspec.practice1.web.service.BeerService;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService
{
    @Override
    public BeerDto getBeerbyId(int beerId)
    {
        return BeerDto.builder().beerId(beerId).name("Zeus").style("Renal suport").build();
    }
}
