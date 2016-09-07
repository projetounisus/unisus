package uniSusWeb.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public abstract class DAO {	
	
	protected Session obterSessaoBanco(){
		Configuration configuration = new Configuration();
		configuration.configure();
		
		StandardServiceRegistryBuilder standardServiceBuilder = configuration.getStandardServiceRegistryBuilder();
		StandardServiceRegistry standardService = standardServiceBuilder.build();
		
		SessionFactory buildSessionFactory = configuration.buildSessionFactory(standardService);
		Session session = buildSessionFactory.openSession();
		
		return session;
	}
	
	protected void fecharSessaoBanco(Session session) {
		session.close();
	}
}
