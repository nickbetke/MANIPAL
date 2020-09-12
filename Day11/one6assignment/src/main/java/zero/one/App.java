package zero.one;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\java\\spring3.xml");
		Organization org = (Organization) context.getBean("Organization");
		
		System.out.println(org);
		org.showDetails();
	}

}
