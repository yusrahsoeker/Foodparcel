package com.foodparcel.entity.employee;

public class Scheduler extends Employee {

    public Scheduler() {
    }

    public Scheduler(Builder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return "Scheduler{} " + super.toString();
    }

    public static class SchedulerBuilder extends Employee.Builder{

        public SchedulerBuilder copy(Scheduler scheduler){
            this.employeeNumber = scheduler.getEmployeeNumber();
            this.identityNumber = scheduler.getIdentityNumber();
            this.firstName = scheduler.getFirstName();
            this.lastName = scheduler.getLastName();
            this.jobTitle = scheduler.getJobTitle();
            this.employmentDate = scheduler.getEmploymentDate();
            return this;
        }

        @Override
        public Employee build() {
            return new Scheduler(this);
        }
    }
}
