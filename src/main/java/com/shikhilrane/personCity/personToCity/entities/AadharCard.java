package com.shikhilrane.personCity.personToCity.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AadharCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String aadharNumber;

    // Inverse Side & & One Aadhaar can have one Persons in it
    @OneToOne(mappedBy = "aadharCard", fetch = FetchType.LAZY)
    private Person person;
}
