package com.easybusiness.modelmanagement.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserGroupMenu.class)
public abstract class UserGroupMenu_ {

	public static volatile SingularAttribute<UserGroupMenu, Date> fromDate;
	public static volatile SingularAttribute<UserGroupMenu, Date> modifiedOn;
	public static volatile SingularAttribute<UserGroupMenu, Date> toDate;
	public static volatile SingularAttribute<UserGroupMenu, String> modifiedBy;
	public static volatile SingularAttribute<UserGroupMenu, Long> id;
	public static volatile SingularAttribute<UserGroupMenu, Menu> menuItem;
	public static volatile SingularAttribute<UserGroupMenu, UserGroup> userGroup;
	public static volatile SingularAttribute<UserGroupMenu, Long> isEnable;

}

