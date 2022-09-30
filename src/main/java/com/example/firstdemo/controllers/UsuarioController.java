package com.example.firstdemo.controllers;

import com.example.firstdemo.models.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController()

public class UsuarioController {
    @GetMapping(value = "usuario/{Id}")
     public Usuario user(@PathVariable() Long Id){
        Usuario usuario = new Usuario();
        usuario.setId(Id);
        usuario.setNombre("Gerald");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("gedgonz@gmail.com");
        usuario.setTelefono("57028362");
        return usuario;
     }

    @PutMapping(value ="usuario/edit")
    public Usuario edit(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Gerald");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("gedgonz@gmail.com");
        usuario.setTelefono("57028362");
        return usuario;
    }
    @DeleteMapping(value="usuario/delete")
    public Usuario delete(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Gerald");
        usuario.setApellido("Gonzalez");
        usuario.setEmail("gedgonz@gmail.com");
        usuario.setTelefono("57028362");
        return usuario;
    }
}
