package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

     /**
     * コンストラクタインジェクション
     * "@Autowired"は、コンストラクタが1件のみかつSpring4.3以上であれば省略可能だがつけておく
     * フィールドにfinalを使用することができて不変性を担保できるため、推奨される
     */
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Optional<Employee> getEmployeeId(long id){
        return employeeRepository.findById(id);
    }
}
