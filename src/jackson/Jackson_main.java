package jackson;

import java.util.Arrays;

public class Jackson_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 3, time = 100;
		double p[][] = {{0,0,1},{0,0,0.6},{0.5,0,0}};
		double lambda[] = {2,1,0};
		double mu[] = {5,4,6};

		Jackson_lib jlib = new Jackson_lib(N,time,p,lambda,mu);
		System.out.println("Simulation : 系内人数 = "+Arrays.toString(jlib.getSimulation()));
	}

}
