package zndo.samples.boot.dubbo.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import zndo.samples.boot.dubbo.Application;

@Component
public class BizService {
	
	private static final Logger logger = Logger.getLogger(Application.class);

	@Reference(version="1.0")
	public DubboService dubboService;
	
	public void doBiz() {
		logger.info("---------> " + dubboService.dubboService1());
		logger.info("---------> " + dubboService.dubboService2("zndo"));
	}

}
