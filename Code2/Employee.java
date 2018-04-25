// Noun
public class Employee {
private int id;  // Instance Members
private String  name;
private double salary;
private String phone;
private String city;
private String email;
private String pinCode;
private String companyName ;
private String cachedValue;
private String getValueFromDB(){
	return "Fetch the Data from the DB....";
}
{
	cachedValue = getValueFromDB();
	//int c ; // I am a Local Var
	System.out.println("I am a Init Block, Pre Constructor Call");
	System.out.println("Id "+id+" name "+name+" salary "+salary);
}
{
	
}
Employee(){
	companyName= "Tata Powers";
	System.out.println("Default Cons Call ");
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	if(salary>0) {
	this.salary = salary;
	}
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPinCode() {
	return pinCode;
}

public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

private boolean validate(int id , String name , double salary) {
	if(id>0 && salary>0) {
		return true;
	}
	else {
		return false;
	}
}
Employee(int id , String name, double salary){
	this();
	
	if(validate(id, name ,salary)) {
	this.id = id;  // Instance Var = Local Var
	this.name = name;
	this.salary = salary;
	System.out.println("Param Cons Call "+this.id+" "+this.name+" "+this.salary );
	}
	else {
		System.out.println("Invalid Inputs....");
	}
	//this();
}

public void print() {
	// this keyword , it has current calling object reference
	System.out.println("Id "+this.id);  // 99.id
	System.out.println("Name is "+name);
	System.out.println("Salary is "+salary);
	System.out.println("Company "+companyName);
}
}
