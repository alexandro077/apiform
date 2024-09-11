package br.com.formulario.apiform.service;

import br.com.formulario.apiform.dto.Formulario;
import br.com.formulario.apiform.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class FormularioService {
    @Autowired
    private FormularioRepository formularioRepository;

    public Formulario salvarFormulario(Formulario formulario) {
        return formularioRepository.save(formulario);

    }
}
