package sv.iuh.studentjpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sv.iuh.studentjpa.models.Student;
import sv.iuh.studentjpa.repository.StudentRepo;

@SpringBootTest
class StudentjpaApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private StudentRepo studentRepo;
    @Test
    public void addStudent(){
        Student student= new Student();
        student.setName("Le Tuan Khang");
        student.setEmail("Khangletuan098@gmail.com");
        student.setPhone("0976553787");
        System.out.print("aa");
        studentRepo.save(student);
    }
    @Test
    public void deleteStudent(Long id){
        Student student=studentRepo.findById(id).get();
        studentRepo.delete(student);
    }
    @Test
    public void upDateStudent(Long id){
        Student student=studentRepo.findById(id).get();
        studentRepo.save(student);
    }
    @Test
    public void getAll(){
        studentRepo.findAll();
    }
}
