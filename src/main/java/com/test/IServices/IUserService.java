package com.test.IServices;

import com.test.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    <S extends User> S save(S entity);
    User findByEmail(String email);
    User getUserById(Object id);
}
