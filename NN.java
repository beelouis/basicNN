import java.util.*;

class NN{
	private ArrayList<Layer> layers;

	public NN(int[] layers){
		this.layers = new ArrayList<>();
		for (int i = 0; i < layers.length; i ++){
			this.layers.add(new Layer(layers[i]));
		}
	}

	public boolean fullyConnect(){
		for (int l = 0; l < layers.size(); l ++){
			if (l == layers.size()-1)	return true;
			Layer pre = layers.get(l);
			for (Neuron i : pre.neurons()){
				Layer post = layers.get(l + 1);
				for (Neuron j : post.neurons()){
					i.addOut(j.id());
					j.addIn(i.id());
				}
			}
		}
		return false;
	}

	public void printNN(){
		for (Layer l : layers){
			l.printL();
		}
	}
}
