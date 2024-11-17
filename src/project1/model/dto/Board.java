package project1.model.dto;

public class Board {
    private String content;
    private String writer;

    public Board() {
    }

    public Board(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "writer: " + writer + ", content: " + content;
    }
}
