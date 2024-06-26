package com.ltp.workbook;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.ltp.workbook.Employee;

@Controller
public class WorkbookController {

    
    @GetMapping(value="/")
    public String getStaff(Model model) {
        List<Employee> employees = Arrays.asList(
                new Employee("Jim Halpert", 32, "Salesman"),
                new Employee("Andy Bernard", 38, "Salesman"),
                new Employee("Pam Beesly", 32, "Receptionist"),
                new Employee("Michael Scott", 49, "Regional Manager"),
                new Employee("Ryan Howard", 28, "Temp"),
                new Employee("Angela Martin", 35, "Accountant"),
                new Employee("Dwight Schrute", 37, "Assistant to the Regional Manager")
        );

        model.addAttribute("employees", employees);

        return "staff";
    }
    
}
