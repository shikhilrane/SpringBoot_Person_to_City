package com.shikhilrane.personCity.personToCity.entities;

import com.shikhilrane.personCity.personToCity.entities.Type.RoleType;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private RoleType name;

    // Inverse Side & Multiple Role can be get by multiple Persons
    @ManyToMany(mappedBy = "roles")
    private List<Person> persons = new ArrayList<>();
}
