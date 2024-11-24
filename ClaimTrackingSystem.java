package com.DSAproblems.arrayList;

import java.util.ArrayList;

class Claim
{
    int claimNumber;
    int policyNumber;
    String claimantName;
    double claimAmount;
    String status;

    public Claim(int claimNumber, int policyNumber, String claimantName, double claimAmount, String status)
    {
        this.claimNumber = claimNumber;
        this.policyNumber = policyNumber;
        this.claimantName = claimantName;
        this.claimAmount = claimAmount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim Number: " + claimNumber +
                ", Policy Number: " + policyNumber +
                ", Claimant: " + claimantName +
                ", Claim Amount: " + claimAmount +
                ", Status: " + status;
    }
}

public class ClaimTrackingSystem
{
    private ArrayList<Claim> claims = new ArrayList<>();

    public void addClaim(Claim claim)
    {
        claims.add(claim);
        System.out.println("Claim added: " + claim);
    }

    public void updateClaimStatus(int claimNumber, String newStatus)
    {
        for (Claim claim : claims)
        {
            if (claim.claimNumber == claimNumber)
            {
                claim.status = newStatus;
                System.out.println("Claim status updated: " + claim);
                return;
            }
        }
        System.out.println("Claim with number " + claimNumber + " not found.");
    }

    public void generateReport(String status)
    {
        System.out.println("Generating report for claims with status: " + status);
        for (Claim claim : claims)
        {
            if (claim.status.equalsIgnoreCase(status))
            {
                System.out.println(claim);
            }
        }
    }

    public static void main(String[] args)
    {
        ClaimTrackingSystem cts = new ClaimTrackingSystem();

        cts.addClaim(new Claim(1001, 101, "Lakshmi", 5000, "pending"));
        cts.addClaim(new Claim(1002, 102, "Usha", 3000, "approved"));
        cts.addClaim(new Claim(1003, 103, "Pranathi", 2000, "rejected"));
        cts.addClaim(new Claim(1004, 101, "Poojitha", 4000, "pending"));

        cts.updateClaimStatus(1001, "approved");

        System.out.println("Pending Claims Report:");
        cts.generateReport("pending");

        System.out.println("Approved Claims Report:");
        cts.generateReport("approved");

        System.out.println("Rejected Claims Report:");
        cts.generateReport("rejected");
    }
}