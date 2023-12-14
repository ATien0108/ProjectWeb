package com.test.IServices;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entities.User;
import com.test.entities.User_message;

@Service
public interface IUser_messageService {
	<S extends User_message> S save(S entity);
	List<User_message> getAllBy2User(User source, User target);
	List<User> getAllTargetBySource(User source);
}
