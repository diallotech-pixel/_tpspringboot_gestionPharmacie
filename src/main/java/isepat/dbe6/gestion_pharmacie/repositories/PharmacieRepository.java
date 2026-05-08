package isepat.dbe6.gestion_pharmacie.repositories;

import isepat.dbe6.gestion_pharmacie.entities.Pharmacie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PharmacieRepository extends JpaRepository<Pharmacie,Long> {
    boolean existsByLocaliteContainingAndNomContaining(String locality,String name);
}
