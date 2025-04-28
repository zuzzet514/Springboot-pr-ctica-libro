package com.example.copsboot.report.web;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CreateReportRequestValidator implements ConstraintValidator<ValidCreateReportRequest, CreateReportRequest> {

    @Override
    public void initialize(ValidCreateReportRequest constraintAnnotation) {
    }

    @Override
    public boolean isValid(CreateReportRequest value, ConstraintValidatorContext context) {
        boolean result = true;
        if (value.trafficIncident() && value.numberOfInvolvedCars() <= 0) {
            result = false;
        }
        return result;
    }
}
