package org.ppiyung.ppiyung.notify.dao;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ppiyung.ppiyung.notify.vo.Notify;
=======
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ppiyung.ppiyung.notify.vo.Notification;
>>>>>>> becceea8e79af99341788791d8db1a6eb1624ff4
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NotifyDaoImpl implements NotifyDao {
	
	private Logger log = LogManager.getLogger("base");
	
	@Autowired
	SqlSession session;
	
<<<<<<< HEAD
	
	// 지원 알림 생성
	@Override
	public void insertApplyNotify(Notify notify) throws Exception {
		int count = session.insert("org.ppiyung.ppiyung.notify.insertApplyNotify", notify);
		if (count != 1) {
			throw new Exception();
		}
	}

	// 입사제안 알림 생성
	@Override
	public void insertSuggestNotify(Notify notify) throws Exception {
		int count = session.insert("org.ppiyung.ppiyung.notify.insertSuggestNotify", notify);
		if (count != 1) {
			throw new Exception();
		}
	}


	// 알림 삭제
	@Override
	public void deleteNotify(int notification_id) throws Exception {
		int count = session.delete("org.ppiyung.ppiyung.notify.deleteNotify", notification_id);
		if (count != 1) {
			throw new Exception();
		}
	}


	
=======
	// 회원별 알림 조회
	@Override
	public List<HashMap<String, Object>>  getNotificationList(String param) {
		
		List<HashMap<String, Object>> list = session.selectList("org.ppiyung.ppiyung.notify.selectNotifyList",param);
		return list;
	}		

	@Override
	public List<HashMap<String, Object>> getDetailNotify(Notification param) {
		List<HashMap<String,Object>> notify = session.selectList("org.ppiyung.ppiyung.notify.detailNotify", param);
		return notify;
	}

>>>>>>> becceea8e79af99341788791d8db1a6eb1624ff4
}
