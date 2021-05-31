package data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import model.Vehicule;

@Service
public interface VehiculeDAO extends JpaRepository<Vehicule,Long> {

}
