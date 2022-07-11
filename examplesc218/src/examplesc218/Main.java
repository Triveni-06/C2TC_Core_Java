package examplesc218;

import java.util.*;
class Base extends Exception{}
class Derived extends Base{}
public class Main{
	 public static void main(String args[]){
		 try {
			 throw new Derived();
		 }
		 catch(Base b) {
			 System.out.println("caught base class exception");
		 }
		 catch(Derived d) {
			 System.out.println("caught derived class exception");
		 }
	 }
}



