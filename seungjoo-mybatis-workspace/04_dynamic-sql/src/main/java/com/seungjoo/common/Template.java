package com.seungjoo.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Template {

    private static SqlSessionFactory sqlSessionFactory;  //열쇠 공장
    public static SqlSession getSqlSession(){ //열쇠 꺼내는 방법
        if(sqlSessionFactory == null){
            try {
                InputStream inputStream = Resources.getResourceAsStream("config/mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sqlSessionFactory.openSession(false);
    }

}
