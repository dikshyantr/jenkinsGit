package jenkinsGit;

public class CountN {
	private static int a;
	
	public CountN(){
		a = 1;
	}
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
		for(int j = 1; j < 100; j++){
			if(j%2 == 0){
				System.out.println(j);
			}
		}
		for(int k = 1; k < 100; k++){
			if(k%3 == 0){
				System.out.println(k);
			}
		}
		if(true){
			if(true){
				if(true){
					while(true){
						while(true){
							
						}
					}
				}
			}
		}
		while(true){
			System.out.println("Ok");
		}
	}
}
