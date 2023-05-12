package com.example.bookgradle.dto.books;

import com.example.bookgradle.dto.GenericDto;
import com.example.bookgradle.dto.address.AddressResponse;
import com.example.bookgradle.dto.author.AuthorResponse;
import com.example.bookgradle.dto.images.ImagesResponse;
import lombok.Builder;

@Builder
public class BookResponse extends GenericDto {
    public String name;
    public String title;
    public String body;
    public AuthorResponse authhor;
    public ImagesResponse images;
    public AddressResponse address;
}
