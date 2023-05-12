package com.example.bookgradle.service;

import com.example.bookgradle.dto.books.BookCreate;
import com.example.bookgradle.dto.books.BookResponse;
import com.example.bookgradle.dto.books.BookUpdate;
import com.example.bookgradle.entity.Books;
import com.example.bookgradle.mapper.BookMapper;
import com.example.bookgradle.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService extends AbstractService<BookRepository> implements GenericService<
        BookResponse, BookUpdate, BookCreate,Long> {

//    @Autowired
//    private BookMapper bookMapper;
    private final AddressService addressService;

    private final AuthorService authorService;

    private final ImagesService imagesService;

    protected BookService(BookRepository repository, AddressService addressService,
                          AuthorService authorService, ImagesService imagesService) {
        super(repository);
        this.addressService = addressService;
        this.authorService = authorService;
        this.imagesService = imagesService;
    }

    @Override
    public BookResponse create(BookCreate createDto) {
        addressService.createAt(createDto.address);
        authorService.creatAt(createDto.authhor);
        imagesService.createAt(createDto.images);
        Books books = Books.builder()
                .title(createDto.title)
                .body(createDto.body)
                .name(createDto.name)
                .images(createDto.images)
                .authhor(createDto.authhor)
                .address(createDto.address)
                .build();
        Books save = repository.save(books);
        return BookResponse.builder()
                .title(save.getTitle())
                .name(save.getName())
                .build();
    }

    @Override
    public BookResponse update(BookUpdate updateDto) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }

    @Override
    public BookResponse get(Long id) {
        return null;
    }

    @Override
    public List<BookResponse> getAll() {
        return null;
    }

    public List<Books> getAllList() {
        return repository.findAll();
    }
}
