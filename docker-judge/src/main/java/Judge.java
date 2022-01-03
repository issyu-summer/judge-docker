import java.io.File;
import java.io.IOException;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Judge {
    public static void main(String[] args) throws IOException {
        JavaCompiler.compile();
        JavaCompiler.execute(new File("D:\\document\\2021\\毕业设计\\docker-judge\\docker-judge\\src\\main\\java\\test0.txt"));
    }
}
