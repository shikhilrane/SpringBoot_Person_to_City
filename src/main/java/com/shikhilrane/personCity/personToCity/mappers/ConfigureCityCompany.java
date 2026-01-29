package com.shikhilrane.personCity.personToCity.mappers;

import com.shikhilrane.personCity.personToCity.dto.CityCompanyDto;
import com.shikhilrane.personCity.personToCity.dto.CompanyDto;
import com.shikhilrane.personCity.personToCity.entities.City;
import jakarta.annotation.PostConstruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConfigureCityCompany {

    @Autowired
    private ModelMapper modelMapper;

    @PostConstruct
    public void configureCityCompany() {
        modelMapper.createTypeMap(City.class, CityCompanyDto.class)
                .addMappings(m -> m.map(
                        src -> {
                            if (src.getCompanies() == null) return List.of();
                            return src.getCompanies()
                                    .stream()
                                    .map(c -> new CompanyDto(
                                            c.getId(),
                                            c.getName(),
                                            c.getIndustry()
                                    ))
                                    .toList();
                        },
                        CityCompanyDto::setCompanies
                ));
    }


}
