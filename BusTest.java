import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;
  BusStop stop;

  @Before
  public void before() {
    bus = new Bus(10, "Bonaly", 30);
    person = new Person();
    stop = new BusStop("Heaven");
  }

  @Test 
  public void hasLineNumber(){
    assertEquals(10, bus.getNumber());
  }

  @Test
  public void hasDestination(){
    assertEquals("Bonaly", bus.getDestination());
  }

  @Test
  public void theBusIsEmpty(){
    assertEquals(0, bus.passCount());
  }

  @Test 
  public void theBusIsFull(){
    for(int i=0; i<bus.limit; i+=1){ //makes the array FULL!
      bus.pickUp(person);
    }
    assertEquals(true, bus.theBusIsFull());
  }

  @Test 
  public void passengerCanGetIn(){
    Person person = new Person();
    bus.pickUp(person);
    assertEquals(1, bus.passCount());
  }

  @Test
  public void passengerGetsOff(){
    Person person = new Person();
    bus.pickUp(person);
    bus.dropOff();
    assertEquals(0, bus.passCount());
  }

  @public void canChargePassengers(){
    
  }

  ///////////////////////////////////////////////////////////////////////////////
  @Test
  public void busStopHasName(){
    assertEquals("Heaven", stop.getName());
  }

  @Test
  public void canAddToQueue(){
    stop.add(person);
    assertEquals(1, stop.personCount());
  }

}