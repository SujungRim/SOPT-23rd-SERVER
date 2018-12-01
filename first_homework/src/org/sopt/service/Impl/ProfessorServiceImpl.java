package org.sopt.service.Impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {
    @Override
    public Professor getByProfessorId(int profIdx) {
        final ProfessorBuilder professorBuilder = new ProfessorBuilder();
        return professorBuilder.build();
    }
}
