package com.easybusiness.modelmanagement.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserGroup.class)
public abstract class UserGroup_ {

	public static volatile SingularAttribute<UserGroup, Date> fromDate;
	public static volatile SingularAttribute<UserGroup, Date> modifiedOn;
	public static volatile SingularAttribute<UserGroup, String> userGroupName;
	public static volatile SingularAttribute<UserGroup, Date> toDate;
	public static volatile SingularAttribute<UserGroup, String> modifiedBy;
	public static volatile SingularAttribute<UserGroup, Long> id;
	public static volatile SingularAttribute<UserGroup, Long> isEnable;

}

