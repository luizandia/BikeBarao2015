package Java;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import utils.HibernateUtils;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class BicicletaDAO extends BaseDAO<Bicicleta> {
  @Autowired private SessionFactory sessionFactory;
  
  public List<Bicicleta> getBicicletasEmConserto(){
	  Session session = HibernateUtils.getSession();
	  
	  SQLQuery query = session.createSQLQuery("SELECT b.* from Bicicleta as b inner join Conserta as c on b.id = c.id_bicicleta where c.data_fim is null");
	  query.addEntity(Bicicleta.class);
	  List<Bicicleta> lista = query.list();
	  return lista;
  }
   
}
