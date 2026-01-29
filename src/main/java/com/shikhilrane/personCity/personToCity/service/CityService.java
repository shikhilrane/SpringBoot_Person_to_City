package com.shikhilrane.personCity.personToCity.service;

import com.shikhilrane.personCity.personToCity.dto.CityCompanyDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDtoForAll;
import com.shikhilrane.personCity.personToCity.dto.PersonDtoForCity;

import java.util.List;
import java.util.Optional;

public interface CityService {
    List<PersonDtoForCity> getAllPersons(Long id);

    List<PersonDtoForAll> getAllPersonList();

    Optional<CityCompanyDto> getCityComapnies(Long id);
}
