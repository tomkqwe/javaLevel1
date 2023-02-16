package org.example.hw2.romanToArabic;


public class Roman {
    private Character roman;

    public Character getRoman() {
        return roman;
    }

    public void setRoman(Character roman) {
        this.roman = roman;
    }

    public Roman(Character roman) {
        this.roman = roman;
    }

    public int convertToArabic() {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default: return 0;

        }
    }


}
