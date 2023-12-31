package org.ppiyung.ppiyung.notify.service;

import java.util.HashMap;
import java.util.List;

import org.ppiyung.ppiyung.notify.dao.NotifyDao;
import org.ppiyung.ppiyung.notify.vo.Notification;
import org.ppiyung.ppiyung.notify.vo.NotificationExtended;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotifyServiceImpl implements NotifyService {
	
	@Autowired
	private NotifyDao dao;
	
	
	// 지원 알림 생성
	@Override
	public boolean insertApplyNotify(Notification notify) {
		try {
			dao.insertApplyNotify(notify);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}
	
	// 입사제안 알림 생성
	@Override
	public boolean insertSuggestNotify(Notification notify) {
		try {
			dao.insertSuggestNotify(notify);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	// 회원별 알람 리스트 조회
	@Override
	public List<NotificationExtended>  getNotificationList(String memberId) {
		 List<NotificationExtended> list = dao.getNotificationList(memberId);
		return list;
	}
	
	// 알림 세부내역 출력
	@Override
	public List<HashMap<String, Object>> detailNotification(Notification notification) {
		List<HashMap<String, Object>> notify = dao.getDetailNotify(notification);
		return notify;
	}
	
	// 알림 삭제
	@Override
	public boolean deleteNotify(int notification_id) {
		try {
			dao.deleteNotify(notification_id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



}
