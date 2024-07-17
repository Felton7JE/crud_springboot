package triple.com.ecomerce.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import triple.com.ecomerce.Repository.usuarioRep;
import triple.com.ecomerce.DTO.usuarioDTO;
import triple.com.ecomerce.Entity.UsuarioEntity;

@Service
public class usuarioService {
    

    @Autowired
    private usuarioRep usuarioRep; 


    //listar usuarios 
    public List<usuarioDTO> listarUsuario(){

        List<UsuarioEntity> usuarios = usuarioRep.findAll(); 
        return usuarios.stream().map(usuarioDTO::new).toList();

    }

//inserir usuarios 
    public void inserirUsusario(usuarioDTO usuario){

        UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);  
        usuarioRep.save(usuarioEntity); 

    }

//update usuarios 

public usuarioDTO alterarUsuario(usuarioDTO usuario){

    UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
    return new usuarioDTO(usuarioRep.save(usuarioEntity));

}


//apagar usuario 

public void apagarUsuario(Long id){
    
    UsuarioEntity usuarioEntity = usuarioRep.findById(id).get(); 
    
    usuarioRep.delete(usuarioEntity); 

}


}
