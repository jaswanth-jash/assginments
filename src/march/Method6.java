package march;

public class Method6 {
    private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        Method6 hs = new Method6();
        System.out.println(hs.formatNumber(5));
        System.out.println(hs.formatNumber(89.9998));
        System.out.println(hs.formatNumber("623"));
    }
}
