package Java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Aluguel")
public class Aluguel {
	@Id @GeneratedValue private String id;
	
	@OneToOne
	@JoinColumn(name = "id_bicicleta")
	private Bicicleta bicicleta;
	
	@OneToOne
	@JoinColumn(name = "cpf_usuario")
	private Usuario usuario;
	

}