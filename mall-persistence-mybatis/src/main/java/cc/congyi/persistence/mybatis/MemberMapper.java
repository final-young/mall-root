package cc.congyi.persistence.mybatis;

import cc.congyi.model.Member;

public interface MemberMapper {
    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}