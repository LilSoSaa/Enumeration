public class Main {
    public static void main(String[] args) {

        enum Month {
            Juanuary,
            February,
            March,
            April,
            May,
            June,
            July,
            August,
            September,
            October,
            November,
            December;
        }

        for (Month month : Month.values()) {
            String name= month.name();
            if (name.endsWith("Y")){
                System.out.println( name + " End with y");
            }else {
                System.out.println(name + " doesn't end with y");
            }

        }
    }
}