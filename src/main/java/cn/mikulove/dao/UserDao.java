package cn.mikulove.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import cn.mikulove.entities.User;

@Mapper
public interface UserDao {
	@Results({ 
        @Result(property = "id", column = "id"), 
        @Result(property = "name", column = "name"),
        @Result(property = "age", column = "age"),
        @Result(property = "birthday", column = "birthday")
	})
	@Select("SELECT * FROM t_user WHERE id = #{id}") 
    User getById(int id);
	
	@Select("SELECT * FROM t_user") 
	List<User> getAll();
	
}
