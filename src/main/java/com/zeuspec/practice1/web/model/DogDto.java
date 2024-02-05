package com.zeuspec.practice1.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DogDto
{
    private int dogId;
    private String name;
    private String breed;
    private int age;
}
