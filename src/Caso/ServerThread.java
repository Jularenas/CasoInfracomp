package Caso;

public class ServerThread extends Thread{

	private Buffer buff;
	
	public ServerThread(Buffer buff) {
		this.buff=buff;
	}
	
	@Override
	public void run() {
		super.run();
		
		while(true){
			if(!buff.atender()) {break;};
			continue;
		}
	}
}
