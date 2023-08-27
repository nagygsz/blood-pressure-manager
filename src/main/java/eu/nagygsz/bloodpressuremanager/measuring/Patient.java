package eu.nagygsz.bloodpressuremanager.measuring;

import eu.nagygsz.bloodpressuremanager.postgresql.EntityWithUUID;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient extends EntityWithUUID {
    private String userName;
    private String ssn;
}
