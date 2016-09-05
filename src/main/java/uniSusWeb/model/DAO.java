package uniSusWeb.model;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public abstract class DAO implements Modelo {	
	protected Session getCurrentDBSession(){
		//FIXME: isso me parece muito errado pois parece inflxível, porcurar forma melhor
		//File file = new File("C:/ProjetoFinal/uniSusWeb/src/main/java/hibernate.cfg.xml");
		
		Configuration configuration = new Configuration();
		//configuration.configure(file);
		configuration.configure();
		
		StandardServiceRegistryBuilder standardServiceBuilder = configuration.getStandardServiceRegistryBuilder();
		StandardServiceRegistry standardService = standardServiceBuilder.build();
		
		SessionFactory buildSessionFactory = configuration.buildSessionFactory(standardService);
		
		
		return buildSessionFactory.openSession();
	}
}
