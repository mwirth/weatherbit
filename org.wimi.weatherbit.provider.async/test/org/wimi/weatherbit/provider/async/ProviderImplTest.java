package org.wimi.weatherbit.provider.async;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import org.wimi.weatherbit.provider.async.IpGeolocationAsyncImpl;

/*
 * Example JUNit test case
 *
 */

public class ProviderImplTest {

	/*
	 * Example test method
	 */

	@Test
	public void simple() {
		IpGeolocationAsyncImpl impl = new IpGeolocationAsyncImpl();
		assertNotNull(impl);
	}

}
