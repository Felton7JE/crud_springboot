package triple.com.ecomerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import triple.com.ecomerce.Entity.UsuarioEntity;


public interface usuarioRep extends JpaRepository<UsuarioEntity, Long> {
  
    

}
