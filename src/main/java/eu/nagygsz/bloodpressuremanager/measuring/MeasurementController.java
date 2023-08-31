package eu.nagygsz.bloodpressuremanager.measuring;

import eu.nagygsz.bloodpressuremanager.patient.Patient;
import eu.nagygsz.bloodpressuremanager.patient.PatientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/measures")
public class MeasurementController {

    @Autowired
    MeasurementDAO measurementDAO;

    @Autowired
    PatientDAO patientDAO;

    @GetMapping
    public Iterable<Measurement> getMeasurements() {
        return measurementDAO.findAll();
    }

    @GetMapping("/{measurementId}")
    public Optional<Measurement> getMeasurement(@PathVariable("measurementId") UUID measurementId) {
        return measurementDAO.findById(measurementId);
    }

    @PostMapping
    public UUID addMeasurement(@RequestBody Measurement measurement) {
        Patient patient = measurement.getPatient();
        if(!patientDAO.existsById(patient.getId())){
            Optional<Patient> resultP = patientDAO.findOneByUserName(patient.getUserName());
            resultP.ifPresent(measurement::setPatient);
        }
        Measurement result = measurementDAO.save(measurement);
        return result.getId();
    }
}

