package com.kota65535.config;

import com.kota65535.converter.UuidFromBin;
import com.kota65535.converter.UuidToBin;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import java.util.Arrays;
import java.util.List;

@Configuration
public class JdbcConfiguration extends AbstractJdbcConfiguration {

	@Override
	protected List<?> userConverters() {
		return Arrays.asList(new UuidToBin(), new UuidFromBin());
	}

}
