public class BasePlusCommissionEmployee2 {
    private CommissionEmployee comm;
    private Double basesalary;

BasePlusCommissionEmployee2( String first, String last,String ssn, double sales, double rate, double salary ){
    comm = new CommissionEmployee(first,last,ssn,sales,rate);
    setBaseSalary( salary);
}
void setBaseSalary( double salary ){
    basesalary = ( salary < 0.0 ) ? 0.0 : salary;
   }
public double getBaseSalary(){
    return basesalary;
   }
   public double earnings(){
       return basesalary + comm.earnings();
   }
   public String toString(){
    return String.format( "%s %s\n%s: %.2f", "base-salaried",comm.toString(), "base salary", getBaseSalary() );
   }
   String getFirstName(){
    return comm.getFirstName();
   }
   String getLastName(){
    return comm.getLastName();
   }
   String getSocialSecurityNumber(){
    return comm.getSocialSecurityNumber();
   }
   double getGrossSales(){
    return comm.getGrossSales();
   }
   double getCommissionRate(){
    return comm.getCommissionRate();
   }





}

