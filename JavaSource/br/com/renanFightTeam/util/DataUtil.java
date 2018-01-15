package br.com.renanFightTeam.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {
	
	private String data;
	private final String dataPattern = "yyyy-MM-dd";
	
	/**
	 * 
	 * @param data
	 * 
	 * Classe para tratamento de data recebida via Strins da tah Date do HTML5
	 */
	
	public DataUtil(String data){
		this.data = data;
	}
	
	/*
	 * Obter a data no formato Calendar
	 */
	public Calendar obterDataCalendar(){
		
		SimpleDateFormat sdf = new SimpleDateFormat(dataPattern);
		Calendar c = Calendar.getInstance();
		
		try {
			c.setTime(sdf.parse(data));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Problemas na conversão da data!");
			e.printStackTrace();
		}
		
		return c;
		
	}
	
}	

