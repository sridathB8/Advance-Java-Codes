public class Account {
    public int accNumber;
    private double accBal;

    public Account(int accNumber) {
        this.accNumber = accNumber;
        this.accBal = 0.0;
    }

    public int getAccbal() {
      return accBal;
    }
    
    public void add(int amount) {
      this.accBal+=amount;
    }
    
    public void deduct(int amount) {
      this.accBal-=amount;
    }
    
    public void checkBal()
    {
      System.out.println("the balance of the acc is:",+accBal);
    }
}

public class Payee extends Account {
    public int payeePhone;

    public Payee(int accNumber, int payeePhone) {
        super(accNumber);
        this.payeePhone = payeePhone;
    }
}

public class Payer extends Account {
    public int payerPhone;

    public Payer(int accNumber, int payerPhone) {
        super(accNumber);
        this.payerPhone = payerPhone;
    }
}

abstract class payment {

    abstract void Payment(Account receiver, Account sender, int amount)
    {
      //basefor payment methods...
    }

}

public class yonoPay extends payment{

  public void payment Payment(Account receiver, Account sender, int amount) {
     if(sender.accBal>=amount)
     {
        receiver.add(amount);
        sender.deduct(amount);
        System.out.println("The transaction for",+amount+,"from ",+sender+," to ",+receiver+" is complete");
     }
  }

}


//understanding
1) we made seperate classes for almost all the "nouns" and "verbs" to maintain SRP. Each class has only one responsibility.
2) we made sure that the code is open for extension through abstract class like payment and their derived class like yono.
3) With the Account class and its derived classes Payee and Payer, we made sure that it is following Liskov's Principle because both payee and payer can be substituted in base class Account.
4) It follows ISP because the abtract payment only handles payment function.

