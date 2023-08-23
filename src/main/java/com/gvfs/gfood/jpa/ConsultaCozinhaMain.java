package com.gvfs.gfood.jpa;

import com.gvfs.gfood.GvfsFoodApiApplication;
import com.gvfs.gfood.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(GvfsFoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

        List<Cozinha> cozinhas = cadastroCozinha.listar();

        for (Cozinha cozinha :
                cozinhas) {
            System.out.println(cozinha.getNome());
        }
    }
}
