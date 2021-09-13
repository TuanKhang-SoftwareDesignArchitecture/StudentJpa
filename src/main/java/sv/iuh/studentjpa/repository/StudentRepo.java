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
    @Query(value="delete from studentjpa where id= :id", nativeQuery = true)
    void deleteStudent(@Param("id") Long id);
    @Modifying
    @Query(value="update studentjpa set email = :email where id = :id", nativeQuery=true)
    void updateStudent(String email, Long id);
    @Query(value="SELECT * FROM studentjpa u",nativeQuery=true)
    List<Student> findAlStudent();

}
