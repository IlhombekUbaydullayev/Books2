package com.example.bookgradle.mapper;

import com.example.bookgradle.dto.BaseDto;
import com.example.bookgradle.dto.GenericDto;
import com.example.bookgradle.entity.BaseEntity;
import org.mapstruct.MappingTarget;

import java.util.List;

public interface BaseMapper<
        E extends BaseEntity,
        D extends GenericDto,
        CD extends BaseDto,
        UD extends GenericDto> extends GenericMapper {

    D toDto(E e);

    List<D> toDto(List<E> e);

    E fromCreateDto(CD cd);

    void fromUpdateDto(UD ud, @MappingTarget E entity);

}
