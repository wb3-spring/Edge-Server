package wb3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Wb3EdgeserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Wb3EdgeserverApplication.class, args);
	}
}