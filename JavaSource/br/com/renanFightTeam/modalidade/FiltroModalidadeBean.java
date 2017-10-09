package br.com.renanFightTeam.modalidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.renanFightTeam.bean.MenuBean;
import br.com.renanFightTeam.dao.ModalidadeDao;
import br.com.renanFightTeam.model.Modalidade;
import br.com.renanFightTeam.plano.MensagemPlanoEnum;
import br.com.renanFightTeam.util.PaginasEnum;

@ManagedBean
@ViewScoped
public class FiltroModalidadeBean {

	private List<Modalidade> modalidades = new ArrayList<Modalidade>();
	
	private int tipoPesquisa;
	private int codigo;
	private String nome;
	private String status;
	
	
	/**
	 * 
	 */
	@PostConstruct
	public void init(){
		
	}
	
	public void listarModalidadePorCodigo(){
		this.modalidades = new ModalidadeDao().buscaPorCodigo(codigo);
		tratarResultadoPesquisa();
	}
	
	public void listarModalidadePorNome(){
		this.modalidades = new ModalidadeDao().buscarPorNome(nome);
		tratarResultadoPesquisa();
	}
	
	public void listarModalidadePorStatus(){
		this.modalidades = new ModalidadeDao().buscarPorStatus(status);
		tratarResultadoPesquisa();
	}
	
	public String tratarConsulta(Modalidade modalidade){
		gravarModalidade(modalidade);
		gravarOpcao(PaginasEnum.MODALIDADECONSULTAR.getPagina());
		
		return new MenuBean().paginaModalidadeConsultar();
	}
	
	public String tratarAlteracao(Modalidade modalidade){
		gravarModalidade(modalidade);
		gravarOpcao(PaginasEnum.MODALIDADEALTERAR.getPagina());
		
		return new MenuBean().paginaModalidadeAlterar();
	}
	
	public String tratarExclusao(Modalidade modalidade){
		gravarModalidade(modalidade);
		gravarOpcao(PaginasEnum.MODALIDADEEXCLUIR.getPagina());
		
		return new MenuBean().paginaModalidadeExcluir();
	}
	
	
	/**
	 * 
	 * @param opcao
	 */
	private void gravarOpcao(String opcao){
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();
			
		sessionMap.put("opcaoFiltroModalidade", opcao);
	}
	
	/**
	 * 
	 * @param plano
	 */
	private void gravarModalidade(Modalidade modalidade){		
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();
			
		sessionMap.put("modalidade", modalidade);
	}	
	
	/**
	 * 
	 */
	private void tratarResultadoPesquisa(){
		if(modalidades.isEmpty()){
			criarMensagem(MensagemPlanoEnum.RESULTADO_NAO_ENCONTRADO.getSeveridade(), MensagemPlanoEnum.RESULTADO_NAO_ENCONTRADO.getResumo(), MensagemPlanoEnum.RESULTADO_NAO_ENCONTRADO.getDescricao());			
		}
	}
	
	/**
	 * 
	 * @param severidade
	 * @param resumo
	 * @param detalhe
	 */
	private void criarMensagem(Severity severidade, String resumo, String descricao){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severidade, resumo, descricao));
	}
	
	/**
	 * @return the modalidades
	 */
	public List<Modalidade> getModalidades() {
		return modalidades;
	}
	/**
	 * @param modalidades the modalidades to set
	 */
	public void setModalidades(List<Modalidade> modalidades) {
		this.modalidades = modalidades;
	}
	/**
	 * @return the tipoPesquisa
	 */
	public int getTipoPesquisa() {
		return tipoPesquisa;
	}
	/**
	 * @param tipoPesquisa the tipoPesquisa to set
	 */
	public void setTipoPesquisa(int tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}	
	
	
	
}
