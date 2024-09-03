package br.com.formulario.apiform.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FormularioServiceConfig {
    @Bean
    public FormularioService formularioService() {
        return new FormularioServiceImpl();
    }

}
