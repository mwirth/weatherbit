package org.wimi.weatherbit.api.intent;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.interceptor.InterceptorProvider;

public class AuthContextProvider implements Feature {

	@Override
	public void initialize(Server server, Bus bus) {
	}

	@Override
	public void initialize(InterceptorProvider interceptorProvider, Bus bus) {
		MyInInterceptor interceptor = new MyInInterceptor();
		interceptorProvider.getOutInterceptors().add(interceptor);
	}

	@Override
	public void initialize(Bus bus) {

	}

	@Override
	public void initialize(Client client, Bus bus) {
	}

}
