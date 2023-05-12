package com.example.bookgradle.mapper;

import com.example.bookgradle.dto.address.AddressCreate;
import com.example.bookgradle.dto.address.AddressResponse;
import com.example.bookgradle.dto.address.AddressUpdate;
import com.example.bookgradle.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AddressMapper extends BaseMapper<
        Address,
        AddressResponse,
        AddressCreate,
        AddressUpdate> {
}
