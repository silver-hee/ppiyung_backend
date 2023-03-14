package org.ppiyung.ppiyung.board.dao;


import java.util.List;

import org.ppiyung.ppiyung.board.vo.Board;
import org.ppiyung.ppiyung.board.vo.BoardList;
import org.ppiyung.ppiyung.board.vo.Like;
import org.ppiyung.ppiyung.common.entity.PagingEntity;
import org.ppiyung.ppiyung.board.vo.Reply;
import org.ppiyung.ppiyung.board.vo.Board;
import org.ppiyung.ppiyung.board.vo.BoardList;
import org.ppiyung.ppiyung.board.vo.Reply;

public interface BoardDao  {
	
	// 댓글 생성
	public void insertReply(Reply reply) throws Exception;

	// 댓글 삭제
	public void deleteReply(int reply_id) throws Exception;

	// 댓글 수정
	public void updateReply(Reply reply) throws Exception;
	
	// 커뮤니티 게시글 (페이징 수행)
	public List<BoardList> pagingInsertBoard(PagingEntity criteria);
	// 커뮤니티 게시글 추가
	void insertBoardpost(Board boardContent) throws Exception;
	// 커뮤니티 게시글 삭제
	void deleteBoardPost(int article_id) throws Exception;
	// 게시글 수정
	public void updateBoardPost(Board boardContent) throws Exception;
	
	// 커뮤니티 좋아요 삭제
	void deleteLike(Like like) throws Exception;
	
	// 게시글 상세조회
	public List<Board> detailBoard(int articleId);
	
}
