package designPrinciples.dependencyInversionPrinciple.withoutDIPExample;

public class EmailService {

    public void send(String message){
        System.out.println("Email sent : "+message);
    }
}
