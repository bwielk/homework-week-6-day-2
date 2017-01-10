public class Adult implements Passenger{

  private int fare;

  public Adult(int fare){
    this.fare = fare;
  }
  
  public int getFare(){
    return this.fare;
  }

  public String adultGreet(){
    return "Good afternoon, Sir!";
  }
}