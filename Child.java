public class Child implements Passenger{

  private int fare;

  public Child(int fare){
    this.fare = fare;
  }

  public int getFare(){
    return this.fare;
  }

  public String childGreet(){
    return "Heeeyaaaa!";
  }
}