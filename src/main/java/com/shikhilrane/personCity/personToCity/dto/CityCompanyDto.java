package com.shikhilrane.personCity.personToCity.dto;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CityCompanyDto {
    private String name;
    private String state;
    private String country;
    private List<CompanyDto> companies;
}
