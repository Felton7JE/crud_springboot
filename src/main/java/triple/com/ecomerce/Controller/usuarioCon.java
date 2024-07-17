package triple.com.ecomerce.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import triple.com.ecomerce.DTO.usuarioDTO;
import triple.com.ecomerce.Service.usuarioService;

@RestController
@RequestMapping(value= "/Usuario")
public class usuarioCon {
    
@Autowired
private usuarioService usuarioService;
    


    @GetMapping
    public List<usuarioDTO> listarUsuario(){
        return usuarioService.listarUsuario(); 
    }


    @PostMapping
    public void inserirUsuario(@RequestBody usuarioDTO usuarioDTO){

        usuarioService.inserirUsusario(usuarioDTO);
    }

    
    @PutMapping
    public usuarioDTO alterarUsuario(@RequestBody usuarioDTO usuarioDTO){

        return usuarioService.alterarUsuario(usuarioDTO); 

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){

        usuarioService.apagarUsuario(id);
        return ResponseEntity.ok().build(); 
    }



}
