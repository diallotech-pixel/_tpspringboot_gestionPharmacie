package isepat.dbe6.gestion_pharmacie.init;

import isepat.dbe6.gestion_pharmacie.entities.Pharmacie;
import isepat.dbe6.gestion_pharmacie.repositories.PharmacieRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
@Data
@Profile({"dev","test"})
public class InitPharmacie implements CommandLineRunner {
    private final PharmacieRepository pharmacieRepository;

    @Override
    public void run(String... args) throws Exception {
        Pharmacie pharmacie1 = new Pharmacie();
        pharmacie1.setNom("Diallo Medocs");
        pharmacie1.setLocalite("Diamniadio");
        pharmacie1.setAdresse("Diamniadio/ISEPAT");
        pharmacie1.setTelephone("77000000");
        pharmacie1.setEmail("diallo@gmail.com");

        if (!pharmacieRepository.existsByLocaliteContainingAndNomContaining(
                pharmacie1.getLocalite(), pharmacie1.getNom())) {
            pharmacieRepository.save(pharmacie1);
            log.info("Pharmacie '{}' créée avec succès.", pharmacie1.getNom());
        } else {
            log.info("La pharmacie '{}' existe déjà.", pharmacie1.getNom());
        }
    }
}
