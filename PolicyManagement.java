package com.DSAproblems.arrayList;

import java.util.ArrayList;

class Policy
{
    int policyNumber;
    String policyHolderName;
    String insuranceType;
    double coverageAmount;

    public Policy(int policyNumber, String policyHolderName, String insuranceType, double coverageAmount)
    {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.insuranceType = insuranceType;
        this.coverageAmount = coverageAmount;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber +
                ", Policyholder Name: " + policyHolderName +
                ", Insurance Type: " + insuranceType +
                ", Coverage Amount: " + coverageAmount;
    }
}

public class PolicyManagement
{
    ArrayList<Policy> policies = new ArrayList<>();

    public void addPolicy(Policy policy)
    {
        policies.add(policy);
        System.out.println("Policy added: " + policy);
    }

    public void removePolicy(int policyNumber)
    {
        policies.removeIf(policy -> policy.policyNumber == policyNumber);
        System.out.println("Policy with number " + policyNumber + " removed.");
    }

    public void updatePolicy(int policyNumber, String newName, String newType, double newCoverage)
    {
        for (Policy policy : policies)
        {
            if (policy.policyNumber == policyNumber)
            {
                policy.policyHolderName = newName;
                policy.insuranceType = newType;
                policy.coverageAmount = newCoverage;
                System.out.println("Policy updated: " + policy);
                return;
            }
        }
        System.out.println("Policy with number " + policyNumber + " not found.");
    }

    public void listPoliciesByType(String insuranceType)
    {
        System.out.println("Policies of type " + insuranceType + ":");
        for (Policy policy : policies)
        {
            if (policy.insuranceType.equalsIgnoreCase(insuranceType))
            {
                System.out.println(policy);
            }
        }
    }

    public static void main(String[] args)
    {
        PolicyManagement pm = new PolicyManagement();

        pm.addPolicy(new Policy(101, "Deepika", "Health", 50000));
        pm.addPolicy(new Policy(102, "Ramya", "Life", 100000));
        pm.addPolicy(new Policy(103, "Asha", "Auto", 30000));
        pm.addPolicy(new Policy(104, "Usha", "Health", 60000));

        System.out.println("List all Health policies:");
        pm.listPoliciesByType("Health");

        System.out.println("Update Policy 102:");
        pm.updatePolicy(102, "Nisha", "Life", 120000);

        System.out.println("Remove Policy 103:");
        pm.removePolicy(103);

        System.out.println("List all Life policies:");
        pm.listPoliciesByType("Life");
    }
}