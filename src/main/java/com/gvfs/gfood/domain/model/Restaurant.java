package com.gvfs.gfood.domain.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "rate_shipping", nullable = false)
    private BigDecimal rateShipping;

    @ManyToOne
    @JoinColumn(name = "kitchen_id")
    private Kitchen kitchen;

    @ManyToOne
    @JoinColumn(name = "payment_option_id")
    private PaymentOption paymentOption;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
