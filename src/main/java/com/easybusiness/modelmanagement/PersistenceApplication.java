package com.easybusiness.modelmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.easybusiness.modelmanagement.bank.BankDao;
import com.easybusiness.modelmanagement.branch.BranchDao;
import com.easybusiness.modelmanagement.menu.MenuDao;
import com.easybusiness.modelmanagement.role.RoleDao;
import com.easybusiness.modelmanagement.roleactionmap.RoleActionMapDao;
import com.easybusiness.modelmanagement.submenu.SubMenuDao;
import com.easybusiness.modelmanagement.user.UserDao;
import com.easybusiness.modelmanagement.userbankmap.UserBankMapDao;
import com.easybusiness.modelmanagement.usergroup.UserGroupDao;
import com.easybusiness.modelmanagement.usergroupmap.UserGroupMapDao;
import com.easybusiness.modelmanagement.usergroupmenu.UserGroupMenuDao;
import com.easybusiness.modelmanagement.usermenu.UserMenuDao;
import com.easybusiness.modelmanagement.userrolemap.UserRoleMapDao;

@SpringBootApplication
public class PersistenceApplication implements CommandLineRunner {
    @Autowired
    UserDao userDao;

    @Autowired
    RoleDao roleDao;

    @Autowired
    MenuDao menuDao;

    @Autowired
    UserGroupDao userGroupDao;

    @Autowired
    UserGroupMapDao userGroupMapDao;

    @Autowired
    UserMenuDao userMenuDao;

    @Autowired
    UserGroupMenuDao userGroupMenuDao;

    @Autowired
    UserRoleMapDao userRoleMapDao;

    @Autowired
    RoleActionMapDao roleActionMapDao;

    @Autowired
    BankDao bankDao;

    @Autowired
    BranchDao branchDao;
    
    @Autowired
    UserBankMapDao userBankMapDao;
    
    @Autowired
    SubMenuDao subMenuDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(PersistenceApplication.class);

    public static void main(String[] args) {
	SpringApplication.run(PersistenceApplication.class, args);
	LOGGER.info("inside Persistence App");

    }

    @Override
    public void run(String... args) throws Exception {
	LOGGER.info("inside run");
	/* UserDao userDao=new UserDao();
	LOGGER.info("size of array is " + userDao.findAll().size());*/

	/*roleDao.findRoleById(1L);

	menuDao.findAll().size();

	userGroupDao.findAll().size();

	userGroupMapDao.findAll().size();

	userMenuDao.findAll().size();

	userGroupMenuDao.findAll().size();

	userRoleMapDao.findAll().size();
	userRoleMapDao.findUserRoleMapById(1L);

	roleActionMapDao.findAll().size();
	roleActionMapDao.findRoleActionMapById(1L);

	bankDao.findAll().size();

	branchDao.findAll().size();
	
	userBankMapDao.findAll().size();
	
	subMenuDao.findAll().size();*/

    }

}
