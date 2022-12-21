class Main{
  public static void main(String[] args){
    for (int i = 0; i < args.length; i++){
      System.out.println("Arg " + i + ", " + args[i]);
    }

    int size;
    try {
      size = Integer.valueOf(args[0]);
    } catch (ArrayIndexOutOfBoundsException e){
      size = 1;
      System.out.println("(using default value of 1 neuron)");
    }
    
    NN network = new NN(size);
  }
}
