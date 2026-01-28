package com.shikhilrane.personCity.personToCity.mappers;

import com.shikhilrane.personCity.personToCity.dto.PersonDto;
import com.shikhilrane.personCity.personToCity.entities.Person;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConfigurePersonDto {

    @Autowired
    private ModelMapper modelMapper;

    @PostConstruct
    public void configurePersonDto(){
        modelMapper.createTypeMap(Person.class, PersonDto.class)
                .addMappings(e -> {
                    e.map(src -> src.getCity().getName(), PersonDto::setCityName);
                    e.map(src -> src.getCity().getState(), PersonDto::setState);
                    e.map(src -> src.getCity().getCountry(), PersonDto::setCountry);
                    e.map(src -> src.getAadharCard().getAadharNumber(), PersonDto::setAadhaarNumber);
                });
    }
}
