package com.itlanma.service;

import com.itlanma.domain.Student;
import com.itlanma.domain.User;

import java.util.List;

/**
 * @author 张生祥
 * @date 2019/06/27 9:30
 */
public interface StudentService {
    List<Student> findAll();

    void addStu(Student student);

    Student findByStuId(int id);

    void updateById(Student student);

    void delStu(int id);

    void delSel(int[] ids);


}
