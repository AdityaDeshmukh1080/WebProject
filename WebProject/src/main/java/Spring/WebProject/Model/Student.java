package Spring.WebProject.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter

@NoArgsConstructor




public class Student {
    private int studentRollNumber;
    private  String studentName;
    private String studentContactNumber;
    private String studentAddress;
    private int studentTotalMarks;
    private int studentObtainMarks;

    public Student(int studentRollNumber, String studentName, String studentContactNumber, String studentAddress, int studentTotalMarks, int studentObtainMarks ){
        this.studentRollNumber=studentRollNumber;
        this.studentName=studentName;
       this.studentContactNumber=studentContactNumber;
        this.studentAddress=studentAddress;
        this.studentTotalMarks=studentTotalMarks;
        this.studentObtainMarks=studentObtainMarks;
    }

}
