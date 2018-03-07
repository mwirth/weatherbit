package org.wimi.weatherbit.api.intent;

import java.util.Arrays;
import java.util.List;

import org.apache.cxf.dosgi.common.api.IntentsProvider;
import org.osgi.service.component.annotations.Component;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Component //
(//
		property = "org.apache.cxf.dosgi.IntentName=jackson" //
)
public class JacksonIntent implements IntentsProvider {

	@Override
	public List<?> getIntents() {
		return Arrays.asList(new JacksonJsonProvider(), new AuthContextProvider());
	}

}