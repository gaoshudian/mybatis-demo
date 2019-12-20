package com.gbicc.mybatis.test7;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.gbicc.mybatis.domain.CUser;
import com.gbicc.mybatis.util.SqlSessionFactoryUtils;



public class Test {
	public static void main(String[] args) {
		/**
		 * ����Mybatis��һ������
		 */
		/*SqlSession session=SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		String statement="com.gbicc.mybatis.test7.userMapper.getUser";
		CUser cuser=session.selectOne(statement, 1);
		System.out.println(cuser);
		//һ������Ĭ�Ͼͻᱻʹ��(�����ٲ�һ��)
		CUser cuser2=session.selectOne(statement,1);
		System.out.println(cuser2);
		//��ѯ���������仯�����´����ݿ������
		CUser cuser3=session.selectOne(statement,2);
		System.out.println(cuser3);
		//ִ����session.clearCache()������������(���´����ݿ������)
		session.clearCache();
		CUser cuser4=session.selectOne(statement,2);
		System.out.println(cuser4);
		//ִ�й���ɾ�Ĳ�����(���´����ݿ������)
		session.update("com.gbicc.mybatis.test7.userMapper.updateUser",new CUser(2, "user", 23));
		CUser cuser5 = session.selectOne(statement, 2);
		System.out.println(cuser5);*/


		/**
		 * ����Mybatis�Ķ�������
		 */
		SqlSessionFactory factory=SqlSessionFactoryUtils.getSqlSessionFactory();
		SqlSession session=factory.openSession();
		String statement = "com.gbicc.mybatis.test7.userMapper.getUser";
		CUser user = session.selectOne(statement, 1);
		session.commit();
		System.out.println(user);
		
		SqlSession session2=factory.openSession();
		user = session2.selectOne(statement, 1);
		session2.commit();
		System.out.println(user);

	}
	
}
