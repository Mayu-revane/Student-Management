package com.sprk.student_management.mapper;

import com.sprk.student_management.dto.StudentDto;
import com.sprk.student_management.entity.Student;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-05T15:52:32+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student mapStudentDtoToStudent(StudentDto studentDto) {
        if ( studentDto == null ) {
            return null;
        }

        Student student = new Student();

        student.setRollNo( studentDto.getRollNo() );
        student.setFirstName( studentDto.getFirstName() );
        student.setLastName( studentDto.getLastName() );
        student.setPhone( studentDto.getPhone() );
        student.setEmail( studentDto.getEmail() );
        student.setGender( studentDto.getGender() );

        return student;
    }

    @Override
    public StudentDto mapStudentToStudentDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setRollNo( student.getRollNo() );
        studentDto.setFirstName( student.getFirstName() );
        studentDto.setLastName( student.getLastName() );
        studentDto.setPhone( student.getPhone() );
        studentDto.setEmail( student.getEmail() );
        studentDto.setGender( student.getGender() );

        return studentDto;
    }
}
