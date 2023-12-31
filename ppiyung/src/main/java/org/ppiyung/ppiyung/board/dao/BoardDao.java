package org.ppiyung.ppiyung.board.dao;


import java.util.List;

import org.ppiyung.ppiyung.board.vo.Board;
import org.ppiyung.ppiyung.board.vo.BoardList;
import org.ppiyung.ppiyung.board.vo.Like;
import org.ppiyung.ppiyung.board.vo.Reply;
import org.ppiyung.ppiyung.board.vo.ReplyDetail;
import org.ppiyung.ppiyung.common.entity.PagingEntity;


public interface BoardDao  {
	


	// 커뮤니티 게시글 (페이징 수행)
	public List<BoardList> pagingInsertBoard(PagingEntity criteria);
	
	// 커뮤니티 게시글 상세조회
	public List<BoardList> detailBoard(int articleId);
	
	// 커뮤니티 게시글 추가
	void insertBoardpost(Board boardContent) throws Exception;
	
	// 커뮤니티 게시글 삭제
	void deleteBoardPost(int article_id) throws Exception;
	
	// 커뮤니티 게시글 수정
	public void updateBoardPost(Board boardContent) throws Exception;

	// 커뮤니티 게시글 댓글 생성
	public void insertReply(Reply reply) throws Exception;

	// 커뮤니티 게시글 댓글 삭제
	public void deleteReply(int reply_id) throws Exception;

	// 커뮤니티 게시글 댓글 수정
	public void updateReply(Reply reply) throws Exception;
	
	// 커뮤니티 게시글 좋아요 작성
	public void insertLike(Like like) throws Exception;
	
	// 커뮤니티 커뮤니티 좋아요 삭제
	void deleteLike(Like like) throws Exception;

	public int totalCount();

	
	// 좋아요 여부 확인
	public List<Like> getLikedCheck(Like like);
	
	// 댓글 목록 조회
	public List<ReplyDetail> getListReplt(int articleId);
	

	//커뮤니티 게시글 회원ID별 게시글 조회
	public List<BoardList> selectListCommmunityList(String memberId);
	}

