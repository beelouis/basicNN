import java.util.*;

class Neuron{
  private int id;
  private Random ran;
  private float value;
  private float bias;
  private float threshold;

  private HashMap<Integer, Float> outgoing;
  private HashMap<Integer, Float> incoming;


  public Neuron(int id){
    this.id = id;
    this.ran = new Random();
    this.value = ran.nextFloat();
    this.bias = ran.nextFloat();
    this.threshold = ran.nextFloat();
    outgoing = new HashMap<>();
    incoming = new HashMap<>();
  }

  public int id(){
    return this.id;
  }

  public void addOut(int neuronID){
    outgoing.put(neuronID, ran.nextFloat());
  }

  public void addIn(int neuronID){
    incoming.put(neuronID, ran.nextFloat());
  }

  public void printN(){
    System.out.println("=========== Neuron: " + id + "===========");
    System.out.print("Value: " + value + " - ");
    System.out.print("Bias: " + bias + " - ");
    System.out.println("threshold: " + threshold);
    System.out.println("\nInputs:");
    for (HashMap.Entry<Integer, Float> e : incoming.entrySet()){
      System.out.println("Neuron " + e.getKey() + " - " + e.getValue());
    }
    System.out.println("\nOutputs:");
    for (HashMap.Entry<Integer, Float> e : outgoing.entrySet()){
      System.out.println("Neuron " + e.getKey() + " - " + e.getValue());
    }
  }

}
