import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Universal on 2/14/2018.
 */
public class test {

    public static void main(String[] args) {
        Long max = 1300000L;
        int min = 1;

        System.out.println (new Date ().toString ());
        List<Integer> sourceList = new ArrayList<> ();
        List<Integer> sList = new ArrayList<> ();
        for (int i = min; i < max; i++) {
            sourceList.add (i);
        }

//        sourceList.stream ().forEach (integer ->{
//            sList.add (integer);
//
//        });

        System.out.println ("sonuç");
        System.out.println (new Date ().toString ());
    }

}
