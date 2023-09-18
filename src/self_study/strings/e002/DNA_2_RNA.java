package self_study.strings.e002;

public class DNA_2_RNA {
    public static void main(String[] args) {
        System.out.println(dnaToRna("ACNTG"));
    }

    public static String dnaToRna(String rna) {
        String result = "";
        if (rna == "") {
            return "";
        } else {
            for (int i = 0; i < rna.length(); i++) {
                switch (rna.charAt(i)) {
                    case 'G':
                        result += 'C';
                        break;
                    case 'C':
                        result += 'G';
                        break;
                    case 'T':
                        result += 'A';
                        break;
                    case 'A':
                        result += 'U';
                        break;
                    default:
                        return null;
                }
            }
        }
        return result;
    }
}
