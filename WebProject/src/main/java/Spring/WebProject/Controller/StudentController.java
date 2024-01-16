package Spring.WebProject.Controller;

import Spring.WebProject.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    List<Student>studentList=new ArrayList<>();
    {
        studentList.add(new Student(1,"Aditya","45678","Pune",600,500));
        studentList.add(new Student(2,"Raj","789456","SATARA",1000,500));
        studentList.add(new Student(3,"Sahil","46799","MUMBAI",700,300));
        studentList.add(new Student(4,"Rakesh","55555","Saswad",800,400));
        studentList.add(new Student(5,"MAYA","907887","Rajewadi",900,700));
    }
    @GetMapping("/display")
    public String displayStudentData(Model model){
        model.addAttribute("studentData",studentList);
        return "displayStudentData";
    }

    @GetMapping("/addStudent")
    public String createObject(Model model){
        model.addAttribute("studentObject",new Student());
        return "studentForm";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(Student student){
        studentList.add(student);
        return "redirect:/display";
    }

    @GetMapping("/updateStudent/{id}")
    public String fetchObject(@PathVariable int id, Model model){
       for(Student s:studentList){
           if(s.getStudentRollNumber()==id){
               model.addAttribute("matchObject",s);
               break;
           }
       }
       return "updateStudent";
    }

    @GetMapping("/updateStudentData")
    public String updateStudent(Student student){
    for(Student s:studentList){
        if(s.getStudentRollNumber()==student.getStudentRollNumber()){
            studentList.set(studentList.indexOf(s),student);
            break;
        }
    }
        return "redirect:/display";
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id){
    for (Student s:studentList){
        if(s.getStudentRollNumber()==id){
            studentList.remove(s);
            break;
        }
    }
        return "redirect:/display";
    }

}
