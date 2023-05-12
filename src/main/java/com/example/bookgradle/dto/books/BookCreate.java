package com.example.bookgradle.dto.books;

import com.example.bookgradle.dto.BaseDto;
import com.example.bookgradle.entity.Address;
import com.example.bookgradle.entity.Authhor;
import com.example.bookgradle.entity.Images;

public class BookCreate implements BaseDto {
    public String name;
    public String title;
    public String body;
    public Authhor authhor;
    public Images images;

    public Address address;
}
