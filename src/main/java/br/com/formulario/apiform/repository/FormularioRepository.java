package br.com.formulario.apiform.repository;

import br.com.formulario.apiform.dto.Formulario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FormularioRepository extends JpaRepository<Formulario, Long> {

}
