package com.test.nativeQueries.service;

import com.test.nativeQueries.dao.StudentRepository;
import com.test.nativeQueries.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;


    public int saveStudent(Student student) {
        studentRepository.save(student);
        return student.getStudentId();
    }

    public List<Student> findByFirstAndLastName(String firstName, String lastName) {
       List<Student> students =  studentRepository.findByFirstNameAndLastName(firstName , lastName);
       return students;
    }

    public List<Student> findByAdmissionDateBetween(Date start , Date end){
        List<Student> students = studentRepository.findByAdmissionDateBetween(start , end);
        return students;
    }

    public List<Student> findByAgeLessThan(Integer age){
        List<Student> students = studentRepository.findByAgeLessThan(age);
        return students;
    }

    public List<Student> findByAgeLessThanEqual(Integer age){
        List<Student> students = studentRepository.findByAgeLessThanEqual(age);
        return students;
    }

    public List<Student> findByAgeGreaterThan(Integer age){
        List<Student> students = studentRepository.findByAgeGreaterThan(age);
        return students;
    }

    public List<Student> findByAgeGreaterThanEqual(Integer age){
        List<Student> students = studentRepository.findByAgeGreaterThanEqual(age);
        return students;
    }

    public List<Student> findByAgeSortedByLastName(Integer age){
        List<Student> students = studentRepository.findByAgeOrderByLastNameDesc(age);
        return students;
    }

    public List<Student> findByActiveOrNot(Boolean active){
        List<Student> students = null;
        if (active == true) students = studentRepository.findByActiveTrue();
        else students = studentRepository.findByActiveFalse();

        return students;
    }
}
