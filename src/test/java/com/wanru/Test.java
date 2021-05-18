package com.wanru;

import com.wanru.dao.UserDao;
import com.wanru.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

/**
 * @Author:WWR
 * @Date: 2021/5/8- 05- 08- 10:12
 * @Description:com.wanru
 * @Version:1.0
 */
public class Test {
	public static void main(String[] args) throws IOException {
		SqlSession sqlSession=getSessionFactory().openSession();
		UserDao userMapper=sqlSession.getMapper(UserDao.class);
		List<User> list=userMapper.selectAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
	private static SqlSessionFactory getSessionFactory() throws IOException {
		SqlSessionFactory sessionFactory=null;
		String resource="configuration.xml";
		sessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
		return  sessionFactory;
	}
}
