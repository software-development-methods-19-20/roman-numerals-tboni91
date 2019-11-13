package dssc.roman;

public class RomanNumeral {
    private Integer decimal;
    private String[] UNIT = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    private String[] DOZEN = {"","X","XX","XXX","XL","L","LI","LII","LIII","XC"};
    private String[] HUNDREDS = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        return HUNDREDS[decimal/100]+
        DOZEN[(decimal%100)/10]+
        UNIT[decimal%10];
        /*
        String number = decimal.toString();
        if (decimal >= 10) {
            if (decimal >= 100) {
                char[] num = {number.charAt(0), number.charAt(1), number.charAt(2)};
                return HUNDREDS[Integer.valueOf(number.charAt(0))].concat(DOZEN[Integer.valueOf(number.charAt(1))].concat(UNIT[Integer.valueOf(number.charAt(2))]));
            } else {
                return DOZEN[Integer.valueOf(number.charAt(0))].concat(UNIT[Integer.valueOf(number.charAt(1))]);
            }
        } else {
            return UNIT[Integer.valueOf(number.charAt(0))];
        }

         */
    }

}
