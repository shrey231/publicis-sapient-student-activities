package com.example.model.service;

import com.example.exceptions.FriendNotFoundException;
import com.example.model.beans.Friend;
import com.example.model.beans.Profile;

public interface FriendService {
	
	public Friend addFriend(int profileIdRef, Friend friend);
	
	public Friend deleteFriend(int p_id, int id) throws FriendNotFoundException;

}
