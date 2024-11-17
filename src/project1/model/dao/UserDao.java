package project1.model.dao;

import project1.model.dto.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static UserDao userDao = new UserDao();
    public UserDao() {}


    public static UserDao getInstance() {
        return userDao;
    }

    public List<User> users = new ArrayList<>();


}
