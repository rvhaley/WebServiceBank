package com.trylag.webservicebank.soap;

import com.thoughtworks.xstream.XStream;
import com.trylag.webservicebank.entity.LoanRequest;
import com.trylag.webservicebank.entity.LoanResponse;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Richard Haley III
 */
@WebService(serviceName = "CalculateLoanResponse")
public class CalculateLoanResponse {

    /**
     * Web service operation.
     *
     * @param loanRequest A String of XML containing SSN, credit score, amount, and duration
     * @return loanResponse A String of XML containing interest rate and SSN
     */
    @WebMethod(operationName = "getLoanResponse")
    public String getLoanResponse(@WebParam(name = "loanRequest") String loanRequest) {
        XStream xstream = new XStream();
        xstream.aliasType("LoanRequest", LoanRequest.class);
        
        // Parse XML from loan request
        LoanRequest loanRequestEntity = (LoanRequest) xstream.fromXML(loanRequest);
        
        // Get interest rate based on credit score
        double interestRate = new CalculateInterestRate().getInterestRate(loanRequestEntity.getCreditScore());
        
        // Serialize response to XML
        xstream.aliasType("LoanResponse", LoanResponse.class);
        return xstream.toXML(new LoanResponse(interestRate, loanRequestEntity.getSsn()));
    }
}
