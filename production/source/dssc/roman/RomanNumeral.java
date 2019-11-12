package dssc.roman;

public class RomanNumeral {
    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        /*
        switch (decimal) {
            case 0: return "";
            case 1:
            case 2:
            case 3: return "I".repeat(decimal);
        }
        */

        if (decimal == 0) {
            return "";
        } else {
            return "I".repeat(decimal);
        }
    }

}
