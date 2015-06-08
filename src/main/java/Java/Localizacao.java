package Java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Localizacao")
public class Localizacao {
  
	@Id @GeneratedValue private long id;

	private String CEP;
	
	private String RUA;
	
	private String BAIRRO;
	
	private String CIDADE;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String CEP) {
		this.CEP = CEP;
	}

	public String getRUA() {
		return RUA;
	}

	public void setRUA(String RUA) {
		this.RUA = RUA;
	}

	public String getBAIRRO() {
		return BAIRRO;
	}

	public void setBAIRRO(String BAIRRO) {
		this.BAIRRO = BAIRRO;
	}

	public String getCIDADE() {
		return CIDADE;
	}

	public void setCIDADE(String CIDADE) {
		this.CIDADE = CIDADE;
	}

}