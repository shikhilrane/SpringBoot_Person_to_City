package com.shikhilrane.personCity.personToCity.mappers;

import com.shikhilrane.personCity.personToCity.dto.PersonDtoForCity;
import com.shikhilrane.personCity.personToCity.entities.Person;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfigurePersonDtoForCity {
    @Autowired
    private ModelMapper modelMapper;

    @PostConstruct
    public void configurePersonDtoForCity(){
        modelMapper.createTypeMap(Person.class, PersonDtoForCity.class)
                .addMappings(e -> {
                    e.map(src -> src.getCity().getName(), PersonDtoForCity::setCityName);
                });
    }
}
