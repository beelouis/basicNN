import java.util.*;

class Neuron{
  private int id;
  private Random ran;
  private float value;
  private float bias;
  private float threshold;

  public Neuron(int id){
    this.id = id;
    this.ran = new Random();
    this.value = ran.nextFloat();
    this.bias = ran.nextFloat();
    this.threshold = ran.nextFloat();
  }

  public void printN(){
    System.out.println("=================");
    System.out.print("Neuron: " + id + " - ");
    System.out.print("Value: " + value + " - ");
    System.out.print("Bias: " + bias + " - ");
    System.out.println("threshold: " + threshold);
  }

}
