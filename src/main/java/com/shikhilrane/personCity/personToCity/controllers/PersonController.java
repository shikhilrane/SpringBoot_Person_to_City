package com.shikhilrane.personCity.personToCity.controllers;

import com.shikhilrane.personCity.personToCity.dto.CityDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDto;
import com.shikhilrane.personCity.personToCity.entities.City;
import com.shikhilrane.personCity.personToCity.service.CityService;
import com.shikhilrane.personCity.personToCity.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;
    private final ModelMapper modelMapper;

    @GetMapping("/{id}")
    public ResponseEntity<PersonDto> getPersonById(@PathVariable Long id) {
        Optional<PersonDto> person = personService.getPerson(id);
        return person.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
