package com.easybusiness.modelmanagement.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bank.class)
public abstract class Bank_ {

	public static volatile SingularAttribute<Bank, Date> modifiedOn;
	public static volatile SingularAttribute<Bank, String> address;
	public static volatile SingularAttribute<Bank, String> bankName;
	public static volatile SingularAttribute<Bank, String> location;
	public static volatile SingularAttribute<Bank, String> modifiedBy;
	public static volatile SingularAttribute<Bank, Long> id;

}

