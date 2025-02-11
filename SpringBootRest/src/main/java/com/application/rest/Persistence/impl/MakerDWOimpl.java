package com.application.rest.Persistence.impl;

import com.application.rest.Persistence.IMakerDWO;
import com.application.rest.entities.maker;
import com.application.rest.repository.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MakerDWOimpl implements IMakerDWO {

    @Autowired
    private MakerRepository makerRepository;

    @Override
    public List<maker> findAll() {
        return (List<maker>) makerRepository.findAll();
    }




    @Override
    public Optional<maker> findById(Long id) {
        return makerRepository.findById(id);
    }

    @Override
    public void save(maker maker) {
       makerRepository.save(maker);
    }




    @Override
    public void deleteById(Long id) {
     makerRepository.deleteById(id);
    }
}
