package com.zeuspec.practice1.web.service.impl;

import com.zeuspec.practice1.web.model.DogDto;
import com.zeuspec.practice1.web.service.DogService;
import org.springframework.stereotype.Service;

@Service
public class DogServiceImpl implements DogService
{

    @Override
    public DogDto getdogbyId(int dogId)
    {
        return DogDto.builder().dogId(dogId).name("Ares").breed("shnawser").age(7).build();
    }
}
