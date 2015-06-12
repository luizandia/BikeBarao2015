package Java;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import utils.HibernateUtils;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class EstacaoDAO extends BaseDAO<Estacao>{
  @Autowired private SessionFactory sessionFactory;
  
  public List<Estacao> getEstacaoBiciletaDefeito(){
	  Session session = HibernateUtils.getSession();
	  
	  SQLQuery query = session.createSQLQuery("SELECT e.id from Estacao as e INNER JOIN Bicicleta as b ON e.id = b.id_estacao WHERE b.estado = 'REPARAR' GROUP BY e.id");
	  query.addEntity(Estacao.class);
	  List<Estacao> lista = query.list();
	  return lista;
  }
   
//  @Transactional
//  public List<Estacao> findAll() {
//    Session session = sessionFactory.getCurrentSession();
//    List Estacoes = session.createQuery("from estacao").list();
//    return Estacoes;
//  }
}
