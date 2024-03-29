import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingInteger {
    public int solution(int[] A) {
        Map<Integer, Boolean> occurrences = new HashMap<>();

        for (int integer : A) {
            occurrences.put(integer, true);
        }

        for (int i = 1; i <= A.length; i++) {
            if(!occurrences.getOrDefault(i, false)) return i;
        }

        return A.length + 1;
    }


    @Test
    public void test(){
        MissingInteger solution = new MissingInteger();
        assertEquals(2, solution.solution(new int[]{8, 1, 1, 1, 10, 10, 8}));
    }
}
