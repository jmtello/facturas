package facturas;

import java.util.Date;

/**
 * FACTURAS 
 * @author jmtello
 *
 */
public class Factura {

	private Date fecha;
	private String var1 = "Indra";
	
	public String sayHello()
	{
		return "Hello";
	}
	
	public void printDate() {
		
		System.out.println(new Date());
		
	}
	
	public static void proveedor2()
	{
		//CAMBIO PROVEEDOR2
	
		//Otro cambio de ialcazar, proveeedor 2
	}
	
	
	public String getIndraName2()
	{
		return "INDRA S.A.";
	}
	
	public void printMessage(String message)
	{
		System.out.println("message="+message);
	}
}
