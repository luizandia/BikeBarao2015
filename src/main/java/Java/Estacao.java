package Java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Estacao")
public class Estacao {
	@Id @GeneratedValue private String id;
	  
	private String qtd_armazenamento;
	
	private String qtd_ocupada;
	
	private String num;
	
	@OneToOne
	@JoinColumn(name = "cep")
	private Localizacao localizacao;
	
	public String getQtd_armazenamento() {
		return qtd_armazenamento;
	}

	public void setQtd_armazenamento(String qtd_armazenamento) {
		this.qtd_armazenamento = qtd_armazenamento;
	}

	public String getQtd_ocupada() {
		return qtd_ocupada;
	}

	public void setQtd_ocupada(String qtd_ocupada) {
		this.qtd_ocupada = qtd_ocupada;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	  
}