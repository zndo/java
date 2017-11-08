package zndo.samples.boot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import zndo.samples.boot.dubbo.service.DubboService;

@Service(version = "1.0", protocol="dubbo")
public class DubboServiceImpl implements DubboService {

	@Override
	public String dubboService1() {
		return "dubbo service 1, only use dubbo protocol";
	}

	@Override
	public String dubboService2(String name) {
		return "dubbo service 2, only use dubbo protocol - " + name;
	}
}
