package com.ltp.workbook;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class WorkbookController {

    @GetMapping(value="/")
    public String getSales(Model model) {
        List<Record> records = Arrays.asList(
                new Record("Chair", 20.99, 5.99),
                new Record("Table", 40.99, 8.99),
                new Record("Couch", 100.99, 105.99),
                new Record("Fridge", 200.99, 59.99),
                new Record("Bed", 150.99, 205.99)
        );

        model.addAttribute(records);

        return "records";
    }


}
