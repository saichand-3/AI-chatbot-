import java.util.Scanner;

public class SimpleChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("AI Chatbot: Hello! Ask me anything or type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            input = scanner.nextLine().toLowerCase();

            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("AI Chatbot: Hello there!");
            } else if (input.contains("how are you")) {
                System.out.println("AI Chatbot: I'm just a program, but I'm doing great!");
            } else if (input.contains("your name")) {
                System.out.println("AI Chatbot: I'm a simple Java chatbot.");
            } else if (input.contains("bye")) {
                System.out.println("AI Chatbot: Goodbye! Have a nice day.");
                break;
            } else {
                System.out.println("AI Chatbot: Sorry, I don't understand that.");
            }
        }

        scanner.close();
    }
}
