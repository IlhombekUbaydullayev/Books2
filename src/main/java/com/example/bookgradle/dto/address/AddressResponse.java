package com.example.bookgradle.dto.address;

import com.example.bookgradle.dto.GenericDto;
import lombok.Builder;

@Builder
public class AddressResponse extends GenericDto {
    public String street;
    public int houseNumber;
    public String country;
}
