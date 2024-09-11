package br.com.formulario.apiform.Controller;

import br.com.formulario.apiform.dto.Formulario;
import br.com.formulario.apiform.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/formulario")
public class FormularioController {
    @Autowired
    private FormularioService formularioService;

    @PostMapping("/criar")
    public ResponseEntity<Formulario> salvarFormulario(@RequestBody Formulario formulario) {
        Formulario formularioSalvo = formularioService.salvarFormulario(formulario);
        return ResponseEntity.status(HttpStatus.CREATED).body(formularioSalvo);


    }



}
