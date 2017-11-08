package zndo.samples.boot.dubbo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import zndo.samples.boot.dubbo.service.BizService;

@SpringBootApplication
public class Application {
	
	private static final Logger logger = Logger.getLogger(Application.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		logger.info("通过业务逻辑层来调用 dubbo 服务");
		BizService bizService = ctx.getBean(BizService.class);
		bizService.doBiz();
		logger.info("---------> 完成");
	}
}
