package br.com.renanFightTeam.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.Part;


public class FotoUtil {
	
	private static final long MAX_SIZE = 2 * 1024 * 1024;;
	private Part arquivo;
	private final String DEFAUT_PATH = "/temp/rft/uploads";	
	private String path;
	
	public FotoUtil(){
		
		path = DEFAUT_PATH;
		
	}
	
	public void importarArquivo(){
		
		System.out.println("Arquivo " + arquivo.getName());
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

	
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
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

	
}
