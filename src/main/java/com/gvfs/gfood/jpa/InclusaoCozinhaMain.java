package com.gvfs.gfood.jpa;

import com.gvfs.gfood.GvfsFoodApiApplication;
import com.gvfs.gfood.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class InclusaoCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(GvfsFoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        Cozinha cozinha1 = new Cozinha();
        cozinha1.setNome("Mexicana");

        Cozinha cozinha2 = new Cozinha();
        cozinha2.setNome("Árabe");

        cadastroCozinha.adicionar(cozinha1);
        cadastroCozinha.adicionar(cozinha2);
    }
}
