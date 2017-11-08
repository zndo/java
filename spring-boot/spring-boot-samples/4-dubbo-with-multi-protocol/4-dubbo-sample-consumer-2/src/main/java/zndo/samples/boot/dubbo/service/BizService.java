package zndo.samples.boot.dubbo.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import zndo.samples.boot.dubbo.Application;

@Component
public class BizService {
	
	private static final Logger logger = Logger.getLogger(Application.class);

	@Reference(version="1.0")// protoccol=dubbo
	public DubboService dubboService;
	
	@Reference(version="1.0")// protoccol=dubbo&hessian
	public DubboHessianService dubboHessianService;
	
	public void doBiz() {
		logger.info("---------> " + dubboService.dubboService1());
		logger.info("---------> " + dubboService.dubboService2("zndo"));
		logger.info("---------> " + dubboHessianService.dubboService1());
		logger.info("---------> " + dubboHessianService.dubboService2("zndo"));
	}

}
