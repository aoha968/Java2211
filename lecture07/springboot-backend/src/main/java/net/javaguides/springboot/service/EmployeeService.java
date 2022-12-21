package net.javaguides.springboot.service;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
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

    /**
     * IDに紐づくEmployeeデータを取得する
     * @param id ID
     * @return IDに紐づくEmployeeデータ
     */
    public Employee getEmployeeById(long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElseThrow(() -> new ResourceNotFoundException("Employee not exist width id:" + id));
    }

    /**
     * Employeeデータを登録する
     * @param employee 登録するEmployeeデータ
     * @return Employeeデータ
     */
    public Employee registerEmployee(Employee employee) {
        if(employeeRepository.countByEmailId(employee.getEmailId()) == 0){
            // メールアドレスが未登録であれば登録する
            return employeeRepository.save(employee);
        }else{
            // 登録済みであればエラーを返す
            throw new DuplicateKeyException("Employee is registered email:" + employee.getEmailId());
        }
    }
}
