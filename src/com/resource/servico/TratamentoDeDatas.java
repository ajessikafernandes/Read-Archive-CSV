package com.resource.servico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TratamentoDeDatas {

	static SimpleDateFormat sdf = new SimpleDateFormat();

	Date DT_INICIO = null;
	Date DT_FIM = null;

	public static long calcular (String inicio, String fim) throws ParseException {
        Date DT_INICIO = sdf.parse (inicio);
        Date DT_FIM = sdf.parse (fim);
        return 
             (DT_FIM.getTime() - DT_INICIO.getTime() + 3600000L) / 86400000L;
    }
	
//	public static void main(String[] args) throws Exception {
//        long dias = Intervalo.calcular ("01/02/2000", "02/02/2001");
//        System.out.println (dias);
//    }
}
