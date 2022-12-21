import java.util.*;

class Layer{
  private ArrayList<Neuron> neurons;

  public Layer(int numNodes){
    neurons = new ArrayList<>();
    for (int i = 0; i < numNodes; i++){
      neurons.add(new Neuron(i));
    }
  }

  public ArrayList<Neuron> neurons(){
    return neurons;
  }

  public void printL(){
    System.out.println("\n=======================================");
    for (Neuron n : neurons){
      n.printN();
    }
  }
}
