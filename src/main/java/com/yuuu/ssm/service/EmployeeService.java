package com.yuuu.ssm.service;

import com.github.pagehelper.PageInfo;
import com.yuuu.ssm.pojo.Employee;
import com.yuuu.ssm.pojo.User;

import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.service
 * @Author:Yuuu。
 * @CreateTime:2022-12-12 10:47
 * @Description:
 * @Version:1.0
 */
public interface EmployeeService {
//    PageInfo<Employee> getEmployeePage(Integer pageNum);
    PageInfo<Employee> getEmployeePage(Integer pageNum);
    PageInfo<Employee> getEmployeePage(Integer pageNum,String keyword);
    List<Employee> getAllEmployee();
    void updateEmployeeById(Employee employee);
    Employee getEmployeeById(Integer empId);
    void addEmployee(Employee employee);
    void deleteEmployeeById(Integer empId);

}
