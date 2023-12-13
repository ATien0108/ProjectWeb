package com.test.IServices.Impl;

import com.test.IServices.IUserServce;
import com.test.entities.User;
import com.test.responsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserServce {
    @Autowired
    UserRepository userrerository;

    @Override
    public <S extends User> S save(S entity) {
        entity.setPasswordHash(BCrypt.hashpw(entity.getPasswordHash(),BCrypt.gensalt(12)));
        return userrerository.save(entity);
    }

    @Override
    public User findByEmail(String email) {
        return userrerository.findByEmail(email);
    }

}
