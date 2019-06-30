package com.itlanma.service.impl;

import com.itlanma.domain.Student;
import com.itlanma.domain.User;
import com.itlanma.mapper.StudentMapper;
import com.itlanma.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张生祥
 * @date 2019/06/27 9:41
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findAll() {
        List<Student> students = studentMapper.findAll();
        return students;
    }

    @Override
    public void addStu(Student student) {
        if ("男".equals(student.getSexStr())){
            student.setSex(0);
        }else {
            student.setSex(1);
        }
        studentMapper.addStu(student);
    }

    @Override
    public Student findByStuId(int id) {
        Student student = studentMapper.findByStuId(id);
        return student;
    }

    @Override
    public void updateById(Student student) {
        if ("男".equals(student.getSexStr())){
            student.setSex(0);
        }else {
            student.setSex(1);
        }
        studentMapper.updateById(student);
    }

    @Override
    public void delStu(int id) {
        studentMapper.delStu(id);
    }

    @Override
    public void delSel(int[] ids) {
        studentMapper.delSel(ids);
    }


}
