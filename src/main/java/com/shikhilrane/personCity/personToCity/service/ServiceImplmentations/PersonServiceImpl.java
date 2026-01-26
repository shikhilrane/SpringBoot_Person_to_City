package com.shikhilrane.personCity.personToCity.service.ServiceImplmentations;

import com.shikhilrane.personCity.personToCity.dto.CityDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDto;
import com.shikhilrane.personCity.personToCity.entities.City;
import com.shikhilrane.personCity.personToCity.repositories.CityRepository;
import com.shikhilrane.personCity.personToCity.repositories.PersonRepository;
import com.shikhilrane.personCity.personToCity.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Optional<PersonDto> getPerson(Long id) {
        return personRepository.findById(id)
                .map(p -> {
                    PersonDto dto = new PersonDto();
                    dto.setId(p.getId());
                    dto.setName(p.getName());
                    dto.setAge(p.getAge());
                    dto.setCityName(p.getCity().getName());
                    dto.setState(p.getCity().getState());
                    dto.setCountry(p.getCity().getCountry());
                    dto.setAadhaarNumber(p.getAadharCard().getAadharNumber());

                    return dto;
                });
    }
}
