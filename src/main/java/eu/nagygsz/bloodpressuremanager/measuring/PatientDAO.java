package eu.nagygsz.bloodpressuremanager.measuring;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PatientDAO extends CrudRepository<Patient, UUID> {
}