package com.test.thFeb.DAO;

import com.test.thFeb.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop , Integer> {
}
