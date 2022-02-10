public class JvmComprehension { // Отправится Metaspace
    public static void main(String[] args) { // Создаст новый фрейм "main()" в Stack Memory
        int i = 1;                      // 1 Остаётся в классе main.
        Object o = new Object();        // 2 В main создается "o" со ссылкой на Object в куче.
        Integer ii = 2;                 // 3 Относится к Object. В main создастся "ii" со ссылкой на Integer в куче.
        printAll(o, i, ii);             // 4 Создастся новый фрейм в Stack
        System.out.println("finished"); // 7 Создаст фрейм в Stack Memory, в который передастся String.
    }

    private static void printAll(Object o, int i, Integer ii) { // создастся новый фрейм "printAll()" в Stack Memory.
        Integer uselessVar = 700;                   // 5 В "printAll" создаст "uselessVar" со ссылкой Integer в куче. Отправляется в мусор, т.к. нигде не используется.
        System.out.println(o.toString() + i + ii);  // 6 Новый фрейм в Stack Memory куда передаст ссылки на "o", "i" и "ii"
    }
}