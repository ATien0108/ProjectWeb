package com.test.IServices.Impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.IServices.IUser_messageService;
import com.test.entities.User;
import com.test.entities.User_message;
import com.test.responsitory.UserRepository;
import com.test.responsitory.User_messageRepository;

@Service
public class User_messageServiceImpl implements IUser_messageService {
	@Autowired
    User_messageRepository user_message_repository;
	
	@Autowired
    UserRepository user_repository;
	
	@Override
    public <S extends User_message> S save(S entity) {
        return user_message_repository.save(entity);
    }

	@Override
	public List<User_message> getAllBy2User(User source, User target) {
		List<User_message> list1 = user_message_repository.findBySourceIdAndTargetId(source.getId(),target.getId());
		List<User_message> list2 = user_message_repository.findBySourceIdAndTargetId(target.getId(),source.getId());
		List<User_message> mergedList = Stream.concat(list1.stream(), list2.stream())
				.sorted(Comparator.comparing(User_message::getCreatedAt))
				.collect(Collectors.toList());
		return mergedList;
	}

	@Override
	public List<User> getAllTargetBySource(User source) {
		
		List<User> listTarget = new ArrayList<User>();
		
		List<Integer> listid = user_message_repository.findDistinctTargetIdsBySourceId(source.getId());
		for (Integer i : listid) {
			listTarget.add(user_repository.getOne(i));
		}
		
		// Thêm danh sách đang follow tương tự trên
		
		return listTarget;
	}
}
