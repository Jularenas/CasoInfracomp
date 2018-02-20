package Caso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
	
	
	public static void load(String pFile)
	{
		try(BufferedReader in= new BufferedReader(new FileReader(new File(pFile))))
		{
			while(in.readLine()!=null)
			{
				String line=in.readLine();
				String [] args= line.split(",");
				int nClientes=Integer.parseInt(args[0]);
				int nServers=Integer.parseInt(args[1]);
				int i=0;
				while(i<nClientes)
				{
					String ln=in.readLine();
					int nMensajes=Integer.parseInt(ln);
					Cliente c= new Cliente(nMensajes);
					c.start();
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	public static void main(String [] args)
	{
		String pFile="";
		load(pFile);
	}
	

}
