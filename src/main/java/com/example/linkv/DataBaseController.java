package com.example.linkv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataBaseController {
    @Autowired
    HandelDataBaseRepository repository;

    @GetMapping("/deleteFromDB")
    public String deleteFromDB(@RequestParam(name="id") String id)  {
        repository.delete(id);
        return "index";
    }

    @GetMapping("/editDB")
    public String editDB()  {

        return "index";
    }
}
