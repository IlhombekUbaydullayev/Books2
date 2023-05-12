package com.example.bookgradle.mapper;


import com.example.bookgradle.dto.books.BookCreate;
import com.example.bookgradle.dto.books.BookResponse;
import com.example.bookgradle.dto.books.BookUpdate;
import com.example.bookgradle.entity.Books;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface BookMapper extends BaseMapper<
        Books,
        BookResponse,
        BookCreate,
        BookUpdate> {
}
