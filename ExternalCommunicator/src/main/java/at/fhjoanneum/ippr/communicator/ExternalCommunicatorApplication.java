package at.fhjoanneum.ippr.communicator;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class ExternalCommunicatorApplication {

  private final static Logger LOG = LoggerFactory.getLogger(ExternalCommunicatorApplication.class);

  public static void main(final String[] args) throws Exception {
    SpringApplication.run(ExternalCommunicatorApplication.class, args);
  }

  @RestController
  class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("message")
    public List<String> serviceInstancesByApplicationName() {
      return this.discoveryClient.getServices();
    }
  }
}
