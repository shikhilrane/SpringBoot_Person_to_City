package com.shikhilrane.personCity.personToCity.service;

import com.shikhilrane.personCity.personToCity.dto.PersonDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDtoForCity;

import java.util.List;

public interface CityService {
    List<PersonDtoForCity> getAllPersons(Long id);
}
