package zndo.samples.boot.dubbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@RunWith(SpringRunner.class)
@SpringBootTest
@DubboComponentScan(basePackages = "zndo.samples.boot.dubbo.service")
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
