package com.test.responsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.entities.User_message;

public interface User_messageRepository extends JpaRepository<User_message, Integer> {

	List<User_message> findBySourceIdAndTargetId(int sourceId, int targetId);
	
	@Query("SELECT DISTINCT u.targetId FROM User_message u WHERE u.sourceId = ?1")
    List<Integer> findDistinctTargetIdsBySourceId(int sourceId);
}
