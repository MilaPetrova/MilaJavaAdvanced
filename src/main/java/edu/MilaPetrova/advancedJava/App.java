package edu.MilaPetrova.advancedJava;

/**
 * Hello world!
 *
 */
public class App 
{

    public double creditLine;
    public String message;


    App(String value) {
        if ("low".equals(value)) {
            this.creditLine = 1000.00;
        } else if ("medium".equals(value)) {

            this.creditLine = 2000.00;
        } else  if ("high".equals(value)){
            this.creditLine = 3000.00;
        }
        else{
            this.creditLine = 0.00;
            System.out.println("Data is incorrect");
        }

    }

    public String sendMessage(double amount){
        if (creditLine<2000.01 && creditLine!=0.00 ){
            message = "Y";
        }
        else{
            message ="N";
        }
    return message;
}

    public static void main(String[] args) {
        App app = new App("low");
        String sendNotification = app.sendMessage(app.creditLine);
        System.out.println(sendNotification);
    }
    }


