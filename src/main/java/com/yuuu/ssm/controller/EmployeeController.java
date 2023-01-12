package com.yuuu.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yuuu.ssm.pojo.Employee;
import com.yuuu.ssm.pojo.User;
import com.yuuu.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @BelongsProject:ssm
 * @BelongsPackage:com.yuuu.ssm.controller
 * @Author:Yuuu。
 * @CreateTime:2022-12-12 10:35
 * @Description:
 * @Version:1.0
 */
@Controller
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;


    @RequestMapping(value = "/employee/page/{pageNum}/{keyword}", method = RequestMethod.GET)
    public String getEmployeePageByKeyword(@PathVariable("pageNum") Integer pageNum, Model model, String keyword) {
//        User user = (User) request.getSession().getAttribute("user");
//        System.out.println("********************"+user);
        //获取员工的分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum,keyword);
        //将分页信息共享到请求域
        model.addAttribute("page",page);
//        model.addAttribute("user", user);
        //页面跳转
        return "employee_list_key";
    }

    /**
     * 根据id删除员工
     *
     * @param empId
     * @return
     */
    @RequestMapping(value = "/employee/{empId}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("empId") Integer empId) {
        employeeService.deleteEmployeeById(empId);
        return "redirect:/employee/page/1";
    }

    /**
     * @description:添加员工信息
     * @author: Yuuu。
     * @date: 2022-12-19 21:43
     * @param: [employee]
     * @return: java.lang.String
     **/
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee) {

        employeeService.addEmployee(employee);
        return "redirect:/employee/page/1";
    }

    /**
     * @description:修改员工信息
     * @author: Yuuu。
     * @date: 2022-12-19 20:50
     * @param: [employee]
     * @return: java.lang.String
     **/
    @PutMapping(value = "/employee")
    public String updateEmployeeById(Employee employee) {
        employeeService.updateEmployeeById(employee);
        return "redirect:/employee/page/1";
    }

    @RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET)
    public String updateEmployee(@PathVariable("empId") Integer empId, Model model) {
        Employee employee = employeeService.getEmployeeById(empId);
        model.addAttribute("emp", employee);
        return "employee_update";
    }

    /**
     * @description:分页展示员工列表并将用户信息保存
     * @author: Yuuu。
     * @date: 2022-12-19 20:07
     * @param: [pageNum, model, request]
     * @return: java.lang.String
     **/
    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
//        System.out.println("********************"+user);
        //获取员工的分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        //将分页信息共享到请求域
        model.addAttribute("page", page);
        model.addAttribute("user", user);
        //页面跳转
        return "employee_list";
    }


    /**
     * @description:员工列表
     * @author: Yuuu。
     * @date: 2022-12-12 23:09
     * @param: [model]
     * @return: java.lang.String
     **/
//    @GetMapping("/employee")
    public String getAllEmployee(Model model) {
        List<Employee> employees = employeeService.getAllEmployee();
        //将员工信息在请求域中共享
        model.addAttribute("emps", employees);
        //页面跳转
        return "employee_list";
    }
}
