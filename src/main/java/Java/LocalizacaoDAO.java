package Java;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class LocalizacaoDAO extends BaseDAO<Localizacao>{
  @Autowired private SessionFactory sessionFactory;
   
//  @Transactional
//  public List<Localizacao> findAll() {
//    Session session = sessionFactory.getCurrentSession();
//    List Localizacoes = session.createQuery("from Localizacao").list();
//    return Localizacoes;
//  }
}
