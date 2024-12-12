import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100,200,300,400);
        //Collections.sort(list);
        Collections.sort(list,(Integer a, Integer b) -> {return a - b;});



        System.out.println(list);



    }
}
