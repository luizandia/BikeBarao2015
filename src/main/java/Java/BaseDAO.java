package Java;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;

import utils.HibernateUtils;

import com.sun.xml.internal.bind.v2.model.core.ID;

public abstract class BaseDAO<T> {
	 	private Class<T> persistentClass;  
//	    private Session session;  
	  
	    public BaseDAO() {
	    	ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
	        this.persistentClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
	     }  
	  
//	    @SuppressWarnings("unchecked")  
//	    public void setSession(Session s) {  
//	        this.session = s;  
//	    }  
//	  
//	    protected Session getSession() {  
//	        if (session == null || !session.isOpen())  
//	        	session = HibernateUtils.buildSessionFactory().openSession();  
//	        return session;  
//	    }  
	  
	    public Class<T> getPersistentClass() {  
	        return persistentClass;  
	    }
	    
	    public void beginTransaction() {
	    	HibernateUtils.beginTransaction();
	    }

	    public void commitTransaction() {
	    	HibernateUtils.commitTransaction();
	    }
	  
	    @SuppressWarnings("unchecked")  
	    public void save(T entity) {  
	    	HibernateUtils.getSession().saveOrUpdate(entity); 
	    }  
	  
	    public void delete(T entity) {  
	    	HibernateUtils.getSession().delete(entity);
	    }  
	  
	    @SuppressWarnings("unchecked")  
	    public List<T> findAll() {  
	    	return findByCriteria();  
	    }

	    /** 
	     * Use this inside subclasses as a convenience method. 
	     */  
	    @SuppressWarnings("unchecked")  
	    protected List<T> findByCriteria(Criterion... criterion) { 
	    	beginTransaction();
	    	Criteria crit = HibernateUtils.getSession().createCriteria(getPersistentClass());  
	    	for (Criterion c : criterion) {  
	    		crit.add(c);  
	    	}  
	    	commitTransaction();
	    	return crit.list();  
	    }  
	    
//	    @SuppressWarnings("unchecked")  
//	    public T findById(ID id, boolean lock) {  
//	        T entity;  
//	        if (lock)  
//	            entity = (T) getSession().load(getPersistentClass(), id, LockMode.UPGRADE);  
//	        else  
//	            entity = (T) getSession().load(getPersistentClass(), id);  
//	  
//	        return entity;  
//	    }  
//	  
//	  
//	    @SuppressWarnings("unchecked")  
//	    public List<T> findByExample(T exampleInstance, String[] excludeProperty) {  
//	        Criteria crit = getSession().createCriteria(getPersistentClass());  
//	        Example example =  Example.create(exampleInstance);  
//	        for (String exclude : excludeProperty) {  
//	            example.excludeProperty(exclude);  
//	        }  
//	        crit.add(example);  
//	        return crit.list();  
//	    }
	    
//	    public void flush() {  
//	        getSession().flush();  
//	    }  
//	  
//	    public void clear() {  
//	        getSession().clear();  
//	    }  
	  
}
