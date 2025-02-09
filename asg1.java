class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class EmployeePaySlip {
        
	void PrintPaySlip(){
		System.out.println("Employee: " + name + ", Salary: $" + salary);
	}
}

abstract class SaveEmpInfo{

	public abstract void SaveInfo(){
	
	}

}

class SysSaveInfo extends SaveEmpInfo{
	public void SaveInfo(){
		System.out.println("Employee Information Saved to System.");
	}
}


//correction...


1) The given code in assignment sheet had many reposibilities, we took all of them and made it into another class so that each class has only one responsibility.

2) Another class for printing slip.

3) Different classes for saving info into databases.

