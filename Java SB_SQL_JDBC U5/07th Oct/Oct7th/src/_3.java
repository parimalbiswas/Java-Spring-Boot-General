import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _3 {
    public static void main(String[] args) {
        List<String> color = Arrays.asList("BLU","WWH","BLU","PAR","ORG","BLU");


        int num = Collections.frequency(color,"BLU");
        System.out.println(num);



    }
}
