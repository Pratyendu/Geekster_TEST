package com.test.thFeb.Service;

import com.test.thFeb.DAO.StudentRepository;
import com.test.thFeb.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public int addStudent(Student student){
        studentRepository.save(student);
        return student.getId();
    }

    public Student getById(int id){
        return studentRepository.findById(id).get();
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public void updateStudent(int id , Student updated){
        Student student = studentRepository.findById(id).get();

        student.setAddress(updated.getAddress());
        student.setAge(updated.getAge());
        student.setName(updated.getName());
        student.setBranch(updated.getBranch());
        student.setDepartment(updated.getDepartment());
        student.setPhoneNumber(updated.getPhoneNumber());
    }

    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }
}
