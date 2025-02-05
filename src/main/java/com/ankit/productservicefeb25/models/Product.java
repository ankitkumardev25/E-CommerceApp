package com.ankit.productservicefeb25.models;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class Product extends BaseModel{
    private String title;
    private String description;
    private BigDecimal price;
    private String imageUrl;
    private Category category;
}
