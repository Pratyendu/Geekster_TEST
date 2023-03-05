package com.test.nativeQueries.controller;

import com.test.nativeQueries.model.Student;
import com.test.nativeQueries.service.StudentService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/create-student")
    public ResponseEntity<String> createStudent(@RequestBody String requestData){

        Student student = setStudent(requestData);
        int studentId = studentService.saveStudent(student);
        return new ResponseEntity<String>("Student saved with id: " + studentId , HttpStatus.CREATED);


    }

    private Student setStudent(String requestData) {
        Student student = new Student();
        JSONObject jsonObject = new JSONObject(requestData);

        student.setFirstName(jsonObject.getString("firstName"));
        student.setLastName(jsonObject.getString("lastName"));
        student.setAge(jsonObject.getInt("age"));
        student.setActive(jsonObject.getBoolean("active"));

        Date createdDate = new Date(System.currentTimeMillis());
        student.setAdmissionDate(createdDate);

        return student;
    }

    @GetMapping("find-by-first-&-last-name")
    public List<Student> findByFirstNameAndLastName(@RequestParam String firstName , String lastName){
        List<Student> students = studentService.findByFirstAndLastName(firstName , lastName);
        return students;
    }

    @GetMapping("find-by-admissionDate-between")
    public List<Student> findByAdmissionDateBetween(@RequestParam Date start , Date end){
        List<Student> students = studentService.findByAdmissionDateBetween(start , end);
        return students;
    }

    @GetMapping("find-by-age-less-than")
    public List<Student> findByAgeLessThan(@RequestParam Integer age){
        List<Student> students = studentService.findByAgeLessThan(age);
        return students;
    }

    @GetMapping("find-by-age-less-than-equals")
    public List<Student> findByAgeLessThanEquals(@RequestParam Integer age){
        List<Student> students = studentService.findByAgeLessThanEqual(age);
        return students;
    }

    @GetMapping("find-by-age-greater-than")
    public List<Student> findByAgeGreaterThan(@RequestParam Integer age){
        List<Student> students = studentService.findByAgeGreaterThan(age);
        return students;
    }

    @GetMapping("find-by-age-greater-than-equals")
    public List<Student> findByAgeGreaterThanEquals(@RequestParam Integer age){
        List<Student> students = studentService.findByAgeGreaterThanEqual(age);
        return students;
    }

    @GetMapping("find-by-age-sorted-by-lastName-descending")
    public List<Student> findByAgeSortedByLastName(@RequestParam Integer age){
        List<Student> students = studentService.findByAgeSortedByLastName(age);
        return students;
    }

    @GetMapping("find-by-active-or-not")
    public List<Student> findByActiveOrNot(@RequestParam Boolean active){
        List<Student> students = studentService.findByActiveOrNot(active);
        return students;
    }

}
