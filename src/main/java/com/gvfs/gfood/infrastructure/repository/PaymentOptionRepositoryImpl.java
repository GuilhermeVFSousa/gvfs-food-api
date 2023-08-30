package com.gvfs.gfood.infrastructure.repository;

import com.gvfs.gfood.domain.model.PaymentOption;
import com.gvfs.gfood.domain.repository.PaymentOptionRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PaymentOptionRepositoryImpl implements PaymentOptionRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<PaymentOption> findAll() {
        return manager.createQuery("from PaymentOption", PaymentOption.class)
                .getResultList();
    }

    @Override
    public PaymentOption findById(Long id) {
        return manager.find(PaymentOption.class, id);
    }

    @Transactional
    @Override
    public PaymentOption save(PaymentOption paymentOption) {
        return manager.merge(paymentOption);
    }

    @Transactional
    @Override
    public void remove(PaymentOption paymentOption) {
        paymentOption = findById(paymentOption.getId());
        manager.remove(paymentOption);
    }
}
