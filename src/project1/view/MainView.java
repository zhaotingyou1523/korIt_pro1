package project1.view;

import project1.model.dto.Board;
import project1.model.dto.MessageContext;
import project1.model.dto.User;

import java.util.Scanner;

public class MainView {
    public UserView userView = new UserView();
    public BoardView boardView = new BoardView();

    public Scanner sc = new Scanner(System.in);

    public void mainPage() {
        while (true) {
            System.out.println("1.회원가입 2.로그인 *.종료");
            System.out.println(MessageContext.INSERT);
            int choose = 0;
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println(MessageContext.ERROR);
                sc.nextLine();
                continue;
            }

            switch (choose) {
                case 1:
                    userView.signUp();
                    break;

                case 2:
                    User login = userView.login();
                    if (login != null) {
                        boardView(login);
                    }
                    break;

                default:
                    System.out.println("시스템 종료");
                    return;
            }
        }
    }

    public void boardView(User user){
        System.out.println("user = " + user);
        while (true) {
            System.out.println("1.쓰기 2.읽기 *.나가기");
            int choose = 0;

            try {
                choose = sc.nextInt();
            } catch (Exception e){
                System.out.println(MessageContext.ERROR);
                sc.nextLine();
                continue;
            }

            switch (choose) {
                case 1:
                    boardView.boardWrite(user);
                    break;

                    case 2:
                        boardView.boardRead(user);
                        break;

                default:
                    System.out.println("로그아웃");
                    return;
            }
        }
    }
}