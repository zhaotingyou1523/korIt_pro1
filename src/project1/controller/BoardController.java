package project1.controller;

import project1.model.dao.BoardDao;
import project1.model.dto.Board;

public class BoardController {
    public BoardDao boardDao = BoardDao.getInstance();
    public void boardWrite(Board board) {
        boardDao.boards.add(board);
    }
}
