package com.example.bookgradle.service;

import com.example.bookgradle.dto.address.AddressCreate;
import com.example.bookgradle.dto.address.AddressResponse;
import com.example.bookgradle.dto.address.AddressUpdate;
import com.example.bookgradle.entity.Address;
import com.example.bookgradle.mapper.AddressMapper;
import com.example.bookgradle.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService extends AbstractService<AddressRepository> implements GenericService<
        AddressResponse, AddressUpdate, AddressCreate,Long>{

//    @Autowired
//    private AddressMapper addressMapper;
    protected AddressService(AddressRepository repository) {
        super(repository);
    }

    @Override
    public AddressResponse create(AddressCreate createDto) {
        var address = Address.builder()
                .country(createDto.country)
                .houseNumber(createDto.houseNumber)
                .street(createDto.street)
                .build();
        Address save = repository.save(address);
        return AddressResponse.builder()
                .country(save.getCountry())
                .houseNumber(save.getHouseNumber())
                .street(save.getStreet())
                .build();
    }

    public Address createAt(Address address) {
        return repository.save(address);
    }

    @Override
    public AddressResponse update(AddressUpdate updateDto) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }

    @Override
    public AddressResponse get(Long id) {
        return null;
    }

    @Override
    public List<AddressResponse> getAll() {
        return null;
    }
}
