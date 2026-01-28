package com.shikhilrane.personCity.personToCity.service.ServiceImplmentations;

import com.shikhilrane.personCity.personToCity.dto.CityDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDto;
import com.shikhilrane.personCity.personToCity.entities.City;
import com.shikhilrane.personCity.personToCity.repositories.CityRepository;
import com.shikhilrane.personCity.personToCity.repositories.PersonRepository;
import com.shikhilrane.personCity.personToCity.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    @Autowired
    private ModelMapper modelMapper;

    private final PersonRepository personRepository;

    @Override
    public Optional<PersonDto> getPerson(Long id) {
        return personRepository.findById(id)
                .map((element) -> {
                    PersonDto dto = modelMapper.map(element, PersonDto.class);

                    // override roles manually
                    dto.setRoles(
                            element.getRoles()
                                    .stream()
                                    .map(r -> r.getName().name())
                                    .toList()
                    );

                    return dto;
                });
    }
}
