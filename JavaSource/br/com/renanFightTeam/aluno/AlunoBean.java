package br.com.renanFightTeam.aluno;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import com.sun.faces.facelets.util.Path;

import br.com.renanFightTeam.endereco.EnderecoBean;
import br.com.renanFightTeam.modalidade.ModalidadePraticadaBean;
import br.com.renanFightTeam.model.Aluno;
import br.com.renanFightTeam.model.Endereco;
import br.com.renanFightTeam.plano.PlanoContratoBean;
import br.com.renanFightTeam.util.AutenticarCpf;
import br.com.renanFightTeam.util.FotoUtil;
import br.com.renanFightTeam.util.StatusUtil;


@ManagedBean
@ViewScoped
public class AlunoBean {
	
	private Aluno aluno;
	private EnderecoBean enderecoAluno;
	private PlanoContratoBean planoContrato;
	private ModalidadePraticadaBean modalidadePraticada;
	private StatusUtil status;
	private PropriedadesPaginaAluno propriedades;
	private FotoUtil fotoAluno;
	
	/**
	 * 
	 */
	@PostConstruct
	public void init(){
		setAluno(new Aluno());
		status = new StatusUtil();
		enderecoAluno = new EnderecoBean();
		setPropriedades(new PropriedadesPaginaAluno());
		planoContrato = new PlanoContratoBean();
		modalidadePraticada = new ModalidadePraticadaBean();
		setFotoAluno(new FotoUtil());
	}
	
	public String incluirAluno(){	
		return null;
	}
	
	public void validarCpf(FacesContext fc, UIComponent component, Object value)throws ValidatorException{ 
		AutenticarCpf autenticarCpf = new AutenticarCpf(value.toString());		
		if (!autenticarCpf.validarCpf()) {
			throw new ValidatorException(new FacesMessage(autenticarCpf.getMensagem()));
		}
		
	}
	
	public String conversaoBoolean(){
		if(aluno.isAtestadoMedico()){
			return "Sim";
		}
		return "Não";
	}

	/**
	 * @return the aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}

	/**
	 * @param aluno the aluno to set
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	/**
	 * @return the status
	 */
	public StatusUtil getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusUtil status) {
		this.status = status;
	}

	/**
	 * @return the enderecoAluno
	 */
	public EnderecoBean getEnderecoAluno() {
		return enderecoAluno;
	}

	/**
	 * @param enderecoAluno the enderecoAluno to set
	 */
	public void setEnderecoAluno(EnderecoBean enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

	/**
	 * @return the propriedades
	 */
	public PropriedadesPaginaAluno getPropriedades() {
		return propriedades;
	}

	/**
	 * @param propriedades the propriedades to set
	 */
	public void setPropriedades(PropriedadesPaginaAluno propriedades) {
		this.propriedades = propriedades;
	}

	/**
	 * @return the planoContrato
	 */
	public PlanoContratoBean getPlanoContrato() {
		return planoContrato;
	}

	/**
	 * @param planoContrato the planoContrato to set
	 */
	public void setPlanoContrato(PlanoContratoBean planoContrato) {
		this.planoContrato = planoContrato;
	}

	/**
	 * @return the modalidadePraticada
	 */
	public ModalidadePraticadaBean getModalidadePraticada() {
		return modalidadePraticada;
	}

	/**
	 * @param modalidadePraticada the modalidadePraticada to set
	 */
	public void setModalidadePraticada(ModalidadePraticadaBean modalidadePraticada) {
		this.modalidadePraticada = modalidadePraticada;
	}

	/**
	 * @return the fotoAluno
	 */
	public FotoUtil getFotoAluno() {
		return fotoAluno;
	}

	/**
	 * @param fotoAluno the fotoAluno to set
	 */
	public void setFotoAluno(FotoUtil fotoAluno) {
		this.fotoAluno = fotoAluno;
	}
}
