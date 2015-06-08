package Java;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class UsuarioDAO {
  @Autowired private SessionFactory sessionFactory;
   
  @Transactional
  public List<Usuario> findAll() {
    Session session = sessionFactory.getCurrentSession();
    List Usuarios = session.createQuery("from usuarios").list();
    return Usuarios;
  }
}
