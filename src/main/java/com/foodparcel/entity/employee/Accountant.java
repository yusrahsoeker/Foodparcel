package com.foodparcel.entity.employee;

public class Accountant  extends Employee{

    public Accountant(){}

    public Accountant(Builder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "Accountant{} " + super.toString();
    }

    public static class AccountantBuilder extends Employee.Builder{

        public AccountantBuilder copy(Accountant accountant){
            this.employeeNumber =  accountant.getEmployeeNumber();
            this.identityNumber =  accountant.getIdentityNumber();
            this.firstName =  accountant.getFirstName();
            this.lastName =  accountant.getLastName();
            this.jobTitle =  accountant.getJobTitle();
            return this;
        }

        @Override
        public Employee build(){
            return new Accountant(this);
        }
    }

}
