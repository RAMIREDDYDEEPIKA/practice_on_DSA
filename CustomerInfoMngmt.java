package com.DSAproblems.arrayList;

import java.util.ArrayList;

class CPolicy {
    int policyNumber;
    String policyType;
    double coverageAmount;

    public CPolicy(int policyNumber, String policyType, double coverageAmount)
    {
        this.policyNumber = policyNumber;
        this.policyType = policyType;
        this.coverageAmount = coverageAmount;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Type: " + policyType + ", Coverage: " + coverageAmount;
    }
}

class Customer
{
    int customerID;
    String name;
    String address;
    String phoneNumber;
    ArrayList<CPolicy> policies;

    public Customer(int customerID, String name, String address, String phoneNumber) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.policies = new ArrayList<>();
    }

    public void addPolicy(CPolicy policy) {
        policies.add(policy);
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerID + ", Name: " + name + ", Address: " + address + ", Phone: " + phoneNumber;
    }
}

public class CustomerInfoMngmt
{
     private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
        System.out.println("Customer added: " + customer);
    }

    public void updateCustomerDetails(int customerID, String newName, String newAddress, String newPhoneNumber)
    {
        for (Customer customer : customers)
        {
            if (customer.customerID == customerID)
            {
                customer.name = newName;
                customer.address = newAddress;
                customer.phoneNumber = newPhoneNumber;
                System.out.println("Customer details updated: " + customer);
                return;
            }
        }
        System.out.println("Customer with ID " + customerID + " not found.");
    }

    public void getPoliciesByCustomerID(int customerID)
    {
        for (Customer customer : customers)
        {
            if (customer.customerID == customerID)
            {
                System.out.println("Policies for customer: " + customer.name);
                for (CPolicy policy : customer.policies)
                {
                    System.out.println(policy);
                }
                return;
            }
        }
        System.out.println("Customer with ID " + customerID + " not found.");
    }

    public static void main(String[] args) {
        CustomerInfoMngmt cim = new CustomerInfoMngmt();

        Customer customer1 = new Customer(1, "Aashu", "123 Main St", "555-1234");
        customer1.addPolicy(new CPolicy(101, "Health", 50000));
        customer1.addPolicy(new CPolicy(102, "Life", 100000));

        Customer customer2 = new Customer(2, "pooja", "456 Elm St", "555-5678");
        customer2.addPolicy(new CPolicy(103, "Auto", 30000));

        cim.addCustomer(customer1);
        cim.addCustomer(customer2);

        cim.updateCustomerDetails(1, "pooja", "123 Main St, Apt 101", "555-9999");

        cim.getPoliciesByCustomerID(1);
        cim.getPoliciesByCustomerID(2);
    }
}