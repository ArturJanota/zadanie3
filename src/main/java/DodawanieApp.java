import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DodawanieApp {

    public static void main(String[] args) {
        SpringApplication.run(DodawanieApp.class ,args);

    }

    public int added(int a ,int b){
        return a*b;
    }
}
