package triple.com.ecomerce.Entity;


import org.springframework.beans.BeanUtils;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import triple.com.ecomerce.DTO.usuarioDTO;



@Data
@Entity
@Table(name= "tbl_usuario")
public class UsuarioEntity {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 


    @Column(nullable = false )
    private String nome; 

    
    @Column(nullable = false )
    private String senha; 

    @Column(nullable = false, unique =  true)
    private String login; 

    
    @Column(nullable = false, unique = false )
    private String email;


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UsuarioEntity other = (UsuarioEntity) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    } 


    public UsuarioEntity(usuarioDTO usuario){
        BeanUtils.copyProperties(usuario, this);
    }

    public UsuarioEntity(){

    }
    


}
