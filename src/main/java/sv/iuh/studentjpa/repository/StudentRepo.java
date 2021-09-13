package sv.iuh.studentjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.iuh.studentjpa.models.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
