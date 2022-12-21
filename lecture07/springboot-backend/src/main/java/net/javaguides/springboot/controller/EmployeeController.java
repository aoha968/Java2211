package net.javaguides.springboot.controller;

import jakarta.validation.Valid;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest API定義クラス
 */
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    /** Employeeアクセス用リポジトリ */
    @Autowired
    private EmployeeRepository employeeRepository;
    /** EmployeeService */
    @Autowired
    private EmployeeService service;

    /**
     * Employeeデータリストを取得する
     * @return Employeeデータリスト
     */
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     * 指定したIDをもつEmployeeデータを取得する
     * @param id ID
     * @return 指定したIDをもつEmployeeデータ
     */
    @GetMapping("{id}")
    public Employee getEmployeeById(@PathVariable long id){
        return service.getEmployeeById(id);
    }

    /**
     * 指定したEmployeeデータを登録する
     * @param employee Employeeデータ
     * @return 登録したEmployeeデータ
     */
    @PostMapping
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        // 登録処理はserviceに任せる
        return service.registerEmployee(employee);
    }

    /**
     * 指定したEmployeeデータを更新する
     * @param id ID
     * @param updateEmployee 更新するEmployeeデータ
     * @return 更新したEmployeeデータ
     */
    @PatchMapping("{id}")
    public Employee updateEmployee(@PathVariable long id, @Valid @RequestBody Employee updateEmployee) {
        Employee employee = service.getEmployeeById(id);
        if(employee != null) {
            // 指定したIDをもつEmployeeデータがあれば更新する
            updateEmployee.setId(id);
            return employeeRepository.save(updateEmployee);
        }else {
            // 指定したIDをもつEmployeeデータがなければnullを返す
            return null;
        }
    }

    /**
     * 指定したIDをもつEmployeeデータを削除する.
     * @param id ID
     */
    @DeleteMapping("{id}")
    public void deleteEmployee(@PathVariable long id) {
        Employee employee = service.getEmployeeById(id);
        // 指定したIDをもつEmployeeデータがあればそのユーザーデータを削除する
        if(employee != null) {
            employeeRepository.deleteById(id);
        }
    }
}
