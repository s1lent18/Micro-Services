package com.hms.patientservice.service;

import com.hms.patientservice.dto.PatientRequestDTO;
import com.hms.patientservice.dto.PatientResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface PatientService {

    List<PatientResponseDTO> getPatients();
    
    void deletePatient(UUID id);

    PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO);

    PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO);
}
