import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();

        for(int i = 0; i< 10; i++){
            String a = br.readLine();
            list.add(a);
        }

        System.out.println(list.get(2));
        System.out.println(list.get(6));
        System.out.println(list.get(8));
    }
}
