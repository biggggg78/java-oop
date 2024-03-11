public class BasePlusCommissionEmployee extends CommissionEmployee {
private double basesalary;

BasePlusCommissionEmployee( String first, String last,String ssn, double sales, double rate, double salary ){
    super(first,last,ssn,sales,rate);
    basesalary = salary;
}
public void setBaseSalary( double salary ){
 basesalary = ( salary < 0.0 ) ? 0.0 : salary;
}
public double getBaseSalary(){
 return basesalary;
}
public double earnings(){
    return basesalary + super.earnings();
}
String tosString(){
    return String.format( "%s %s\n%s: %.2f", "base-salaried",super.toString(), "base salary", getBaseSalary() );
}




}
