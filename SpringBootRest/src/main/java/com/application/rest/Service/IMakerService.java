package com.application.rest.Service;

import com.application.rest.entities.maker;

import java.util.List;
import java.util.Optional;

public interface IMakerService {

    List<maker> findAll();

    Optional<maker> findById(Long id);

    void save(maker maker);

    void deleteById(Long id);
}

