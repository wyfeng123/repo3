package com.huibo.test;

import com.huibo.po.Student;
import com.huibo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:conf/applicationContext.xml"})
public class StudentTest {
    @Resource
    private StudentService studentService;
    @Test
    public void testGetAllStudents(){
        this.studentService.getAllStudents().forEach(System.out::println);
    }
    @Test
    public void testAddStudent(){
        int row=this.studentService.addStudent(new Student(null,"aaa","男",34));
        System.out.println(row);
    }
    @Test
    public void testUpdateStudent(){
        int row=this.studentService.updateStudent(new Student(8,"llll","pppp",555));
        System.out.println(row);
    }
}
