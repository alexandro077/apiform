package br.com.formulario.apiform.Controller;

import br.com.formulario.apiform.dto.Formulario;
import br.com.formulario.apiform.service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/formulario")
public class FormularioController {
    @Autowired
    private FormularioService formularioService;

    @GetMapping

    public ResponseEntity<Formulario> buscarFormulario(@PathVariable Long id) {
        Optional<Formulario> formulario = formularioService.buscarPorId(id);
        return formulario.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping
    public ResponseEntity<Formulario> atualizarFormulario(@PathVariable Long id, @RequestBody Formulario formulario) {
        Optional<Formulario> formularioExistente = formularioService.buscarPorId(id);
        if (formularioExistente.isPresent()) {
            formulario.setId(id);
            Formulario formularioAtualizado = formularioService.salvar(formulario);
            return ResponseEntity.ok(formularioAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**@DeleteMapping
    public ResponseEntity<Void> deletarFormulario(@PathVariable Long id) {
        formularioService.deletar(id);
        return ResponseEntity.noContent().build();
    }*/
}
