class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
	String[] emojis = {};
    for(int x=0;x<=emojis.length-1;x++){
      print(convertToEmoji(emojis[x]));
    }
    double[] itemPrices = {15, 50, 43, 13.99, 25};
    print( total(itemPrices) );

  }



  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }
	
  double total(double[] prices){
    double sum=0;
    for(int x=0; x<= prices.length-1; x++){
      sum+= prices[x];
    }
    double taxAmt = sum*0.08525;
    return sum+ taxAmt;
  }
  
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
}