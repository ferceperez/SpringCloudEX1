package com.zeuspec.practice1.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto
{
    private int beerId;
    private String name;
    private String style;
    private Long upc;
}
