package eu.nagygsz.bloodpressuremanager.measuring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientDAO patientDAO;

    @GetMapping
    public Iterable<Patient> getPatients() {
        return patientDAO.findAll();
    }

    @GetMapping("/{patientId}")
    public Optional<Patient> getPatient(@PathVariable("patientId") UUID patientId) {
        return patientDAO.findById(patientId);
    }

    @PostMapping
    public UUID addPatient(@RequestBody Patient newPatient) {
        Patient result = patientDAO.save(newPatient);
        return result.getId();
    }

}

