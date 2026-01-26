package com.shikhilrane.personCity.personToCity.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDtoForCity {
    private Long id;
    private String name;
    private int age;
    private String cityName;
}
