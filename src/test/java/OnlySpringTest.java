import com.storm.pojo.User;
import com.storm.serviceImpl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * @author cj34920
 *         Date: 2017/12/26
 */
public class OnlySpringTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:spring-mybatis.xml", "classpath:mybatis-config.xml");
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userService");
        List<User> users = userService.getUserInfo();
    }
}
