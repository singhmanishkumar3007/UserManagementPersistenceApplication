package com.easybusiness.modelmanagement.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SubMenu.class)
public abstract class SubMenu_ {

	public static volatile SingularAttribute<SubMenu, Date> modifiedTime;
	public static volatile SingularAttribute<SubMenu, String> subMenu;
	public static volatile SingularAttribute<SubMenu, String> modifiedBy;
	public static volatile SingularAttribute<SubMenu, Long> id;
	public static volatile SingularAttribute<SubMenu, Menu> menu;

}

