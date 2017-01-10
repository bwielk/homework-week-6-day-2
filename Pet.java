public class Pet implements Passenger{
  
  private int fare;

  public Pet(int fare){
    this.fare = fare;
  }

  public int getFare(){
    return this.fare;
  }

  public String petGreet(){
    return "?????";
  }
}