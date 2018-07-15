package org.learning.springboot.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.learning.springboot.api.SignUpApi;
import org.learning.springboot.api.UserApi;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {

		register(UserApi.class);
		register(SignUpApi.class);

		// registering exception mappers
//		register(ValidationExceptionMapper.class);
//		register(ThrowableMapper.class);
//		register(ApiServiceExceptionMapper.class);
	}

}
