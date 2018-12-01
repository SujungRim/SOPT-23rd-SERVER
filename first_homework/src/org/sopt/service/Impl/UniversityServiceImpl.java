package org.sopt.service.Impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.service.UniversityService;

public class UniversityServiceImpl implements UniversityService {
    @Override
    public University getByUniversityName(String uniName) {
        final UniversityBuilder universityBuilder = new UniversityBuilder();
        return universityBuilder.build();
    }
}
