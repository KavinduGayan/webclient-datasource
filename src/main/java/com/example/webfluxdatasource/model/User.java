package com.example.webfluxdatasource.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {
    private long userId;
    private String username;
    private Date date=new Date();
}
