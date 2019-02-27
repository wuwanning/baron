package cn.mikulove.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import cn.mikulove.entities.User;

@Mapper
@CacheConfig(cacheNames = "user")
public interface UserDao {
	/*@Results({ 
        @Result(property = "id", column = "id"), 
        @Result(property = "name", column = "name"),
        @Result(property = "age", column = "age"),
        @Result(property = "birthday", column = "birthday")
	})*/
	@Cacheable(key ="#p0") 
	@Select("SELECT * FROM t_user WHERE id = #{id}") 
    User getById(int id);
	
	@Select("SELECT * FROM t_user") 
	List<User> getAll();
	
}
