CREATE TABLE patient (
  id UUID PRIMARY KEY,
  username VARCHAR(128) UNIQUE NOT NULL,
  ssn VARCHAR(32)
 );

CREATE TABLE measurement (
   id UUID PRIMARY KEY,
   patient_id UUID,
   systolic INT NOT NULL,
   diastolic  INT NOT NULL,
   pulse  INT NOT NULL
);

ALTER TABLE measurement
  ADD CONSTRAINT fk_measurement_patient FOREIGN KEY (patient_id) REFERENCES patient;
