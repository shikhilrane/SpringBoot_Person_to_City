package com.shikhilrane.personCity.personToCity.service;

import com.shikhilrane.personCity.personToCity.dto.PersonDto;

import java.util.List;

public interface CityService {
    List<PersonDto> getAllPersons(Long id);
}
