package com.jzf.mybatis.service;

import com.jzf.mybatis.Utils.DBUtils;
import com.jzf.mybatis.mapper.UserMapper;
import com.jzf.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/5/9.
 */
public class userService {

        public static void main(String[] args) {
            insertUser();
//        deleteUser();
//        selectUserById();
//        selectAllUser();
        }


        /**
         * 新增用户
         */
        private static void insertUser() {
            SqlSession session = DBUtils.getSession();
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = new User("懋", "1314520", 7000.0);
            try {
                mapper.insertUser(user);
                System.out.println(user.toString());
                session.commit();
            } catch (Exception e) {
                e.printStackTrace();
                session.rollback();
            }
        }


        /**
         * 删除用户
         */
        private static void deleteUser(){
            SqlSession session=DBUtils.getSession();
            UserMapper mapper=session.getMapper(UserMapper.class);
            try {
                mapper.deleteUser(1);
                session.commit();
            } catch (Exception e) {
                e.printStackTrace();
                session.rollback();
            }
        }


        /**
         * 根据id查询用户
         */
        private static void selectUserById(){
            SqlSession session=DBUtils.getSession();
            UserMapper mapper=session.getMapper(UserMapper.class);
            try {
                User user=    mapper.selectUserById(2);
                System.out.println(user.toString());

                session.commit();
            } catch (Exception e) {
                e.printStackTrace();
                session.rollback();
            }
        }

        /**
         * 查询所有的用户
         */
        private static void selectAllUser(){
            SqlSession session=DBUtils.getSession();
            UserMapper mapper=session.getMapper(UserMapper.class);
            try {
                List<User> user=mapper.selectAllUser();
                System.out.println(user.toString());
                session.commit();
            } catch (Exception e) {
                e.printStackTrace();
                session.rollback();
            }
        }

}
