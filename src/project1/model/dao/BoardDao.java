package project1.model.dao;

import project1.model.dto.Board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

    private static BoardDao boardDao = new BoardDao();
    public BoardDao (){}
    public static BoardDao getInstance(){
        return boardDao;
    }

    public List<Board> boards = new ArrayList<>();
}
