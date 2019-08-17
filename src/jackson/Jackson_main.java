package jackson;

import java.util.Arrays;

public class Jackson_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 50000;
		//P153 例題9-4
		int N = 3;
		double p[][] = {{0,0,1},{0,0,0.6},{0.5,0,0}};
		double lambda[] = {2,1,0};
		double mu[] = {5,4,6};

		Jackson_lib jlib = new Jackson_lib(N,time,p,lambda,mu);
		System.out.println("Simulation : 系内人数 = "+Arrays.toString(jlib.getSimulation()));
		
		//グラフ描画
		Graph graph = new Graph(jlib.getQueuelength(),N);
		graph.setBounds(5,5,1000,600);
		graph.setVisible(true);
	}

}
