package StatePattern;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine(5);
	    System.out.println(gumballMachine);
	    
	    gumballMachine.insertQuarter();
	    gumballMachine.turnCrank();

	    System.out.println(gumballMachine);
	  
	    gumballMachine.insertQuarter();
	    gumballMachine.turnCrank();
	    gumballMachine.insertQuarter();
	    gumballMachine.turnCrank();
	    gumballMachine.ejectQuarter();

	    System.out.println(gumballMachine);
	    gumballMachine.insertQuarter();
	    gumballMachine.insertQuarter();
	    gumballMachine.turnCrank();
	    gumballMachine.insertQuarter();
	    gumballMachine.turnCrank();
	    gumballMachine.insertQuarter();
	    gumballMachine.turnCrank();

	    System.out.println(gumballMachine);

	}

}
