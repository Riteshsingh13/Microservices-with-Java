Exposing JVM Metrics in Spring Boot
- Using Micrometer with Prometheus

	Add dependencies:
	<dependency>
		<groupId>io.micrometer</groupId>
		<artifactId>micrometer-registry-prometheus</artifactId>
	</dependency>
	
	Add the following configurations in application.properties (or application.yml) to expose Prometheus metrics:
	# Enable Actuator Endpoints
	management.endpoints.web.exposure.include=health,info,metrics,prometheus

	# Enable Prometheus format
	management.metrics.export.prometheus.enabled=true
	
	Access Prometheus metrics:
	http://localhost:8080/actuator/prometheus
