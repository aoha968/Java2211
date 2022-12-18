package net.javaguides.springboot.controller;

import jakarta.validation.Valid;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Rest API定義クラス
 */
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    /** Employeeアクセス用リポジトリ */
    @Autowired
    private EmployeeRepository employeeRepository;
    /**
     * Employeeデータリストを取得する.
     * @return Employeeデータリスト
     */
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * 指定したIDをもつEmployeeデータを取得する.
     * @param id ID
     * @return 指定したIDをもつユーザーデータ
     */
    @GetMapping("{id}")
    public Employee getEmployeeById(@PathVariable long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()) {
            // 指定したIDをもつユーザーデータがあればそのユーザーデータを返す
            return employee.get();
        }else{
            // 指定したIDをもつユーザーデータがなければnullを返す
            return employee.orElseThrow(() -> new ResourceNotFoundException("Employee not exist width id:" + id));
        }
    }

    /**
     * 指定したEmployeeデータを登録する.
     * @param employee Employeeデータ
     * @return 登録したEmployeeデータ
     */
    @PostMapping
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        Optional<Employee> employeeId = employeeRepository.findById(employee.getId());
        if(employeeRepository.countByEmailId(employee.getEmailId()) == 0){
            // メールアドレスが未登録であれば登録する
            return employeeRepository.save(employee);
        }else{
            // 登録済みであればエラーを返す
            return employeeId.orElseThrow(() -> new ResourceNotFoundException("Employee is registered email:" + employee.getEmailId()));
        }
    }

    /**
     * 指定したユーザーデータを更新する.
     * @param id ID
     * @param employee Employeeデータ
     * @return 更新したEmployeeデータ
     */
    @PatchMapping("{id}")
    public Employee updateEmployee(@PathVariable long id, @Valid @RequestBody Employee employee) {
        Optional<Employee> employeeId = employeeRepository.findById(id);
        if(employeeId.isPresent()) {
            // 指定したIDをもつEmployeeデータがあれば更新する
            employee.setId(id);
            return employeeRepository.save(employee);
        }else {
            // 指定したIDをもつEmployeeデータがなければエラーを返す
            return employeeId.orElseThrow(() -> new ResourceNotFoundException("Employee not exist width id:" + id));
        }
    }

    /**
     * 指定したIDをもつユーザーデータを削除する.
     * @param id ID
     */
    @DeleteMapping("{id}")
    public void deleteEmployee(@PathVariable long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        // 指定したIDをもつEmployeeデータがあればそのユーザーデータを削除する
        if(employee.isPresent()) {
            employeeRepository.deleteById(id);
        }else{
            employee.orElseThrow(() -> new ResourceNotFoundException("Employee not exist width id:" + id));
        }
    }

}
