package com.shikhilrane.personCity.personToCity.service.ServiceImplmentations;

import com.shikhilrane.personCity.personToCity.dto.CityCompanyDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDto;
import com.shikhilrane.personCity.personToCity.dto.PersonDtoForAll;
import com.shikhilrane.personCity.personToCity.dto.PersonDtoForCity;
import com.shikhilrane.personCity.personToCity.entities.City;
import com.shikhilrane.personCity.personToCity.entities.Person;
import com.shikhilrane.personCity.personToCity.repositories.CityRepository;
import com.shikhilrane.personCity.personToCity.repositories.PersonRepository;
import com.shikhilrane.personCity.personToCity.service.CityService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final PersonRepository personRepository;
    private final CityRepository cityRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<PersonDtoForCity> getAllPersons(Long id) {
        List<Person> byCityId = personRepository.findByCityId(id);
        if (byCityId.isEmpty()) {
            throw new RuntimeException("No City found for this id : " + id);
        }
        return byCityId
                .stream()
//                .map(p -> {
//                    PersonDtoForCity personDto = new PersonDtoForCity();
//                    personDto.setId(p.getId());
//                    personDto.setName(p.getName());
//                    personDto.setAge(p.getAge());
//                    personDto.setCityName(p.getCity().getName());
//                    return personDto;
//                })
                .map(e -> modelMapper.map(e,PersonDtoForCity.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<PersonDtoForAll> getAllPersonList() {
        List<Person> all = personRepository.findAll();
        return all
                .stream()
//                .map((person) -> {
//                    PersonDtoForAll dto = modelMapper.map(person, PersonDtoForAll.class);
//                    // Setting up the city fields manually
//                    if (person.getCity() != null) {
//                        dto.setCityName(person.getCity().getName());
//                        dto.setState(person.getCity().getState());
//                        dto.setCountry(person.getCity().getCountry());
//                    }
//                    return dto;
//                })
                .map(all1 -> modelMapper.map(all1, PersonDtoForAll.class))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CityCompanyDto> getCityComapnies(Long id) {
        Optional<City> byId = cityRepository.findById(id);

        return byId.map(city -> modelMapper.map(city, CityCompanyDto.class));
    }
}
