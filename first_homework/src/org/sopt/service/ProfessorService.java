package org.sopt.service;

import org.sopt.model.Professor;

public interface ProfessorService {
    Professor getByProfessorId(final int profIdx);
}
