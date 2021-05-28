package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [   Kemal   ] From Number<(222) 333-4444> Message: {Hello, lets code some java}";

        int start = message.indexOf("[");
        int end = message.indexOf("]");

        String sender, mobile, text;

        sender = message.substring(start+1,end);
        sender = sender.trim();
        System.out.println(sender);
        System.out.println("sender = " + sender);

        mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        text = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println("        Kudret        ".trim());

        if (sender.equals("Kemal")) {
            System.out.println("Message from Kemal about homework");
        }else {
            System.out.println("Someone else message");
        }
    }
}
