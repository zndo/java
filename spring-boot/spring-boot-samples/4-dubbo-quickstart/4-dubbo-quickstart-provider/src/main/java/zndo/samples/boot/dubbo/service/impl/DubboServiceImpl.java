package zndo.samples.boot.dubbo.service.impl;

import zndo.samples.boot.dubbo.service.DubboService;

public class DubboServiceImpl implements DubboService {

	@Override
	public String dubboService1() {
		return "dubbo service 1";
	}

	@Override
	public String dubboService2(String name) {
		return "dubbo service 2 - " + name;
	}
}
