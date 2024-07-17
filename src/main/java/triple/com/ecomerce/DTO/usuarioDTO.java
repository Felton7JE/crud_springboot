package triple.com.ecomerce.DTO;

import org.springframework.beans.BeanUtils;

import lombok.Data;
import triple.com.ecomerce.Entity.UsuarioEntity;

@Data
public class usuarioDTO {

    private Long id;

    private String nome;

    private String senha;

    private String login;

    private String email;


    

    public usuarioDTO(UsuarioEntity Usuario){

        BeanUtils.copyProperties(Usuario, this);

    }

    public usuarioDTO(){

    }

}
