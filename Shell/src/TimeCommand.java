import java.time.LocalTime;

public class TimeCommand implements Command{
    @Override
    public String getName() {
        return "time";
    }

    @Override
    public void exec() {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
    }
}
