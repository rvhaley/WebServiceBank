package com.trylag.webservicebank.entity;

/**
 *
 * @author Richard Haley III
 */
public class LoanRequest {

    private long ssn;
    private int creditScore;
    private double loanAmount;
    private String loanDuration;

    public LoanRequest(long ssn, int creditScore, double loanAmount, String loanDuration) {
        this.ssn = ssn;
        this.creditScore = creditScore;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
    }

    public LoanRequest() {
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(String loanDuration) {
        this.loanDuration = loanDuration;
    }

}
