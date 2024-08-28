package com.oks.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oks.user.beans.User;
import com.oks.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	List<User> uList=List.of(
				            new User(101l,"Omkar Singh","omkar@gmail.com"),
				            new User(102l,"Krish","Krish@gmail.com"),
				            new User(103l,"Ram","ram@gmail.com")
                            );
	@Override
	public User getUser(Long id) {		
		return uList.stream().filter(u->u.getUserId()==id).findAny().orElse(null);
	}
}
