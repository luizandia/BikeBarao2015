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
public class ConsertaDAO extends BaseDAO<Conserta> {
  @Autowired private SessionFactory sessionFactory;
  
}
