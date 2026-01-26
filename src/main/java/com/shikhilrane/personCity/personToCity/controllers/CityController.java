package com.shikhilrane.personCity.personToCity.controllers;

import com.shikhilrane.personCity.personToCity.dto.PersonDtoForCity;
import com.shikhilrane.personCity.personToCity.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping("/{getPersonsByCityId}")
    public ResponseEntity<List<PersonDtoForCity>> getPersonsByCity(@PathVariable (name = "getPersonsByCityId") Long id){
        List<PersonDtoForCity> city = cityService.getAllPersons(id);
        return ResponseEntity.ok(city);
    }
}
