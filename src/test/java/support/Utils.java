package support;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    static Faker faker = new Faker();

    public static void esperarElementoVisivel(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(),tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String getName() {
        String name = faker.name().fullName();
        return name;
    }

    public static String getEmail() {
        String email_init = "teste_";
        String email_final = "@otlokk.com";

        Random random = new Random();
        int minimo = 0;
        int maximo = 9999999;
            int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }

    public static String getPassword() {
        String password = "senha";

        Random random = new Random();
        int minimo = 0;
        int maximo = 9999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return password + resultado;
    }
}
