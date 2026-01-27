package com.shikhilrane.personCity.personToCity.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDtoForAll {
    private Long id;
    private String name;
    private int age;
    private String cityName;
    private String state;
    private String country;
}
