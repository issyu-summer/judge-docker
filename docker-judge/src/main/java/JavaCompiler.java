import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class JavaCompiler {

    private static final String compilerCmd = "javac ";
    private static final String executeCmd = "java ";
    private static final String className = "Main";

    /**
     * 编译
     */
    public static Object compile() {
        try {
            //编译
            Process exec = Runtime.getRuntime().exec("javac Main.java", null, new File("D:\\document\\2021\\毕业设计\\docker-judge\\docker-judge\\src\\main\\java"));
            System.out.println(exec.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public static Object execute(File inputCase) throws IOException {
        //try {
        //    FileInputStream fileInputStream = new FileInputStream(inputCase);
        //    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        //    System.out.println(bufferedInputStream);
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //}
        File file=new File("D:\\document\\2021\\毕业设计\\docker-judge\\docker-judge\\src\\main\\java\\out.txt");

        //运行
        ProcessBuilder processBuilder = new ProcessBuilder("java","Main");
        processBuilder.directory(new File("D:\\document\\2021\\毕业设计\\docker-judge\\docker-judge\\src\\main\\java"));
        processBuilder.redirectInput(inputCase);
        processBuilder.redirectOutput(file);
//        processBuilder.redirectError(file);
        Process process = processBuilder.start();


        try{
            Thread.currentThread().wait(50000);
        }catch (Exception e){

        }

//        try {
//            System.out.println(process.waitFor());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        OutputStream outputStream = process.getOutputStream();
        System.out.println(outputStream.toString());
        return null;
    }
}
