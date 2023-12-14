package com.test.IServices;

import com.test.entities.User;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    <S extends User> S save(S entity);
    User findByEmail(String email);
    User getUserById(Object id);
    void deleteById(Long id);

	String validToken(String token);

	void deleteByUserResetPass(User user);

	void createToken(User user, String token);

	long count();

	Boolean checkLogin(String Email, String pass);

	Optional<User> findByemailContaining(String name);

	void changePass(User user, String pass);


	Optional<User> findById(Long id);


	User findByUserInfoId(Long userId);
}
