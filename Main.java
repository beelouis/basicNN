class Main{
  public static void main(String[] args){
    for (int i = 0; i < args.length; i++){
      System.out.println("Arg " + i + ", " + args[i]);
    }

    int[] layers = new int[3];
    layers[0] = 2;
    layers[1] = 5;
    layers[2] = 2;

    NN network = new NN(layers);
    network.fullyConnect();
    network.printNN();
  }
}
