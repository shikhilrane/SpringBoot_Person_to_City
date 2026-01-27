package com.shikhilrane.personCity.personToCity.mappers;

import com.shikhilrane.personCity.personToCity.dto.PersonDtoForAll;
import com.shikhilrane.personCity.personToCity.entities.Person;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfigurePersonDtoForAllMapping {
    @Autowired
    private ModelMapper modelMapper;

    @PostConstruct
    public void configurePersonDtoForAllMapping() {
        modelMapper.createTypeMap(Person.class, PersonDtoForAll.class)
                .addMappings(m -> {
                    m.map(src -> src.getCity().getName(), PersonDtoForAll::setCityName);
                    m.map(src -> src.getCity().getState(), PersonDtoForAll::setState);
                    m.map(src -> src.getCity().getCountry(), PersonDtoForAll::setCountry);
                });
    }
}
