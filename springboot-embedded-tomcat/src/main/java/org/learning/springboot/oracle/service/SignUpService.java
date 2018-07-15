package org.learning.springboot.service;

import org.learning.springboot.oracle.domain.SignUpDetails;

public interface SignUpService {

    void saveSignUpDetails(SignUpDetails signUpDetails);


    SignUpDetails getUserDetailsByMobile(String mobile);
}
