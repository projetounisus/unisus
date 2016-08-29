package uniSusWeb.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public abstract class DAO implements Modelo {
	protected SessionFactory getSessionFactory(){
		return new AnnotationConfiguration().configure().buildSessionFactory();
	}
}
