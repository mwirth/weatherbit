Example how CXF and dosgi can be used in a client to call a REST service. The Client *only* gets the *path annotated* interface, a proxy is created then.

I was asked to publish a simple example for this. It is just a quick hack and nothing to be proud of, no good design and the dependency list is to big (I just copied it from a existing 'real' project).

**To improve the example every pull request is welcome.** Perhaps I also will improve the demo.

The example uses <https://www.weatherbit.io/api> for demonstration. The source files for the api and the model were generated with swagger from [this](https://raw.githubusercontent.com/APIs-guru/openapi-directory/master/APIs/weatherbit.io/2.0.0/swagger.yaml "") file. I had to change some generated sources, I guess the definition is old and does not fit to the actual rest interface.
This is also the case that I only have implemented two methods (`currentObservationByStationId` and `ipGeolocation`).
Deserialization is done with Jackson (see Intent).


Also a asynchronous call (using the Async-Service) to `ipGeolocation` is available, command `ipGeolocationAsync`.


If the REST service needs to have some authentication this can be done with an *Interceptor*. This *Interceptor* can be registered with an Intent (see package org.wimi.weatherbit.api.intent). This example does not make use of this (because the used api does not need it), instead a simple System.out is in the code.

Just run *current-weather.bndrun* using eclipse and bndtools and use the mentioned gogo-commands.

Alternative you can build the project with

	./gradlew clean build export.current-weather

and run it with

	java -jar org.wimi.weatherbit.consumer.gogo/generated/distributions/executable/current-weather.jar


## Configuration

The endpoint to the remote REST service can be configured in the file `remote-services.xml` (1) which has to be inside the bundle or via a configuration file (2) which can be read from Apache Felix File install


The project includes both solutions. Solution (2) in the **master**-branch, solution (1) in the branch **remote-service_inside_bundle**.
## Examples


**Command**

	ipGeolocation 128.65.210.185 <your_key> null null null

or (if you put your key to the file `org.wimi.weatherbit.consumer.gogo.commands.cfg`)

	ipGeolocation 128.65.210.185 null null null


Result

	Offset               2
	Country              Germany
	Region               Hessen
	Charset              null
	Organization         AS34309 Link11 GmbH
	AreaCode             0
	City                 Frankfurt Am Main
	ContinentCode        EU
	CountryCode          DE
	CountryCode3         DEU
	DmaCode              0
	Ip                   128.65.210.185
	Latitude             50.1172
	Longitude            8.7281
	MetroCode            null
	PostalCode           60314
	RegionCode           Hessen
	Timezone             Europe/Berlin


**Command**

	(ipGeolocation 128.65.210.185 <your_key> null null null) City

**Result**

	Frankfurt Am Main


**more commands**

	currentObservationByStationId E6060 <your_key> M DE null
	ipGeolocationAsync 128.65.210.185 <your_key> null null null

**Have fun and don't forget the pull requests**

