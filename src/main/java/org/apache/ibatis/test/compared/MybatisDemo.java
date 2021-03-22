package org.apache.ibatis.test.compared;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.test.constants.SexEnum;
import org.apache.ibatis.test.entity.CsdnEntityDO;
import org.apache.ibatis.test.mapper.CsdnEntityMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ligang25@58.com
 * @date 2020/11/4 11:27
 */
public class MybatisDemo {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            CsdnEntityMapper mapper = sqlSession.getMapper(CsdnEntityMapper.class);
            CsdnEntityDO entityDO = new CsdnEntityDO();
            entityDO.setAuthor("作者");
            entityDO.setContent("内容");
            entityDO.setTitle("主题");
            entityDO.setSex(SexEnum.MAN);

            System.out.println(mapper.insert(entityDO));

            sqlSession.commit();
        }
    }
}
