package com.example.exceptions;

@SuppressWarnings("serial")
public class FriendNotFoundException extends Exception {
	public FriendNotFoundException() {
		super();
	}
	public FriendNotFoundException(String message) {
		super(message);
	}
}
 