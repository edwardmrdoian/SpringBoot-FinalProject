package ge.tsu.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ge.tsu.FinalProject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}