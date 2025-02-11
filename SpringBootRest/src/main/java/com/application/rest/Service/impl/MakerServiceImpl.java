package com.application.rest.Service.impl;

import com.application.rest.Persistence.IMakerDWO;
import com.application.rest.Service.IMakerService;
import com.application.rest.entities.maker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MakerServiceImpl implements IMakerService {

    @Autowired
    private IMakerDWO makerDWO;

    @Override
    public List<maker> findAll() {
        return makerDWO.findAll();
    }

    @Override
    public Optional<maker> findById(Long id) {
        return makerDWO.findById(id);
    }

    @Override
    public void save(maker maker) {
      makerDWO.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        makerDWO.deleteById(id);

    }
}
