package sv.iuh.studentjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sv.iuh.studentjpa.models.Student;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long> {
    @Modifying
    @Query("delete from Student u where u.id= :id")
    void deleteStudent(@Param("id") Long id);
    @Modifying
    @Query("update Student u set u.email = :email where u.id = :id")
    void updateStudent(String email, Long id);
    @Query("SELECT u FROM Student u")
    List<Student> findAlStudent();

}
