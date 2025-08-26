package com.pm.patientservice.GlobalExceptionHadler;

public class PatientNotFoundException extends RuntimeException {
    public PatientNotFoundException(String message) {
        super(message);
    }
}
