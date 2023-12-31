package org.ppiyung.ppiyung.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.ppiyung.ppiyung.member.vo.Image;
import org.ppiyung.ppiyung.member.vo.Member;
import org.ppiyung.ppiyung.member.vo.MemberExtended;
import org.ppiyung.ppiyung.member.vo.MemberOption;
import org.ppiyung.ppiyung.member.vo.OpenResumeOption;
import org.ppiyung.ppiyung.member.vo.Resume;
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

	
	@Override
	public Member selectMemberId(Member param) {
		Member member = session.selectOne("org.ppiyung.ppiyung.member.select", param);
		return member;
	}
	
	@Override
	public MemberExtended selectMemberIdJoinned(Member param) {
		MemberExtended member = session.selectOne("org.ppiyung.ppiyung.member.selectJoinned", param);
		return member;
	}


	@Override
	public void insertMember(Member param) throws Exception {
		int count = session.insert("org.ppiyung.ppiyung.member.signin", param);
		if (count != 1) {
			throw new Exception();
		}
	}


	@Override
	public void updateInfo(Member param) throws Exception {
		int count = session.update("org.ppiyung.ppiyung.member.updateMember",param);
		if (count != 1) {
			throw new Exception();
		}
		
	}


	@Override
	public List<Member> getAllMember(MemberOption option) {
		List<Member> list = session.selectList("org.ppiyung.ppiyung.member.selectAll", option);

		return list;

	}


	@Override
	public int getAllMemberCount(MemberOption option) {
		return session.selectOne("org.ppiyung.ppiyung.member.selectAllTotal", option);
	}


	@Override
	public void leaveMember(String param) throws Exception {
		int count = session.update("org.ppiyung.ppiyung.member.deleteMember", param);
		if (count != 1) {
			throw new Exception();
		}
	}


	@Override
	public List<MemberExtended> getResumeOpenMember(OpenResumeOption param) {
		List<MemberExtended> list = session.selectList("org.ppiyung.ppiyung.member.seletResumeOpenMember" , param);
		return list;
	}


	@Override
	public void insertMemberImage(Image image) throws Exception {
		int count = session.insert("org.ppiyung.ppiyung.member.insertImg", image);
		if (count != 1) {
			throw new Exception();
		}
	}


	@Override
	public Image selectMemberImage(Image image) {
		return session.selectOne("org.ppiyung.ppiyung.member.selectImg" , image);
	}


	@Override
	public void updateMemberImage(Image image) throws Exception {
		int count = session.update("org.ppiyung.ppiyung.member.updateImg", image);
		if (count != 1) {
			throw new Exception();
		}
	}


	@Override
	public Resume selectMemberResume(Resume resume) {
		return session.selectOne("org.ppiyung.ppiyung.member.selectResume" , resume);
	}


	@Override
	public void updateMemberResume(Resume resume) throws Exception {
		int count = session.update("org.ppiyung.ppiyung.member.updateResume", resume);
		if (count != 1) {
			throw new Exception();
		}
	}


	@Override
	public void insertMemberResume(Resume resume) throws Exception {
		int count = session.insert("org.ppiyung.ppiyung.member.insertResume", resume);
		if (count != 1) {
			throw new Exception();
		}
	}


	@Override
	public void updateResumeOpen(Resume resume) throws Exception  {
		int count = session.update("org.ppiyung.ppiyung.member.updateResumeOpen", resume);
		if (count != 1) {
			throw new Exception();
		}
		
	}
}
