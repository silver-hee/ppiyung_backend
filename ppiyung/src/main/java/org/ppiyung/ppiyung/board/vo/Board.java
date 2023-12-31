package org.ppiyung.ppiyung.board.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {

	private int articleId;
	private String articleTitle; // 게시글 제목
	private String articleContent; // 게시글 내용
	private String memberId;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date articleCreatedAt;
	
}
