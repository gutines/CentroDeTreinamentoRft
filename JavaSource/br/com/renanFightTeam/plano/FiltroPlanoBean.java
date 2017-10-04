package br.com.renanFightTeam.plano;

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
import br.com.renanFightTeam.dao.PlanoDao;
import br.com.renanFightTeam.model.Plano;
import br.com.renanFightTeam.util.PaginasEnum;

@ManagedBean
@ViewScoped
public class FiltroPlanoBean {
	
	private List<Plano> planos = new ArrayList<Plano>();
	
	private int tipoPesquisa;
	private int codigo;
	private String nome;
	private String status;
	private boolean apresentarPlanoForm = false;
	
	
	/**
	 * 
	 */
	@PostConstruct	
	public void init(){
		
	}
	
	public void listarPlanos(){
		PlanoDao dao = new PlanoDao();		
		setPlanos(dao.listarPlano());
	}
	
	/**
	 * 
	 */
	public void listarPlanoPorCodigo(){
		this.planos = new PlanoDao().buscaPorCodigo(codigo);
		
		tratarResultadoPesquisa();
	}
	
	/**
	 * 
	 */
	public void listarPlanoPorNome(){
		this.planos = new PlanoDao().buscarPorNome(nome);
		
		tratarResultadoPesquisa();
	}
	
	/**
	 * Listar por Status
	 */
	public void listarPlanoPorStatus(){
		this.planos = new PlanoDao().buscarPorStatus(status);
		
		tratarResultadoPesquisa();
	}
	
	
	/**
	 * 
	 * @param plano
	 * @return String
	 */
	public String tratarConsulta(Plano plano){
		gravarPlano(plano);
		gravarOpcao(PaginasEnum.PLANOCONSULTAR.getPagina());
		
		return new MenuBean().paginaPlanoConsultar();
	}
	
	/**
	 * 
	 * @param plano
	 * @return
	 */
	public String tratarAlteracao(Plano plano){
		gravarPlano(plano);
		gravarOpcao(PaginasEnum.PLANOALTERAR.getPagina());
		
		return new MenuBean().paginaPlanoAlterar();
	}
	
	/**
	 * 
	 * @param plano
	 * @return
	 */
	public String tratarExclusao(Plano plano){
		gravarPlano(plano);
		gravarOpcao(PaginasEnum.PLANOEXCLUIR.getPagina());
		
		return new MenuBean().paginaPlanoExcluir();
	}
	
	/**
	 * 
	 * @param opcao
	 */
	private void gravarOpcao(String opcao){
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();
			
		sessionMap.put("opcaoFiltroPlano", opcao);
	}
	
	/**
	 * 
	 * @param plano
	 */
	private void gravarPlano(Plano plano){		
		FacesContext ctx = FacesContext.getCurrentInstance();
		Map<String, Object> sessionMap = ctx.getExternalContext().getSessionMap();
			
		sessionMap.put("plano", plano);
	}	
	
	/**
	 * 
	 */
	private void tratarResultadoPesquisa(){
		if(planos.isEmpty()){
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

	/**
	 * @return the planos
	 */
	public List<Plano> getPlanos() {
		return planos;
	}

	/**
	 * @param planos the planos to set
	 */
	public void setPlanos(List<Plano> planos) {
		this.planos = planos;
	}

	/**
	 * @return the apresentarPlanoForm
	 */
	public boolean isApresentarPlanoForm() {
		return apresentarPlanoForm;
	}

	/**
	 * @param apresentarPlanoForm the apresentarPlanoForm to set
	 */
	public void setApresentarPlanoForm(boolean apresentarPlanoForm) {
		this.apresentarPlanoForm = apresentarPlanoForm;
	}


}
