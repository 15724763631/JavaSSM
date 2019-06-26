import cn.edu.zut.ssm.service.DomeService;
import cn.edu.zut.ssm.web.controller.DomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = {"classpath:/spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DomeTest {
    private static final Logger logger = LoggerFactory.getLogger(DomeTest.class);

    @Autowired
    private DomeService domeService;

    @Test
    public void basicsTest() {
        List list = domeService.index();
        logger.info("list:{}", list);
        System.out.println(list);
    }
}
