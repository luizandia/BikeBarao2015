package Java;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class FornecedorDAO {
  @Autowired private SessionFactory sessionFactory;
   
  @Transactional
  public List<Fornecedor> findAll() {
    Session session = sessionFactory.getCurrentSession();
    List Fornecedores = session.createQuery("from fornecedores").list();
    return Fornecedores;
  }
}
