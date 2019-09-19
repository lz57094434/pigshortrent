package org.lanqiao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.lanqiao.entity.User;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Pattern;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectuser(@Param("userName") String userName);
    User selectuser2(@Param("userName") String userName, @Param("password") String password);
    User selectuser3(@Param("phone") String phone);

    int updatetest(String userName);
}