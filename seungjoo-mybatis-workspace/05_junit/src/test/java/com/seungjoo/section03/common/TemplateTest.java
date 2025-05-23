package com.seungjoo.section03.common;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.seungjoo.section03.common.Template.getSqlSession;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TemplateTest {
    @DisplayName("SqlSession 객체를 정상적으로 가져올 수 있다.")
    @Test
    void testGetSqlSession(){
        SqlSession sqlSession = getSqlSession();
        assertThat(sqlSession).isNotNull();
    }

}