package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mondee.*;
import com.payments.*;
import com.payment.Cheque;
import com.payment.CreditCard;
public class MainLogic {

	public static void main(String[] args) {

		Session se = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = se.beginTransaction();
		
		
		CreditCard obj = new CreditCard();
		obj.setPaymentId(101);
		obj.setAmount(24900);
		obj.setCardType("MASTER");
		se.save(obj);

		
		Cheque obj1 = new Cheque();
		obj1.setPaymentId(102);
		obj1.setAmount(24900);
		obj1.setChequeType("VISA");
		se.save(obj1);
		
		CreditCards objs = new CreditCards();
		objs.setPaymentsId(101);
		objs.setCardName("MASTER");
		se.save(objs);
		
		Cheques objes = new Cheques();
		objes.setPaymentsId(102);
		objes.setChequeName("SBI cheque");
		se.save(objes);
		
		Developer obj2 = new Developer();
		obj2.setEid(101);
		obj2.setName("sailaxmi");
		obj2.setAddress("kmm");
		se.save(obj2); 
		
		
		
		
		tx.commit();
		se.close();
		
		

	}
}
