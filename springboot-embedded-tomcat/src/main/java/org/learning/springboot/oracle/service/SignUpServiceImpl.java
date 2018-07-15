package org.learning.springboot.service;

import lombok.extern.slf4j.Slf4j;
import org.learning.springboot.oracle.domain.SignUpDetails;
import org.learning.springboot.oracle.domain.Customer;
import org.learning.springboot.oracle.repositories.CustomerRepository;
import org.learning.springboot.oracle.repositories.SignUpRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.transaction.Transactional;

@Service
@Slf4j
public class SignUpServiceImpl implements SignUpService{

    @Inject
    private SignUpRepository signUpRepository;

    @Inject
    private CustomerRepository customerRepository;

    @Override
    @Transactional
    public void saveSignUpDetails(SignUpDetails signUpDetails) {

        signUpRepository.save(signUpDetails);

        log.debug(String.format("Signup details saved with Mobile %s", signUpDetails.getMobile()));

        System.out.println(String.format(" >>>>>>>>>>>>>>>>> Signup details saved with Mobile %s", signUpDetails.getMobile()));

        Customer customer = new Customer();
        customer.setId("12345");
        customer.setName("gaurav");
        customer.setEmail("abc@xyz.com");

        customerRepository.save(customer);
    }

    @Override
    public SignUpDetails getUserDetailsByMobile(String mobile) {

        SignUpDetails signUpDetails = signUpRepository.findByMobile(mobile);

        log.debug(String.format("Signup details %s", signUpDetails));

        return signUpDetails;
    }
}
