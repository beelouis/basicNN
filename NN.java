import java.util.*;

class NN{
	private ArrayList<Neuron> neurons;

	public NN(int size){
		neurons = new ArrayList<>();

		for (int i = 0; i < size; i++){
			neurons.add(new Neuron(i));
			neurons.get(i).printN();
		}
	}
}
