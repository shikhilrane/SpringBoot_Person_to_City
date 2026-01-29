package com.shikhilrane.personCity.personToCity.controllers;

import com.shikhilrane.personCity.personToCity.dto.CityCompanyDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDtoForAll;
import com.shikhilrane.personCity.personToCity.dto.PersonDtoForCity;
import com.shikhilrane.personCity.personToCity.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping
    public ResponseEntity<List<PersonDtoForAll>> getAllPersons(){
        List<PersonDtoForAll> getAll = cityService.getAllPersonList();
        return ResponseEntity.ok(getAll);
    }

    @GetMapping("/getCity/{getPersonsByCityId}")
    public ResponseEntity<List<PersonDtoForCity>> getPersonsByCity(@PathVariable (name = "getPersonsByCityId") Long id){
        List<PersonDtoForCity> city = cityService.getAllPersons(id);
        return ResponseEntity.ok(city);
    }

    @GetMapping("/getCityCompany/{getCityCompanyById}")
    public ResponseEntity<CityCompanyDto> getCityCompany(@PathVariable(name = "getCityCompanyById") Long id){
       Optional<CityCompanyDto> getListOfCompany = cityService.getCityComapnies(id);
       return getListOfCompany
               .map(e -> ResponseEntity.ok(e))
               .orElseThrow(() -> new RuntimeException("City with given id not found " + id));
    }
}
