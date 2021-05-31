package data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import model.Conducteur;

@Service
public interface ConducteurDAO extends JpaRepository<Conducteur,Long> {

}
