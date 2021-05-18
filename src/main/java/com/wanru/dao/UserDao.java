package com.wanru.dao;

import com.wanru.entity.User;

import java.util.List;

/**
 * @Author:WWR
 * @Date: 2021/5/8- 05- 08- 9:56
 * @Description:com.wanru.dao
 * @Version:1.0
 */
public interface UserDao {
	public List<User> selectAll();
}
