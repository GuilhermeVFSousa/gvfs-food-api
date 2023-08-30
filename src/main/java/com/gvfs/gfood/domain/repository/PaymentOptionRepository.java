package com.gvfs.gfood.domain.repository;

import com.gvfs.gfood.domain.model.PaymentOption;

import java.util.List;

public interface PaymentOptionRepository {

    List<PaymentOption> findAll();

    PaymentOption findById(Long id);
    PaymentOption save(PaymentOption paymentOption);
    void remove(PaymentOption paymentOption);

}
