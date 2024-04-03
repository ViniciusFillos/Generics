package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    private List<Object> values = new ArrayList<>();

    public void print() {
        if (values.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("The list of values can't be empty");
        }
        System.out.print("[");
        System.out.print(values.get(0));

        boolean first = true;
        for (Object i : values) {
            if (first) {
                first = false;
            } else {
                System.out.print(", " + i);
            }
        }
        System.out.println("]");
    }

    public void addValue(Object value) {
        values.add(value);
    }

    public Object first() {
        if (values.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("The list of values can't be empty");
        }
        return values.get(0);
    }
}
