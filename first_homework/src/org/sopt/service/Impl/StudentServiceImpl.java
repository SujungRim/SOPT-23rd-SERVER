package org.sopt.service.Impl;

import org.sopt.model.Student;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public Student getByStudentIdx(int StudentIdx) {
        final StudentBuilder studentBuilder = new StudentBuilder();
        return studentBuilder.build();
    }
}
