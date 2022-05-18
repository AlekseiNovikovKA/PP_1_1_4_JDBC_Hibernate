package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args)   {

        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();
        userDao.createUsersTable();

        userDao.saveUser("Ivan", "Petrov", (byte) 20);
        userDao.saveUser("Danil", "Ivanov", (byte) 25);
        userDao.saveUser("Andrei", "Sidorov", (byte) 31);
        userDao.saveUser("Viktor", "Smirnov", (byte) 38);

        userDao.removeUserById(1);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        userDao.dropUsersTable();


    }
}
