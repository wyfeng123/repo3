package com.huibo.service;

import com.huibo.dao.StudentDao;
import com.huibo.po.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {
    @Resource
    private StudentDao studentDao;

    public List<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }
    public int addStudent(Student student){
        return this.studentDao.addStudent(student);
    }
    public int updateStudent(Student student){
        return this.studentDao.updateStudent(student);
    }
    public int deleteStudentByIds(){
        return 0;
    }
}
