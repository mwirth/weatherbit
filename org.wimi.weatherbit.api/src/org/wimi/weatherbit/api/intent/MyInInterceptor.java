package org.wimi.weatherbit.api.intent;

import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class MyInInterceptor extends AbstractPhaseInterceptor<Message> {

	public MyInInterceptor() {
		super(Phase.PRE_STREAM);
	}

	@Override
	public void handleMessage(Message message) {
		System.out.println(message);
		// authentication header can be set here!
	}

	@Override
	public void handleFault(Message messageParam) {
	}

}