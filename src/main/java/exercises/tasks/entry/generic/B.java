package exercises.tasks.entry.generic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hofa on 20.03.2018.
 */
public class B {
    public Map<Integer, Integer> map = new HashMap<>();

    public int get(int key){
        return map.get(key);
    }

    public void set(int key, Object value){
//        map.put(key, value);
    }
}