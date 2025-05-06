package org.example.pzris_lab3_client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebClientController {

    @GetMapping("/students")
    public String getStudents(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String SERVER_URL = "http://localhost:8080/api/students";
        Student[] studentsArray = restTemplate.getForObject(SERVER_URL, Student[].class);
        assert studentsArray != null;
        List<Student> students = Arrays.asList(studentsArray);
        model.addAttribute("students", students);
        return "students";
    }
}
