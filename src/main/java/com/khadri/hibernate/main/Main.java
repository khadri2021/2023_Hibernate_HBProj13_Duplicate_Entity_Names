package com.khadri.hibernate.main;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.entities1.Test;

public class Main {

	public static void main(String[] args) throws Exception {

		Configuration cfg = new Configuration();

		Properties properties = new Properties();
		properties.load(new FileReader(new File("src/main/resources/hb.properties")));
		cfg.addProperties(properties);

		// Entity Mapping
		cfg.addAnnotatedClass(Test.class);// entity resource mapping in java
		cfg.addAnnotatedClass(com.khadri.hibernate.entities2.Test.class);// entity resource mapping in java

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction txn = session.beginTransaction();

		Test order = new Test();
		order.setId(1L);
		order.setOrderName("NAME");

		session.save(order);
		
		
		com.khadri.hibernate.entities2.Test test = new com.khadri.hibernate.entities2.Test();
		test.setId(2L);
		test.setOrderName("SOME NAME");

		session.save(test);
		txn.commit();
		session.close();
		factory.close();

	}
}
