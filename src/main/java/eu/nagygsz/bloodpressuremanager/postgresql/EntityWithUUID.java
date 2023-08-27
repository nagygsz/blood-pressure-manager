package eu.nagygsz.bloodpressuremanager.postgresql;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
public class EntityWithUUID {
    @Id
    @GeneratedValue
    private UUID id;

    public EntityWithUUID() {
        this.id = UUID.randomUUID();
    }
}

