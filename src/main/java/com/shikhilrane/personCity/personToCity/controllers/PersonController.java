package com.shikhilrane.personCity.personToCity.controllers;

import com.shikhilrane.personCity.personToCity.dto.PersonDto;
import com.shikhilrane.personCity.personToCity.service.PersonService;
import lombok.RequiredArgsConstructor;
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

    @GetMapping("/{personById}")
    public ResponseEntity<PersonDto> getPersonById(@PathVariable(name = "personById") Long id) {
        Optional<PersonDto> person = personService.getPerson(id);
        return person
                .map(person1 ->ResponseEntity.ok(person1))
                .orElse(ResponseEntity.notFound().build());
    }

}
