package dependencyInj.setterDIYontemi;

import java.util.List;

/**
 * Created by Universal on 2/24/2018.
 */
public class SequentialSearch implements ISearch
{
    @Override
    public boolean find(List<Integer> list, int id)
    {
        for( Integer i : list )
        {
            if( i == id )
                return true;
        }

        System.out.println("Sequential Search");

        return false;
    }

}