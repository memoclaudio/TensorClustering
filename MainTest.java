import java.io.IOException;
import java.util.ArrayList;

import JTensor.Tensor;
import clustering.TensorClusteringCplex;
import ilog.concert.IloException;

public class MainTest {

	public static void main(String[] args) throws IOException, IloException {
		//Number of instance 
		int numInst = 6;
		//Number of clusters
		int K = 2;
		//Number of ALS iterations
		int numiter = 10;
		//Number of random initializations
		int numrep = 10;
		
		
		//Load tensor from files and store all the instances
		ArrayList<Tensor> inst = new ArrayList<Tensor>();
		for(int i=1; i<=numInst; i++)
			inst.add(new Tensor(args[0]+Integer.toString(i)));
		
		//Range of values for the random initialization of the centroids
		double[] range = {0, 6};
		short[] curr = TensorClusteringCplex.clusterTensors(inst,K,numiter,numrep,range);
		
		//Print output of cluster
		for(int i=0; i<curr.length; i++)
			System.out.println(i + ": " + curr[i]);
	}

}
