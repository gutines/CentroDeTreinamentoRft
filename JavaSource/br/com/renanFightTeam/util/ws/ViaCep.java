package br.com.renanFightTeam.util.ws;


import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.logging.LogRecord;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonValue;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.primefaces.component.log.Log;

import br.com.renanFightTeam.model.Endereco;

public class ViaCep {
	
	private String mensagem;
	
	public Endereco getEnderecoPorCep(String cep) throws Exception{
				
		try{
			JsonObject jsonObject = getCepResponse(cep);
			
			JsonValue erro = jsonObject.get("erro");
			if(erro == null){
				Endereco endereco = new Endereco();
				
				endereco.setEndereco(jsonObject.getString("logradouro"));
				endereco.setBairro(jsonObject.getString("bairro"));
				endereco.setCidade(jsonObject.getString("localidade"));
				endereco.setEstado(jsonObject.getString("uf"));
				
				return endereco;
				
			}else{			
				mensagem = "Cep não Encontrado";
			}
			
		}catch(TimeoutException e){
			throw e;
		}catch(HttpException e){
			throw e;
		}catch(Exception e){
			mensagem = "Problemas na comuniação como serviço! Verifique a conexão com a internet e tente novamente.";	
			throw e;
		}
		
		
		
		return null;
	}

	private JsonObject getCepResponse(String cep) throws TimeoutException, HttpException {
		JsonObject responseJO = null;
		
		try{
			HttpGet httpGet = new HttpGet("https://viacep.com.br/ws/"+cep+"/json");
			HttpResponse response = HttpClients.createDefault().execute(httpGet);
			
			validarResponse(response.getStatusLine().getStatusCode());
			
			HttpEntity entity = response.getEntity();
			
			responseJO = Json.createReader(entity.getContent()).readObject();
			
		}catch (TimeoutException e) {
			throw e;
		}catch(HttpException e){
			throw e;
		} catch (ClientProtocolException e) {			
			mensagem = e.getMessage();
			e.printStackTrace();
		} catch (IOException e) {
			mensagem = e.getMessage();
			e.printStackTrace();
		}
		
		return responseJO;
	}
	
	private void validarResponse(int statusCode) throws TimeoutException, HttpException{
		
		switch (statusCode) {
		case 200:
			mensagem = ResponseCodesMessageEnum.RESPONSE_OK.getMensagem();
			logErro(statusCode);
			break;
			
		case 500:
			mensagem = ResponseCodesMessageEnum.RESPONSE_TIMEOUT.getMensagem();
			logErro(statusCode);
			throw new TimeoutException(mensagem);
		default:
			mensagem = ResponseCodesMessageEnum.RESPONSE_NOK.getMensagem();
			logErro(statusCode);
			throw new HttpException();
		}
	}
	
	private void logErro(int statusCode){
		System.out.println(mensagem + ", Status Code: " + statusCode);
	}
		
	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}
	
}
