package builderPattern;
import java.util.*;

public class MainApp {
    public static void main(String[] args){

        List<String> userInfo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        userInfo.add(firstName);

        System.out.print("Enter last name:  ");
        String lastName = sc.nextLine();
        userInfo.add(lastName);

        System.out.print("Enter email: ");
        String email = sc.nextLine();
        userInfo.add(email);

        System.out.print("Enter address? [y/n]: ");
        String ans = sc.nextLine();

        if (ans.equalsIgnoreCase("y")){
            System.out.print("Enter address: ");
            String address = sc.nextLine();
            userInfo.add(address);
            ans ="";
        }

        System.out.print("Enter phone? [y/n]: ");
        ans = sc.nextLine();

        if (ans.equalsIgnoreCase("y")){
            System.out.print("Enter phone: ");
            String phone = sc.nextLine();
            userInfo.add(phone);
            ans ="";
        }

        System.out.print("Enter age? [y/n]: ");
        ans = sc.nextLine();

        if (ans.equalsIgnoreCase("y")){
            System.out.print("Enter age: ");
            String age = sc.nextLine();
            userInfo.add(age);
            ans ="";
        }


        User myUser = new User.UserInfoBuilder()
                .userInfo(userInfo)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .build();

        System.out.println("\nThe information you have entered are the following: ");
        for(String  i : myUser.userInfo) {
            System.out.println(i); }

        System.out.println("\nThank you for registering, " + firstName +" "+ lastName + "! have a wonderful day!");
    }


}