package com.huibo.dao;

import com.huibo.po.Student;
import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;
import java.util.List;

public interface StudentDao {

    public List<Student> getAllStudents();
    public int addStudent(Student student);
    public int deleteStudentByIds(Integer[] ids);
    public int updateStudent(Student student);
}
