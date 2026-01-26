package com.shikhilrane.personCity.personToCity.service.ServiceImplmentations;

import com.shikhilrane.personCity.personToCity.dto.PersonDto;
import com.shikhilrane.personCity.personToCity.entities.Person;
import com.shikhilrane.personCity.personToCity.repositories.PersonRepository;
import com.shikhilrane.personCity.personToCity.service.CityService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<PersonDto> getAllPersons(Long id) {

        List<Person> all = personRepository.findByCityId(id);

        return all.stream().map(p -> {
            PersonDto dto = new PersonDto();
            dto.setId(p.getId());
            dto.setName(p.getName());
            dto.setAge(p.getAge());
            dto.setCity_id(p.getCity().getId());
            return dto;
        }).collect(Collectors.toList());
    }
}
