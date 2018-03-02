package Caso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
	
	
	public static void load(String pFile,Buffer buff)
	{
		try(BufferedReader in= new BufferedReader(new FileReader(new File(pFile))))
		{
			while(in.readLine()!=null)
			{
				String line=in.readLine();
				String [] args= line.split(",");
				int nClientes=Integer.parseInt(args[0]);
				int nServers=Integer.parseInt(args[1]);
				int serverThreads=Integer.parseInt(args[2]);
				int i=0;
				while(i<nClientes)
				{
					i++;
					String ln=in.readLine();
					int nMensajes=10;
					if(ln!=null){
						 nMensajes=Integer.parseInt(ln);
					}	
					Cliente c= new Cliente(nMensajes,buff);
					c.start();
				}
				i=0;
				while(i<nServers)
				{
					i++;
					Server s= new Server(serverThreads, buff);
					s.start();
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	public static void main(String [] args)
	{
		String pFile="./data/sisa.txt";
		Buffer buff= new Buffer();
		load(pFile,buff);
	}
	

}
