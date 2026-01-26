package com.shikhilrane.personCity.personToCity.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {
    private Long id;

    private String name;
    private String state;
    private String country;
}
