package eu.nagygsz.bloodpressuremanager.patient;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface PatientDAO extends CrudRepository<Patient, UUID> {

    Optional<Patient> findOneByUserName(String userName);

}