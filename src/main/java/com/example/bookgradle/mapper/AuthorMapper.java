package com.example.bookgradle.mapper;

import com.example.bookgradle.dto.author.AuthorCreate;
import com.example.bookgradle.dto.author.AuthorResponse;
import com.example.bookgradle.dto.author.AuthorUpdate;
import com.example.bookgradle.entity.Authhor;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface AuthorMapper extends BaseMapper<
        Authhor,
        AuthorResponse,
        AuthorCreate,
        AuthorUpdate> {
}
