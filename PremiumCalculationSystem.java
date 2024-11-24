package com.DSAproblems.arrayList;

import java.util.ArrayList;

class InsurancePolicy
{
    int policyNumber;
    String policyType;
    double basePremium;
    double riskFactor;
    double calculatedPremium;

    public InsurancePolicy(int policyNumber, String policyType, double basePremium, double riskFactor)
    {
        this.policyNumber = policyNumber;
        this.policyType = policyType;
        this.basePremium = basePremium;
        this.riskFactor = riskFactor;
        this.calculatedPremium = 0.0;
    }

    public void calculatePremium()
    {
        this.calculatedPremium = basePremium * (1 + riskFactor);
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Type: " + policyType +
                ", Base Premium: " + basePremium + ", Risk Factor: " + riskFactor +
                ", Calculated Premium: " + calculatedPremium;
    }
}

public class PremiumCalculationSystem
{
    private ArrayList<InsurancePolicy> policies = new ArrayList<>();

    public void addPolicy(InsurancePolicy policy)
    {
        policies.add(policy);
    }

    public void calculateAllPremiums()
    {
        for (InsurancePolicy policy : policies)
        {
            policy.calculatePremium();
        }
    }

    public void generateReport()
    {
        System.out.println("Premium Calculation Report:");
        for (InsurancePolicy policy : policies)
        {
            System.out.println(policy);
        }
    }

    public static void main(String[] args)
    {
        PremiumCalculationSystem pcs = new PremiumCalculationSystem();

        InsurancePolicy policy1 = new InsurancePolicy(101, "Health", 2000, 0.1);
        InsurancePolicy policy2 = new InsurancePolicy(102, "Life", 5000, 0.15);
        InsurancePolicy policy3 = new InsurancePolicy(103, "Auto", 1000, 0.05);

        pcs.addPolicy(policy1);
        pcs.addPolicy(policy2);
        pcs.addPolicy(policy3);

        pcs.calculateAllPremiums();
        pcs.generateReport();
    }
}