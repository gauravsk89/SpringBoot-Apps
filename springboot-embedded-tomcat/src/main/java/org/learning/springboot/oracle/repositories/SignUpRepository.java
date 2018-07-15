package org.learning.springboot.containters.repositories;

import org.learning.springboot.containters.domain.SignUpDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepository extends JpaRepository<SignUpDetails, Long>{

    SignUpDetails findByMobile(String mobile);

}
