package com.gvfs.gfood.jpa;

import com.gvfs.gfood.GvfsFoodApiApplication;
import com.gvfs.gfood.domain.model.Kitchen;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class InclusaoCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(GvfsFoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        Kitchen kitchen1 = new Kitchen();
        kitchen1.setNome("Mexicana");

        Kitchen kitchen2 = new Kitchen();
        kitchen2.setNome("Árabe");

        cadastroCozinha.adicionar(kitchen1);
        cadastroCozinha.adicionar(kitchen2);
    }
}
