package com.trylag.webservicebank.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Richard Haley III
 */
@WebService(serviceName = "CalculateInterestRate")
public class CalculateInterestRate {

    /**
     * Web service operation.
     *
     * @param creditScore An integer with max value of 850
     * @return interestRate A double between 3.15 and 22.5
     */
    @WebMethod(operationName = "getInterestRate")
    public double getInterestRate(@WebParam(name = "creditScore") int creditScore) {
        double interestRate = 0;
        if (creditScore > 760 && creditScore <= 850) {
            interestRate = 3.15;
        } else if (creditScore <= 760 && creditScore > 640) {
            interestRate = 4.1;
        } else if (creditScore <= 640 && creditScore > 620) {
            interestRate = 4.74;
        } else if (creditScore <= 620 && creditScore > 500) {
            interestRate = 5.9;
        } else if (creditScore <= 500 && creditScore > 350) {
            interestRate = 7.5;
        } else if (creditScore <= 350 && creditScore > 200) {
            interestRate = 10.1;
        } else if (creditScore <= 200 && creditScore > 50) {
            interestRate = 15.3;
        } else if (creditScore <= 50 && creditScore >= 0 ) {
            interestRate = 22.5;
        }
        return interestRate;
    }
}
