package isepat.dbe6.gestion_pharmacie.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // dit a spring que cette classe doit etre une table
@NoArgsConstructor //Constructeur sans parametre
@AllArgsConstructor //Constructeur avec parametre
@Data
public class Pharmacie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 50, nullable = false)
	private String nom;
	@Column(length = 50, nullable = false)
	private String localite;
	@Column(length = 50, nullable = false)
	private String adresse;
	@Column(length = 50, nullable = false)
	private String telephone;
	@Column(length = 50)
	private String email;
	
	
	
}
