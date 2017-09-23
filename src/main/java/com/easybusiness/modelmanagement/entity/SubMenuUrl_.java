package com.easybusiness.modelmanagement.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SubMenuUrl.class)
public abstract class SubMenuUrl_ {

	public static volatile SingularAttribute<SubMenuUrl, SubMenu> subMenu;
	public static volatile SingularAttribute<SubMenuUrl, String> createdBy;
	public static volatile SingularAttribute<SubMenuUrl, Long> id;
	public static volatile SingularAttribute<SubMenuUrl, Date> createdOn;
	public static volatile SingularAttribute<SubMenuUrl, String> url;

}

