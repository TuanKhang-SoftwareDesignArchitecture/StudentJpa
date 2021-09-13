package sv.iuh.studentjpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sv.iuh.studentjpa.models.Student;
import sv.iuh.studentjpa.repository.StudentRepo;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class StudentjpaApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private StudentRepo studentRepo;
    @Test
    public void getAll(){
        List<Student> list=studentRepo.findAlStudent();
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i).toString());
        }
    }
    @Test
    @Transactional
    public void deleteStudent(){
       studentRepo.deleteStudent((long) 1);
    }
    @Test
    @Transactional
    public void updateStudent(){
        studentRepo.updateStudent("Tome",(long) 1);
    }
}
