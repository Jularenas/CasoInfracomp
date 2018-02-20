package Caso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Server extends Thread {
	
	private int nServerThreads;
	
	public Server(int nServerThreads){
		this.nServerThreads= nServerThreads;
	}

	public int getnServerThreads() {
		return nServerThreads;
	}

	public void setnServerThreads(int nServerThreads) {
		this.nServerThreads = nServerThreads;
	}
	
	

}
