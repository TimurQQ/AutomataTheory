import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StatMaster {
    private final HashMap<String, Long> statistic = new HashMap<>();
    private final List<String> numbers = new ArrayList<String>();

    HashMap<String, Long> getStatistic() {
        statistic.clear();
        for (String key : numbers) {
            if (statistic.containsKey(key)) {
                Long val = statistic.get(key);
                statistic.put(key, val + 1);
            } else {
                statistic.put(key, 1L);
            }
        }
        return statistic;
    }

    void addToStatistic(List<String> newNumbers) {
        numbers.addAll(newNumbers);
    }
}
