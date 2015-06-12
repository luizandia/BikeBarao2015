package Java;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import utils.HibernateUtils;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class AluguelDAO extends BaseDAO<Aluguel> {
  @Autowired private SessionFactory sessionFactory;
  
  public List<Aluguel> getAlugueisByClient(String cpfCliente){
	  Session session = HibernateUtils.getSession();
	  
	  SQLQuery query = session.createSQLQuery("SELECT * from Aluguel where cpf_usuario = " + cpfCliente);
	  query.addEntity(Aluguel.class);
	  List<Aluguel> lista = query.list();
	  return lista;
  }
  
  public Integer getNumAlugueisByBike(String id){
	  Session session = HibernateUtils.getSession();
	  
	  SQLQuery query = session.createSQLQuery("SELECT * from Aluguel where id_bicicleta = " + id);
	  query.addEntity(Aluguel.class);
	  List<Aluguel> lista = query.list();
	  if(lista != null && lista.size() > 0)
		  return lista.size();
	  return 0;
  }
  
  
//  @Transactional
//  public List<Bicicleta> findAll() {
//    Session session = sessionFactory.getCurrentSession();
//    List Bicicletas = session.createQuery("from bicicleta").list();
//    return Bicicletas;
//  }
}
