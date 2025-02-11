package com.application.rest.repository;


import com.application.rest.entities.maker;
import org.springframework.data.repository.CrudRepository;

public interface MakerRepository extends CrudRepository<maker, Long> {
    Long id(long id);
}
