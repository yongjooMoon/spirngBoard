package com.bbs.service;

import java.util.List;

import com.bbs.domain.BoardDTO;

public interface BoardService {

	public boolean registerBoard(BoardDTO params);

	public BoardDTO getBoardDetail(Long id);

	public boolean deleteBoard(Long id);

	public List<BoardDTO> getBoardList();

}