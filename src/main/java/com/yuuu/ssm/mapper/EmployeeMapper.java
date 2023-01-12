package com.yuuu.ssm.mapper;

import com.yuuu.ssm.pojo.Employee;
import com.yuuu.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.mapper
 * @Author:Yuuu。
 * @CreateTime:2022-12-12 10:59
 * @Description:
 * @Version:1.0
 */
public interface EmployeeMapper {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 修改信息
     * @param employee
     */
    void updateEmployeeById(Employee employee);

    /**
     * 根据id查找员工
     * @param empId
     * @return
     */
    Employee getEmployeeById(@Param("empId") Integer empId);

    /**
     * 添加员工信息
     * @param employee
     */
    void addEmployee(Employee employee);

    void deleteEmployee(@Param("empId") Integer empId);

    List<Employee> getEmployeeByKeyword(@Param("keyword") String keyword);
}
