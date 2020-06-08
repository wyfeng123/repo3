package com.huibo.controller;

import com.huibo.po.Student;
import com.huibo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping("/getAllStudents")
    @ResponseBody
    public List<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }

    @RequestMapping("/addStudent")
    @ResponseBody
    public Map<String,Object> addStudent(Student student){
        int row=studentService.addStudent(student);
        return new HashMap<String, Object>(){
            {
                put("result",row);
            }
        };
    }

    @RequestMapping("/updateStudent")
    @ResponseBody
    public Map<String ,Object> updateStudent(Student student){
        int row=studentService.updateStudent(student);
        return new HashMap<String, Object>(){{
            put("result",row);
        }};
    }
}
