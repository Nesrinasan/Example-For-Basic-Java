package dependencyInj.setterDIYontemi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Universal on 2/24/2018.
 */
public class Test {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList (5, 8, 6, 2, 85);

        SearchEngineVersion1 searchEngineVersion1 = new SearchEngineVersion1 ();
        searchEngineVersion1.setSearchAlgorithm (new BinarySearch ());
        searchEngineVersion1.search (list, 5);

    }


}
