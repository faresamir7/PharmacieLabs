package com.pharmacie.pharmacie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacie.pharmacie.entities.patient;
import com.pharmacie.pharmacie.repositories.PatientRepository;

@Service
public class patientService {

	@Autowired
	private final PatientRepository pRepo;

	public patientService(PatientRepository patientRepository) {
		this.pRepo = patientRepository;
	}

	public patient getPatient(int id) {
		Long longid = Long.valueOf(id);
		return pRepo.getById(longid);
	}

	public List<patient> getPatientAll() {
		return pRepo.findAll();
	}

	public void addNewPatient(patient p) {
		for (patient e : pRepo.findAll()) {
			if (e.equals(p)) {
				return;
			}
		}
		pRepo.save(p);
	}

	public void deletePatient(int id) {
		Long longid = Long.valueOf(id);
		pRepo.deleteById(longid);
	}

}
