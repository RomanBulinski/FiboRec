import java.util.Arrays;
import java.util.List;

public class Main {


    public List<Integer> fibStream ( int numbers ){

        List<Integer> fibStreamResult = Arrays.asList(0,1);
        int counter = 0;

        int i = fibStreamResult.get(fibStreamResult.size()-1);
        int j = fibStreamResult.get(fibStreamResult.size()-2);

        while(counter < numbers - 2){
            fibStreamResult.add( i+j );
            counter++;
        }
        return fibStreamResult;
    }


}
