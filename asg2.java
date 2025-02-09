abstract class Bird {

    private int canFly;

    public Bird(int canFly) {
        this.canFly = canFly;
    }
	 
    abstract void fly() { 
       if(canFly==1)
	      {
		      System.out.println("The bird has feathers and can fly");
	      }
              else
	      {
		      System.out.println("The bird has feather but can't fly");
	      }
   }

}



class penguin extends bird {

	//this class can be initialisez with same kind of constructor and on that basis it can decided whether the class of bird flies or not.
	  public penguin(int canFly)
	  {
	    //we can pass this to the same constructor in base class.
	  }
	  
	  void fly() {
	   //here we will get to know whether it can fly or
	  }


}

//in the code provided in Assignment sheet we had base class which already assumed the the classes which will be derived from it will also have the feature of "flying" but it was not the case with penguin that's why we added a boolean function which will make it as easy to replace the base class with another derived class which does not have the ability by simply keeping it boolean false.













