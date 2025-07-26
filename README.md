Developed a simple rule-based AI chatbot in Java using Scanner and conditional logic. The bot interacts via console, responds to basic user inputs (e.g., greetings, queries), and handles conversation flow until terminated.This Java program is a simple rule-based AI chatbot that interacts with users through the console. It uses:
Scanner class to read user input.
while loop to keep the conversation going until the user types "bye".
if-else conditions to respond to basic greetings and questions like:
“hello”
“how are you”
“your name”
If the input is not recognized, it replies with a default message.
The bot exits the chat when the user types "bye".
This is a beginner-level chatbot that can be expanded with more responses or connected to real AI models.
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
