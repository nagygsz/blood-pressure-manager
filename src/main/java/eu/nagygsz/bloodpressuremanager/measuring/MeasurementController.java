package eu.nagygsz.bloodpressuremanager.measuring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/measures")
public class MeasurementController {

    @Autowired
    MeasurementDAO measurementDAO;

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
        Measurement result = measurementDAO.save(measurement);
        return result.getId();
    }

}

