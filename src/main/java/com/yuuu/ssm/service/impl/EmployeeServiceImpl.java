package com.yuuu.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuuu.ssm.mapper.EmployeeMapper;
import com.yuuu.ssm.pojo.Employee;
import com.yuuu.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.transaction.AfterTransaction;

import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.service
 * @Author:Yuuu。
 * @CreateTime:2022-12-12 10:47
 * @Description:
 * @Version:1.0
 */
@Service
//@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    //    @Override
//    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
//        //开启分页功能
//        PageHelper.startPage(pageNum,5);
//        //查询所有员工信息
//        List<Employee> employees = employeeMapper.getAllEmployee();
//        //获取分页相关数据，param：查询到的集合、导航分页（1 -2- 3）
//        PageInfo<Employee> pageInfo = new PageInfo<>(employees, 3);
//        return pageInfo;
//    }
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {

        //开启分页功能
        PageHelper.startPage(pageNum, 5);

        //查询所有员工信息
        List<Employee> employees = employeeMapper.getAllEmployee();

        //获取分页相关数据，param：查询到的集合、导航分页（1 -2- 3）
        PageInfo<Employee> pageInfo = new PageInfo<>(employees, 3);
        return pageInfo;
    }



    public PageInfo<Employee> getEmployeePage(Integer pageNum,String keyword) {

        //开启分页功能
        PageHelper.startPage(pageNum, 5);

        //查询所有员工信息
        List<Employee> employees = employeeMapper.getEmployeeByKeyword(keyword);

        //获取分页相关数据，param：查询到的集合、导航分页（1 -2- 3）
        PageInfo<Employee> pageInfo = new PageInfo<>(employees, 3);
        return pageInfo;
    }


    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public void updateEmployeeById(Employee employee) {
        employeeMapper.updateEmployeeById(employee);
    }

    @Override
    public Employee getEmployeeById(Integer empId) {
        Employee employee = employeeMapper.getEmployeeById(empId);
        return employee;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    @Override
    public void deleteEmployeeById(Integer empId) {
        employeeMapper.deleteEmployee(empId);
    }




}
