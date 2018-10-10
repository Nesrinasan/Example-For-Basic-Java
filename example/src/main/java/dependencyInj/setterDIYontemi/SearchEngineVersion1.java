package dependencyInj.setterDIYontemi;

import java.util.List;

/**
 * Created by Universal on 2/24/2018.
 */
public class SearchEngineVersion1 {

    private ISearch searchAlgorithm;

    public boolean search(List<Integer> list, int id )
    {
        return searchAlgorithm.find(list, id);
    }

    public ISearch getSearchAlgorithm() {
        return searchAlgorithm;
    }

    public void setSearchAlgorithm(ISearch searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }
}
