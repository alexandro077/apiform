package br.com.formulario.apiform.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "formularios")
public class Formulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "Nome do formulário é obrigatório")
    private String nome;

    @Email(message = "Email inválido")
    @NotBlank(message = "Email é obrigatório")
    @Column(name = "email")
    private String email;


    @NotBlank(message = "Mensagem é obrigatória")
    private String mensagem;

    private String telefone;

    // Construtor (opcional)
    public Formulario() {

    }
}
