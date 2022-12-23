package net.javaguides.springboot.controller;

import jakarta.validation.Valid;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Rest API定義クラス
 */
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    /**
     * コンストラクタインジェクション
     * "@Autowired"は、コンストラクタが1件のみかつSpring4.3以上であれば省略可能だがつけておく
     * フィールドにfinalを使用することができて不変性を担保できるため、推奨される
     */
    private final EmployeeService service;
    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    /**
     * Employeeデータリストを取得する
     * @return Employeeデータリスト
     */
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployee();
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
        // 更新処理はserviceに任せる
        return service.updateEmployee(id, updateEmployee);
    }

    /**
     * 指定したIDをもつEmployeeデータを削除する.
     * @param id ID
     */
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable long id) {
        // 削除処理はserviceに任せる
        service.deleteEmployee(id);
        // 正常時は204 NO_CONTENTを返却
        return ResponseEntity.noContent().build();
    }
}
