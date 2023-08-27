package eu.nagygsz.bloodpressuremanager.measuring;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MeasurementDAO extends CrudRepository<Measurement, UUID> {
}