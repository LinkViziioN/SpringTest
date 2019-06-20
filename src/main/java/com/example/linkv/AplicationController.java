package com.example.linkv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Controller
public class AplicationController {

    @Value("${filePath}")
    private String filePath;

    @Autowired
    private HandelDataBaseRepository repository;

    @GetMapping("/")
    public String mn (@RequestParam(name="name", required=false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/readFile")
    public String readFile()  {
        BufferedReader reader = null;
        String data = null;

        try {
            if(filePath != null) {
                reader = new BufferedReader(new FileReader(filePath));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            data = reader.readLine();

            while (data != null) {
                String[] dataArray = data.split(";");
                if(dataArray[5].equals("HANDEL")) {
                   if(dataArray.length == 6)
                       repository.save(new DataBaseItem(dataArray[0], dataArray[1], dataArray[2],
                               dataArray[3], dataArray[4], dataArray[5]));
                   else if(dataArray.length == 7)
                       repository.save(new DataBaseItem(dataArray[0], dataArray[1], dataArray[2],
                               dataArray[3], dataArray[4], dataArray[5], dataArray[6]));
                   else
                       repository.save(new DataBaseItem(dataArray[0], dataArray[1], dataArray[2],
                               dataArray[3], dataArray[4], dataArray[5], dataArray[6], dataArray[7]));
                }
                data = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "index";
    }
}
