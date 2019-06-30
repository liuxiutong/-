package com.itlanma.controller;

import com.itlanma.domain.Student;
import com.itlanma.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 张生祥
 * @date 2019/06/27 9:30
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    public String findStudentAll(Model model){
        List<Student> studentList = studentService.findAll();
        model.addAttribute("studentList",studentList);
        return "list";
    }

    @RequestMapping("/add")
    public String addStu(Student student){
        studentService.addStu(student);
        return "redirect:/student/list";
    }

    @RequestMapping("/listOne")
    public ModelAndView findById(int id){
        ModelAndView modelAndView = new ModelAndView();
        Student student = studentService.findByStuId(id);
        modelAndView.addObject("stu",student);
        modelAndView.setViewName("update");
        return modelAndView;
    }

    @RequestMapping("/updateById")
    public String updateById(Student student){
        studentService.updateById(student);
        return "redirect:/student/list";
    }

    @RequestMapping("/delOne")
    public String delStu(int id){
        studentService.delStu(id);
        return "redirect:/student/list";
    }

    @RequestMapping("/delSel")
    public String delSel(int[] ids){
        studentService.delSel(ids);
        return "redirect:/student/list";
    }
}
