package com.easybusiness.modelmanagement.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Branch.class)
public abstract class Branch_ {

	public static volatile SingularAttribute<Branch, Bank> bank;
	public static volatile SingularAttribute<Branch, Date> modifiedOn;
	public static volatile SingularAttribute<Branch, String> address;
	public static volatile SingularAttribute<Branch, String> branchName;
	public static volatile SingularAttribute<Branch, String> modifiedBy;
	public static volatile SingularAttribute<Branch, Long> id;
	public static volatile SingularAttribute<Branch, String> ifscCode;

}

