public class DirCommand implements Command{
    @Override
    public String getName() {
        return "dir";
    }

    @Override
    public void exec() {
        System.out.println("Working directory: "+ System.getProperty("user.dir"));
    }
}
