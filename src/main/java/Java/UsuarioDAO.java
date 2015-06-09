package Java;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import utils.HibernateUtils;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class UsuarioDAO extends BaseDAO<Usuario> {
	@Autowired private SessionFactory sessionFactory;
  
	@Transactional
	@Override
	public List<Usuario> findAll() {
	  Session session = HibernateUtils.getSession();
	  List<Object[]> lista = session.createQuery("select nome, cpf from Usuario").list();
	  
	  List<Usuario> usuarios = new ArrayList<Usuario>();
	  for(Object[] entity : lista){
		  Usuario user = new Usuario();
		  user.setNome((String)entity[0]);
		  user.setCpf((String)entity[1]);
		  usuarios.add(user);
	  }
	  
	  return usuarios;
	}
	
	public Usuario findByCpf(String cpf) {
	  beginTransaction();
	  Session session = HibernateUtils.getSession();
	  List result = session.createQuery("from Usuario where cpf = '" + cpf + "'").list();
	  commitTransaction();
	  
	  if(result != null && result.size() > 0)
		  return (Usuario) result.get(0);
	  return null;
	}
}
