package com.shikhilrane.personCity.personToCity.service;

import com.shikhilrane.personCity.personToCity.dto.PersonDto;

import java.util.Optional;

public interface PersonService {
    Optional<PersonDto> getPerson(Long id);
}
