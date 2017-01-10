import java.util.*;

class BusStop{
  private String name;
  private ArrayList<Person> queue;

  public BusStop(String name){
    this.name = name;
    this.queue = new ArrayList<Person>();
  }

  public String getName(){
    return this.name;
  }

  public int personCount(){
    return queue.size();
  }

  // public boolean theBusStopIsFull(){
  //   return personCount() == queue.length;
  // }

  public void add(Person person){
    queue.add(person);
  }
}