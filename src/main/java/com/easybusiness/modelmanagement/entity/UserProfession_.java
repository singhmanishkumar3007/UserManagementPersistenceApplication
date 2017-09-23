package com.easybusiness.modelmanagement.entity;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserProfession.class)
public abstract class UserProfession_ {

	public static volatile SingularAttribute<UserProfession, String> primarySkillDuration;
	public static volatile SingularAttribute<UserProfession, String> prevTechnology;
	public static volatile SingularAttribute<UserProfession, String> primarySkill;
	public static volatile SingularAttribute<UserProfession, String> prevOnsiteDuration;
	public static volatile SingularAttribute<UserProfession, String> prevDesignation;
	public static volatile SingularAttribute<UserProfession, String> totalExp;
	public static volatile SingularAttribute<UserProfession, String> relevantExp;
	public static volatile SingularAttribute<UserProfession, String> prevAchievement;
	public static volatile SingularAttribute<UserProfession, Date> prevToDate;
	public static volatile SingularAttribute<UserProfession, String> prevOrganization;
	public static volatile SingularAttribute<UserProfession, Long> id;
	public static volatile SingularAttribute<UserProfession, Date> prevFromDate;
	public static volatile SingularAttribute<UserProfession, User> user;

}

