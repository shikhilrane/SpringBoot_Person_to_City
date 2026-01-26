package com.shikhilrane.personCity.personToCity.service.ServiceImplmentations;

import com.shikhilrane.personCity.personToCity.dto.CityDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDtoForCity;
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
    public List<PersonDtoForCity> getAllPersons(Long id) {
        return personRepository.findByCityId(id)
                .stream()
                .map(p -> {
                    PersonDtoForCity dto = new PersonDtoForCity();
                    dto.setId(p.getId());
                    dto.setName(p.getName());
                    dto.setAge(p.getAge());
                    dto.setCityName(p.getCity().getName());
                    return dto;
                }).toList();
    }
}
