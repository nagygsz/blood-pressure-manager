package eu.nagygsz.bloodpressuremanager.measuring;

import eu.nagygsz.bloodpressuremanager.patient.Patient;
import eu.nagygsz.bloodpressuremanager.postgresql.EntityWithUUID;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Measurement extends EntityWithUUID {

    private Integer systolic;
    private Integer diastolic;
    private Integer pulse;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_measurement_patient"))
    private Patient patient;

}
