package Assignment8;

public class CpyList {
    class ListUtil {
        public static void copyList(List<? super Number> dest, List<? extends Number> src) {
            for (Number n : src) dest.add(n);
        }
    }

}
