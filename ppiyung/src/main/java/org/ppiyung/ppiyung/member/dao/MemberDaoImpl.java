package org.ppiyung.ppiyung.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.ppiyung.ppiyung.member.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession session;
	
	@Override
	public Member login(Member param) {
		return session.selectOne("org.ppiyung.ppiyung.member.login", param);
	}

}