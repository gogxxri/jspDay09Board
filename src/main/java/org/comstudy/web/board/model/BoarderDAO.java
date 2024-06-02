package org.comstudy.web.board.model;

import java.util.List;

public interface BoarderDAO {
	void insert(BoardDTO dto);

	List<BoardDTO> selectAll();

	BoardDTO findBySeq(int seq);

	void update(BoardDTO dto);

	void delete(BoardDTO dto);
}