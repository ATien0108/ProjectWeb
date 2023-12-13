package com.test.IServices;

import com.test.entities.User;
import com.test.responsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface IUserServce {
    <S extends User> S save(S entity);
    User findByEmail(String email);
}
