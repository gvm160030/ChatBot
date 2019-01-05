import java.io.File;

public class Chatbot {
    private static final boolean TRACE_MODE = false;
    static String botName = "chatty";

    public static void main(String[] args) {
        try{
            String resourcePath = getResourcePath();


        }catch(Exception e){

        }
    }

    private static String getResourcePath() {
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path.substring(0, path.length() - 2);
        System.out.println(path);
        String resourcePath = path + File.separator + "src" + File.separator + "main" +File.separator + "resources";
        return resourcePath;
    }
}
