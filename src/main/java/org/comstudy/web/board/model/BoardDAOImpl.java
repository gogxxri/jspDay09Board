package org.comstudy.web.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.comstudy.web.board.dbcp.JdbcUtil;

public class BoardDAOImpl implements BoarderDAO {
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    private PreparedStatement pstmt;

    @Override
    public void insert(BoardDTO dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            // 1. BoardDTO 객체에서 데이터 추출
            String author = dto.getAuthor();
            String email = dto.getEmail();
            String title = dto.getTitle();
            String content = dto.getContent();
            String password = dto.getPassword();
            
            // 2. 데이터베이스에 삽입하는 SQL 쿼리 작성
            String sql = "INSERT INTO BOARD (author, email, title, content, password) VALUES (?, ?, ?, ?, ?)";
            
            // 3. JDBC를 사용하여 데이터베이스와 연결하고 쿼리 실행
            conn = JdbcUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, author);
            pstmt.setString(2, email);
            pstmt.setString(3, title);
            pstmt.setString(4, content);
            pstmt.setString(5, password);
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 리소스 해제
            JdbcUtil.close(pstmt);
            JdbcUtil.close(conn);
        }
    }


    @Override
    public List<BoardDTO> selectAll() {
        ArrayList<BoardDTO> list = new ArrayList<>();
        try {
            conn = JdbcUtil.getConnection();
            if (conn == null) {
                throw new SQLException("Connection is null.");
            }
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM BOARD");

            while (rs.next()) {
                int anum = rs.getInt(1);
                String author = rs.getString(2);
                String email = rs.getString(3);
                String title = rs.getString(4);
                String writeday = rs.getString(5);

                list.add(new BoardDTO(anum, author, email, title, writeday));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, stmt, rs);
        }
        return list;
    }

    @Override
    public BoardDTO findBySeq(int seq) {
        // Implement find by seq logic
        return null;
    }

    @Override
    public void update(BoardDTO dto) {
        // Implement update logic
    }

    @Override
    public void delete(BoardDTO dto) {
        // Implement delete logic
    }
}