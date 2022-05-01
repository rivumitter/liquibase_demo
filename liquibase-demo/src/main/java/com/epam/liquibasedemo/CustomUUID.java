package com.epam.liquibasedemo;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.UUIDGenerator;

public class CustomUUID extends UUIDGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		
		Serializable id = session.getEntityPersister(null, object).getClassMetadata().getIdentifier(object,session);
		return id!=null ? id : super.generate(session, object);
	}
	
	

}
