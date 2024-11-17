package project1.view;

import project1.controller.BoardController;
import project1.model.dao.BoardDao;
import project1.model.dto.Board;
import project1.model.dto.User;

import java.util.Scanner;

public class BoardView {
    public Scanner sc = new Scanner(System.in);
    private static BoardView boardView = new BoardView();
    public BoardController boardController = new BoardController();
    public static BoardView getInstance(){
        return boardView;
    }

    public void boardWrite(User user){
        System.out.println("게시글을 입력하세요.");
        String content = sc.nextLine();
        Board board = new Board(content, user.getName());
        boardController.boardWrite(board);
    }

    public void boardRead(User user){
        for (Board board : boardController.boardDao.boards){
            if (user.getName().equals(board.getWriter())){
                System.out.println(board);
            }
        }


    }
}
