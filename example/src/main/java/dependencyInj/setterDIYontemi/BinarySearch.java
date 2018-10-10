package dependencyInj.setterDIYontemi;

import java.util.Collections;
import java.util.List;

/**
 * Created by Universal on 2/24/2018.
 */

public class BinarySearch implements ISearch
{
    @Override
    public boolean find(List<Integer> list, int id)
    {
        System.out.println("Binary Search");

        Collections.sort( list );
        return Collections.binarySearch(list, id)>=0;
    }
}
