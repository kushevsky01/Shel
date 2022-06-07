import java.util.Arrays;
import java.util.Scanner;

public class Shel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Command[] commands = {new DateCommand(), new TimeCommand(), new DirCommand(), new HelpCOmmand(), new ExitCommand()};
        while(true) {
            System.out.print("(user)>>");
            String cmd = in.nextLine();

            boolean correct = false;
            for (Command command : commands) {
                correct = false;
                if (command.getName().contentEquals(cmd)) {
                    command.exec();
                    correct = true;
                    break;
                }

            }
            if (!correct) {
                System.out.println(cmd+ "-  не является внутренней или внешней командой");
                ;
            }

        }
    }
}
