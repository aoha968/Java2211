package net.javaguides.springboot.service;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;
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
     * 全てのEmployeeデータを取得する
     * @return 全てのEmployeeデータ
     */
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
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

    /**
     * Employeeデータを更新する
     * @param id ID
     * @param updateEmployee 更新するEmployeeデータ
     * @return Employeeデータ
     */
    public Employee updateEmployee(long id, Employee updateEmployee) {
        // idに紐づくEmployeeがなければコール側でエラー返却してくれる
        Employee employee = getEmployeeById(id);
        if(employeeRepository.countByEmailId(updateEmployee.getEmailId()) == 0) {
            // 指定したIDをもつ かつ 同じメールアドレスが登録されていなければ、Employeeデータがあれば更新する
            updateEmployee.setId(id);
            // 更新したEmployeeを返却
            return employeeRepository.save(updateEmployee);
        }else{
            // 登録済みであればエラーを返す
            throw new DuplicateKeyException("Employee is registered email:" + employee.getEmailId());
        }
    }

    /**
     * Employeeデータを削除する
     * @param id ID
     * @return Employeeデータ
     */
    public void deleteEmployee(long id) {
        // 指定したIDがなければ例外を投げる
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist width id:" + id));
        // ここまでくる = 指定したIDをもつEmployeeデータがあることになるため、そのユーザーデータの削除を実施する
        employeeRepository.deleteById(id);
    }
}
