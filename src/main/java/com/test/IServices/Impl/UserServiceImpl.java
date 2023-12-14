package com.test.IServices.Impl;

import com.test.IServices.IUserService;
import com.test.entities.User;
import com.test.entities.UserEntity;
import com.test.responsitory.UserRepository;

import java.util.Optional;

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

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String validToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByUserResetPass(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createToken(User user, String token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Boolean checkLogin(String Email, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findByemailContaining(String name) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void changePass(User user, String pass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public User findByUserInfoId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

}
