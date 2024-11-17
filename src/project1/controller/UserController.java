package project1.controller;

import project1.model.dao.UserDao;
import project1.model.dto.User;

public class UserController {

    public UserDao userDao = UserDao.getInstance();

    public boolean check(){
        return !userDao.users.isEmpty();
    }


    public boolean signUp(String id, String name, String pwd){
        User user = new User(id, name, pwd);
        if (!check()){
            userDao.users.add(user);
            return true;
        }
        for (User user1 : userDao.users) {
            if (!user1.getId().equals(id)) {
                userDao.users.add(user);
                return true;
            }
        }
                return false;
    }

    public User login(String id, String pwd) {
        for (User user1 : userDao.users) {
            if (user1.getId().equals(id) && user1.getPwd().equals(pwd)){
                return user1;
            }
        }
        return null;

    }
}
