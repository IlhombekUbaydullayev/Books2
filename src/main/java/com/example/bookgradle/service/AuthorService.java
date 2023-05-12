package com.example.bookgradle.service;

import com.example.bookgradle.dto.author.AuthorCreate;
import com.example.bookgradle.dto.author.AuthorResponse;
import com.example.bookgradle.dto.author.AuthorUpdate;
import com.example.bookgradle.entity.Authhor;
import com.example.bookgradle.mapper.AuthorMapper;
import com.example.bookgradle.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService extends AbstractService<AuthorRepository> implements GenericService<
        AuthorResponse, AuthorUpdate, AuthorCreate,Long>{

//    private final AuthorMapper authorMapper;

    protected AuthorService(AuthorRepository repository) {
        super(repository);
    }

    @Override
    public AuthorResponse create(AuthorCreate createDto) {
        return null;
    }
    public Authhor creatAt(Authhor authhor) {
        return repository.save(authhor);
    }
    @Override
    public AuthorResponse update(AuthorUpdate updateDto) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }

    @Override
    public AuthorResponse get(Long id) {
        return null;
    }

    @Override
    public List<AuthorResponse> getAll() {
        return null;
    }
}
