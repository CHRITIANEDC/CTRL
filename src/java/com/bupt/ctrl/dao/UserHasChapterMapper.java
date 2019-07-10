package com.bupt.ctrl.dao;

import com.bupt.ctrl.model.UserHasChapter;
import com.bupt.ctrl.model.UserHasChapterExample;
import com.bupt.ctrl.model.UserHasChapterKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHasChapterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    int countByExample(UserHasChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    int deleteByExample(UserHasChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    int deleteByPrimaryKey(UserHasChapterKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    int insert(UserHasChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    int insertSelective(UserHasChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    List<UserHasChapter> selectByExample(UserHasChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    UserHasChapter selectByPrimaryKey(UserHasChapterKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserHasChapter record, @Param("example") UserHasChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    int updateByExample(@Param("record") UserHasChapter record, @Param("example") UserHasChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    int updateByPrimaryKeySelective(UserHasChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdrb..user_has_chapter
     *
     * @mbggenerated Wed Jul 10 09:55:09 CST 2019
     */
    int updateByPrimaryKey(UserHasChapter record);
}