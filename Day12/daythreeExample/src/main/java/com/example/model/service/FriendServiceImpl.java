package com.example.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exceptions.FriendNotFoundException;
import com.example.model.beans.Friend;
import com.example.model.dao.FriendRepository;

@Service
public class FriendServiceImpl implements FriendService{
	
	@Autowired
	private FriendRepository friendDao;

	@Transactional
	@Override
	public Friend addFriend(int profileIdRef, Friend friend) {
		friend.setProfileIdRef(profileIdRef);
		return friendDao.save(friend);
	}
	
	@Override
	public Friend deleteFriend(int p_id, int id) throws FriendNotFoundException {
		List<Friend> friendList = friendDao.getFriendsFromProfile(p_id);
		Friend friend = null;
		for(Friend f : friendList) {
			if(f.getId() == id) {
				friend = f;
				friendDao.delete(friend);
			}
		}
		if(friend == null) {
			throw new FriendNotFoundException("Friend with an id "+id+"not found");
			
		}
		
		return friend;
	}

	

}
