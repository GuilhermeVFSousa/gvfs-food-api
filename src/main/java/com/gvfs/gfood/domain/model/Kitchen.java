package com.gvfs.gfood.domain.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Kitchen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kitchen kitchen = (Kitchen) o;
        return Objects.equals(id, kitchen.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
