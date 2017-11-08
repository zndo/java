package zndo.samples.boot.dubbo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import zndo.samples.boot.dubbo.service.DubboService;

@SpringBootApplication
@ImportResource(locations = { "classpath:dubbo-*.xml" })
public class Application {

	private static final Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		DubboService dubboService = (DubboService) ctx.getBean("dubboService");
		logger.info("---------> " + dubboService.dubboService1());
		logger.info("---------> " + dubboService.dubboService2("zndo"));

	}
}
