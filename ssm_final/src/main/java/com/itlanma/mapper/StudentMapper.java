package com.itlanma.mapper;

import com.itlanma.domain.Student;

import java.util.List;

/**
 * @author 张生祥
 * @date 2019/06/27 9:30
 */
public interface StudentMapper {
    /**
     * 查询所有功能
     * @return 返回Student集合
     */
    List<Student> findAll();

    /**
     * 新增功能
     * @param student
     */
    void addStu(Student student);

    /**
     * 根据主键查询
     * @param id
     */
    Student findByStuId(int id);

    /**
     * 修改用户信息
     * @param student
     */
    void updateById(Student student);

    /**
     * 根据id进行删除
     * @param id
     */
    void delStu(int id);

    /**
     * 批量删除
     * @param ids
     */
    void delSel(int[] ids);

}
