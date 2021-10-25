import com.xian.spring.dao.Impl.UserDaoImpl;
import com.xian.spring.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("Applicationcontext.xml");
        UserDaoImpl userDaoImpl = (UserDaoImpl) app.getBean("UserDaoImpl");
        userDaoImpl.save();
    }
}
