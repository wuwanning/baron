package cn.mikulove.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.mikulove.dao.UserDao;
import cn.mikulove.entities.User;

@Service
public class UserService {

	@Autowired 
    private UserDao userDao;
	
	public User findUserById(int id){
		return userDao.getById(id);
	}

	@Cacheable(cacheNames="user",key="#id")
	public List<User> findAllUser(){
		return userDao.getAll();
	}
}
