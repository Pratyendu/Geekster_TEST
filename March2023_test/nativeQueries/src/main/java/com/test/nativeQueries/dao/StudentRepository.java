package com.test.nativeQueries.dao;

import com.test.nativeQueries.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student , Integer> {
    @Query(value = "select * from tbl_student where first_name = :firstName and last_name = :lastName" , nativeQuery = true)
    public List<Student> findByFirstNameAndLastName(String firstName , String lastName);
//    public List<Student> findByFirstNameOrLastName(String firstName , String lastName);
//    public List<Student> findByFirstNameIs(String firstName);
    @Query(value = "select * from tbl_student where admissionDate between :start and :end" , nativeQuery = true)
    public List<Student> findByAdmissionDateBetween(Date start , Date end);
    @Query(value = "select * from tbl_student where age < :age" , nativeQuery = true)
    public List<Student> findByAgeLessThan(Integer age);
    @Query(value = "select * from tbl_student where age <= :age" , nativeQuery = true)
    public List<Student> findByAgeLessThanEqual(Integer age);
    @Query(value = "select * from tbl_student where age > :age" , nativeQuery = true)
    public List<Student> findByAgeGreaterThan(Integer age);
    @Query(value = "select * from tbl_student where age >= :age" , nativeQuery = true)
    public List<Student> findByAgeGreaterThanEqual(Integer age);
//    public List<Student> findByAdmissionDateAfter(Date admissionDate);
//    public List<Student> findByAdmissionDateBefore(Date admissionDate);
//    public List<Student> findByAgeIsNull();
//    public List<Student> findByAgeNotNull();
    @Query(value = "select * from tbl_student where age = :age order by last_name desc" , nativeQuery = true)
    public List<Student> findByAgeOrderByLastNameDesc(Integer age);
//    public List<Student> findByLastNameNot(String lastName);
    @Query(value = "select * from tbl_student where active = true" , nativeQuery = true)
    public List<Student> findByActiveTrue();
    @Query(value = "select * from tbl_student where active = false" , nativeQuery = true)
    public List<Student> findByActiveFalse();


}
