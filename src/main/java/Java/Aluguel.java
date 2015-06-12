package Java;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	private Date data_inicio;
	
	private Date data_fim;
	
	@OneToOne
	@JoinColumn(name = "id_estacao_inicio")
	private Estacao estacaoInicio;
	
	@OneToOne
	@JoinColumn(name = "id_estacao_fim")
	private Estacao estacaoFim;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public Estacao getEstacaoInicio() {
		return estacaoInicio;
	}

	public void setEstacaoInicio(Estacao estacaoInicio) {
		this.estacaoInicio = estacaoInicio;
	}

	public Estacao getEstacaoFim() {
		return estacaoFim;
	}

	public void setEstacaoFim(Estacao estacaoFim) {
		this.estacaoFim = estacaoFim;
	}
}