package com.application.rest.Controllers;

import com.application.rest.Controllers.DTO.MakerDTO;
import com.application.rest.Service.IMakerService;
import com.application.rest.entities.maker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping ("/api/maker")


public class MakerController {

    @Autowired
    private IMakerService makerService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
       Optional<maker> makerOptional = makerService.findById(id);

       if(makerOptional.isPresent()) {
          maker Maker = makerOptional.get();
          MakerDTO makerDTO = MakerDTO.builder()
                  .id(Maker.getId())
                  .name(Maker.getName())
                  .productsList(Maker.getProductsList())
                  .build();
          return ResponseEntity.ok(makerDTO);


       }
       return ResponseEntity.notFound().build();

    }




    }



    }









