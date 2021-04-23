package hu.HT.harmadikbeadando;
import org.springframework.web.bind.annotation.RequestBody;


public class Post {


    String sText = "Alma a fa alatt";
    String sReverse = new StringBuilder(sText).reverse().toString();

    public String post(@RequestBody String sText) {

        return sText;


}}
