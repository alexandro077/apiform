package br.com.formulario.apiform.service;

import br.com.formulario.apiform.dto.Formulario;
import br.com.formulario.apiform.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Optional;

public class FormularioService {
    @Autowired
    private FormularioRepository formularioRepository;

    @Autowired
    private JavaMailSender mailSender;

    public Formulario salvar(Formulario formulario){
        Formulario formularioSalvo = formularioRepository.save(formulario);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("");
        message.setTo("");
        message.setSubject("");
        message.setText("Novo contato:\n" +
        "Nome: " + formularioSalvo.getNome() + "\n" +
                "Email: " + formularioSalvo.getEmail() + "\n" +
                "Telefone: " + formularioSalvo.getTelefone() + "\n" +
                "Mensagem: " + formularioSalvo.getMensagem());
        mailSender.send(message);
        return formularioSalvo;
    }

    public Optional<Formulario> buscarPorId(Long id) {
        return null;
    }
}
