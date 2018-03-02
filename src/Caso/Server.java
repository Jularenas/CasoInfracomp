package Caso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Server extends Thread {
	
	private Buffer buff;
	private int nServerThreads;
	private ServerThread[] serverThreads;
	
	public Server(int nServerThreads, Buffer buff){
		this.nServerThreads= nServerThreads;
		this.buff=buff;
		serverThreads= new ServerThread[this.nServerThreads];
	}

	public int getnServerThreads() {
		return nServerThreads;
	}

	public void setnServerThreads(int nServerThreads) {
		this.nServerThreads = nServerThreads;
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < nServerThreads; i++) {
			serverThreads[i]= new ServerThread(buff);
		}
		for (int i = 0; i < nServerThreads; i++) {
			serverThreads[i].start();
		}
	}
}
