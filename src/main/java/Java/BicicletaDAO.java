package Java;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class BicicletaDAO extends BaseDAO<Bicicleta> {
  @Autowired private SessionFactory sessionFactory;
   
//  @Transactional
//  public List<Bicicleta> findAll() {
//    Session session = sessionFactory.getCurrentSession();
//    List Bicicletas = session.createQuery("from bicicleta").list();
//    return Bicicletas;
//  }
}
