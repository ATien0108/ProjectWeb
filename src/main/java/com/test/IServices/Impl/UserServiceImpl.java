package com.test.IServices.Impl;

import com.test.IServices.IUserService;
import com.test.entities.User;
import com.test.responsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
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

	@Override
	public User getUserById(Object id) {
		
		if(id.getClass() == String.class)
			id = Integer.parseInt((String)id);
		if(id.getClass() == Integer.class)
			return userrerository.getOne((Integer) id);
		return null;
	}

}
