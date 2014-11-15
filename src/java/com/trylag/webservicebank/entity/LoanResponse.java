package com.trylag.webservicebank.entity;

/**
 *
 * @author Richard Haley III
 */
public class LoanResponse {

    private double interestRate;
    private long ssn;

    public LoanResponse(double interestRate, long ssn) {
        this.interestRate = interestRate;
        this.ssn = ssn;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

}
