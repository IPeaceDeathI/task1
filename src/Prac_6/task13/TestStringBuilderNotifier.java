package Prac_6.task13;

public class TestStringBuilderNotifier {
    public static void main(String[] args) {
        StringBuilderNotifier sbn = new StringBuilderNotifier("HARDER BETTER");

        sbn.actionManager.addActionListener(StringBuilderAction.APPEND,
                () -> System.out.println("Вызван метод append()"));
        sbn.actionManager.addActionListener(StringBuilderAction.APPENDCODEPOINT,
                () -> System.out.println("Вызван метод appendCodePoint()"));
        sbn.actionManager.addActionListener(StringBuilderAction.DELETE,
                () -> System.out.println("Вызван метод delete()"));
        sbn.actionManager.addActionListener(StringBuilderAction.DELETECHARAT,
                () -> System.out.println("Вызван метод deleteCharAt()"));
        sbn.actionManager.addActionListener(StringBuilderAction.REPLACE,
                () -> System.out.println("Вызван метод replace()"));
        sbn.actionManager.addActionListener(StringBuilderAction.INSERT,
                () -> System.out.println("Вызван метод insert()"));
        sbn.actionManager.addActionListener(StringBuilderAction.REVERSE,
                () -> System.out.println("Вызван метод reverse()"));

        sbn.append("")  // Вызван метод append()
                .append(" FASTER")  // Вызван метод append()
                .append(" STRONGER")  // Вызван метод append()
                .delete(0, 7)  // Вызван метод delete()
                .reverse()  // Вызван метод reverse()
                .reverse();  // Вызван метод reverse()
        System.out.println(sbn);
    }
}