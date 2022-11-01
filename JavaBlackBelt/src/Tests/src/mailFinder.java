package Tests.src;

public class mailFinder {
    public static void main(String[] args) {
        String emails = "ya@yahoo.com; on@mail.ru; ona@gmail.com; xersobachiy@ukr.net; ";
        whatsYourMail(emails);
    }

    static void whatsYourMail(String emails){
        for (int j = 0; j < emails.length(); j++) {
            if(emails.charAt(j)==';'){
                System.out.println();
            }

            if(emails.charAt(j)=='@'){
                while (emails.charAt(j+1)!='.'){
                    System.out.print(emails.charAt(j+1));
                    j++;
                }
            }
        }
    }
}

class A{
    public static void main(String[] args) {
        System.out.println("dsvbsvfsbfdbfdbdgbdgbgdbgb");
    }
}
