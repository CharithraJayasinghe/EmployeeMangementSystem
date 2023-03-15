package com.emploeeMS.EmployeeManagementSystem.repo;

import com.emploeeMS.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository <Employee, Integer> {
}
