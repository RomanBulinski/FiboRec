import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static  List<Integer> fibStream ( int numbers ){

//        List<Integer> fibStreamResult = Arrays.asList(0,1);
        List<Integer> fibStreamResult = new ArrayList<>();
        fibStreamResult.add(0);
        fibStreamResult.add(1);

        int counter = 0;
        while(counter <= numbers - 2){

            int i = fibStreamResult.get(fibStreamResult.size()-1);
            int j = fibStreamResult.get(fibStreamResult.size()-2);
            fibStreamResult.add( i+j );
            counter++;
        }
        return fibStreamResult;
    }


    public static int fibREC ( int numbers ){
            if(numbers<3)
                return 1;
            return fibREC(numbers-2)+fibREC(numbers-1);
    }


    public static void main(String[] args) {
        System.out.println(  fibStream(6)  );
        System.out.println(fibREC(6) );
    }


}
