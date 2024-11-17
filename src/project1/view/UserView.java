package project1.view;

import project1.controller.UserController;
import project1.model.dao.UserDao;
import project1.model.dto.User;

import java.util.Scanner;

public class UserView {
    public Scanner sc = new Scanner(System.in);

    public UserController userController = new UserController();
    public void signUp (){
        while (true) {
            System.out.println("ID:");
            String id = sc.nextLine();
            System.out.println("PWD:");
            String password = sc.nextLine();
            System.out.println("Name:");
            String name = sc.nextLine();
            if (userController.signUp(id, password, name)) {
                System.out.println("SignUp Successful");
                return;
            } else {
                System.out.println("중복된 아이디입니다.");
            }
        }
    }

    public User login() {
        if (userController.check()) {
            while (true) {
                System.out.println("ID:");
                String id = sc.nextLine();
                System.out.println("PWD:");
                String pwd = sc.nextLine();
                User login = userController.login(id, pwd);
                if (login != null) {
                    System.out.println("로그인 성공 했습니다.");

                    return login;
                } else {
                    System.out.println("정보가 틀렸습니다.");
                }
            }
        }
        return null;
    }
}
