package br.com.renanFightTeam.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.imageio.ImageIO;
import javax.servlet.http.Part;


public class FotoUtil {
	
	private static final long MAX_SIZE = 2 * 1024 * 1024;;
	private Part arquivo;
	private final String RELATIVE_PATH = "/resources/imagens/fotos";
	private final String DEFAUT_PATH = FacesContext.getCurrentInstance().getExternalContext().getRealPath(RELATIVE_PATH);
	
	private String fotoPath;
	private String nomeFoto;

	/**
	 * Classe de tratamento e importação de foto para o servidor.
	 */
	
	public FotoUtil(){		
		
		verificarDiretorio();
		carregarFotoPadrao();		
		
	}
	
	/*
	 * Construtor quando for outra solicitação diferente de inclusão
	 */
	public FotoUtil(String codigoFoto){		
		carregarFotoAluno(codigoFoto);
	}
	
	/**
	 * Método que efetua carga da foto padrão quando for inclusão do aluno
	 */
	private void carregarFotoPadrao() {
		setFotoPath("/resources/imagens/padrao.jpg");		
	}
	
	/**
	 * Carregar foto do aluno ja importada ao servidor
	 * @param codigoFoto
	 * 
	 */
	private void carregarFotoAluno(String codigoFoto) {
		setFotoPath(DEFAUT_PATH + codigoFoto);
	}
		
	/**
	 * Verifica se Diretorio existe caso nao cria o diretório
	 */
	private void verificarDiretorio() {		
		File dir = new File(DEFAUT_PATH); 
		
		if(!(dir.exists())){
			dir.mkdir();			
		}		
	}	
	
	public void importarArquivo(){
		
		deletarFoto();
		
		nomeFoto = gerarCodigoFoto() + ".jpg";
		
		try {
			
			Scanner scanner = new Scanner(arquivo.getInputStream());			
			BufferedImage imagem = ImageIO.read(arquivo.getInputStream());
			
			ImageIO.write(imagem, "jpg", new File(DEFAUT_PATH +  "/" + nomeFoto));
			
			fotoPath = RELATIVE_PATH + "/" + nomeFoto;
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}	
		
	private void deletarFoto() {		
		if(!(nomeFoto == null)){
			new File(DEFAUT_PATH +  "/" + nomeFoto).delete();
		}
		
	}

	public void valida(FacesContext context, UIComponent component, Object value)throws ValidatorException {

		Part part = (Part) value;
        
        if (part.getSize() > MAX_SIZE) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                    "Arquivo muito grande", "O arquivo deve ter o tamanho máximo de 2mb.");
            throw new ValidatorException(msg);
        }

        if (!"image/jpeg".equals(part.getContentType())) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                    "Tipo de arquivo inválido", "O arquivo deve ser do tipo texto.");
            throw new ValidatorException(msg);
        }
    }

	private String gerarCodigoFoto(){
		return Timestamp.valueOf(LocalDateTime.now()).toString().replace("-", "").replace(":", "").replace(" ", "").replace(".", "");
	}
	
	/**
	 * @return the dEFAUT_PATH
	 */
	public String getDEFAUT_PATH() {
		return DEFAUT_PATH;
	}

	/**
	 * @return the arquivo
	 */
	public Part getArquivo() {
		return arquivo;
	}

	/**
	 * @param arquivo the arquivo to set
	 */
	public void setArquivo(Part arquivo) {
		this.arquivo = arquivo;
	}

	/**
	 * @return the nomeFoto
	 */
	public String getNomeFoto() {
		return nomeFoto;
	}

	/**
	 * @param nomeFoto the nomeFoto to set
	 */
	public void setNomeFoto(String nomeFoto) {
		this.nomeFoto = nomeFoto;
	}

	/**
	 * @return the fotoPath
	 */
	public String getFotoPath() {
		return fotoPath;
	}

	/**
	 * @param fotoPath the fotoPath to set
	 */
	public void setFotoPath(String fotoPath) {
		this.fotoPath = fotoPath;
	}	
}
