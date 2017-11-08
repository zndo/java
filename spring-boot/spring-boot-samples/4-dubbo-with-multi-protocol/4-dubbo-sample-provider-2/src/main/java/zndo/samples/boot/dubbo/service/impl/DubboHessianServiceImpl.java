package zndo.samples.boot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import zndo.samples.boot.dubbo.service.DubboHessianService;

@Service(version = "1.0", protocol= {"dubbo","hessian"})
public class DubboHessianServiceImpl implements DubboHessianService {

	@Override
	public String dubboService1() {
		return "dubbo service 1, use dubbo and hessian protocol";
	}

	@Override
	public String dubboService2(String name) {
		return "dubbo service 2, use dubbo and hessian protocol - " + name;
	}
}
