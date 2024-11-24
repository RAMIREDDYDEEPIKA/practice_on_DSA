package com.DSAproblems.arrayList;

import java.util.ArrayList;

class CoverageOption
{
    String coverageType;
    double coverageAmount;
    double premium;

    public CoverageOption(String coverageType, double coverageAmount, double premium)
    {
        this.coverageType = coverageType;
        this.coverageAmount = coverageAmount;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Coverage Type: " + coverageType + ", Coverage Amount: " + coverageAmount + ", Premium: " + premium;
    }
}

public class InsuranceCoverageComparison
{
    private ArrayList<CoverageOption> coverageOptions = new ArrayList<>();

    public void addCoverageOption(CoverageOption option)
    {
        coverageOptions.add(option);
    }

    public void compareCoverageOptions()
    {
        if (coverageOptions.isEmpty())
        {
            System.out.println("No coverage options available for comparison.");
            return;
        }

        CoverageOption bestCoverage = coverageOptions.get(0);
        for (CoverageOption option : coverageOptions)
        {
            if (option.coverageAmount > bestCoverage.coverageAmount && option.premium <= bestCoverage.premium)
            {
                bestCoverage = option;
            }
        }

        System.out.println("Best Coverage Option based on highest coverage amount and reasonable premium:");
        System.out.println(bestCoverage);
    }

    public void generateReport()
    {
        System.out.println("Insurance Coverage Options:");
        for (CoverageOption option : coverageOptions)
        {
            System.out.println(option);
        }
    }

    public static void main(String[] args)
    {
        InsuranceCoverageComparison comparisonTool = new InsuranceCoverageComparison();

        CoverageOption option1 = new CoverageOption("Health", 100000, 5000);
        CoverageOption option2 = new CoverageOption("Life", 200000, 8000);
        CoverageOption option3 = new CoverageOption("Auto", 50000, 2000);
        CoverageOption option4 = new CoverageOption("Health", 150000, 4500);

        comparisonTool.addCoverageOption(option1);
        comparisonTool.addCoverageOption(option2);
        comparisonTool.addCoverageOption(option3);
        comparisonTool.addCoverageOption(option4);

        comparisonTool.generateReport();
        comparisonTool.compareCoverageOptions();
    }
}