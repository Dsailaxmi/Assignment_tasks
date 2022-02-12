package com.mondee;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class MainLogicmanytomany {

	public static void main(String[] args) {

		Session se = HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = se.beginTransaction();
		
		Students student=new Students();
		student.setStudentId(1);
		student.setStudentName("sailaxmi");
		
		Students student1=new Students();
		student1.setStudentId(2);
		student1.setStudentName("saisowmya");
		
		Students student2=new Students();
		student2.setStudentId(3);
		student2.setStudentName("saiprasanna");
		
		Set set1=new HashSet();
		set1.add(student);
		set1.add(student1);
		set1.add(student2);
		
		Branch branch = new Branch();
		branch.setBranchId(5);
		branch.setBranchName("CSE");

		Branch branch1 = new Branch();
		branch1.setBranchId(4);
		branch1.setBranchName("ECE");
		
		
		
		Set st = new HashSet();
		st.add(branch);
		st.add(branch1);

		student1.setObj(st);
		branch.setObj2(set1);
		branch1.setObj2(set1);
		
		se.save(branch);
		se.save(branch1);
		se.save(student);
		
		tx.commit();
		se.close();
		
		

	}
}
