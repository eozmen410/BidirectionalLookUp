public class BidirectionalTester {
    public static void main(String[] args) {
        BidirectionalMap<Integer, String> studentChart = new BidirectionalMap<>();
        studentChart.insert(622, "Ecenaz");
        studentChart.insert(639, "Yigit");
        studentChart.insert(666, "Ege");
        studentChart.insert(601, "Berk");
        studentChart.insert(781, "Cansu");
        studentChart.insert(590, "Oyku");

        studentChart.print();
        System.out.println("Searching Berk: " + studentChart.lookup(601));
        System.out.println("Searching 666: " + studentChart.rlookup("Ege"));

        PhoneDirectory testDirectory = new PhoneDirectory();
        testDirectory.add("Ecenaz", 58473596);
        testDirectory.add("Oyku", 57482045);
        testDirectory.add("Pelin", 96812394);
        testDirectory.add("Okan", 67429405);

        testDirectory.print();
        System.out.println("Testing Ecenaz"+ "\n"+ "Expected 58473596: "
                + testDirectory.lookup("Ecenaz"));

        System.out.println("Testing 96812394"+ "\n"+ "Expected Pelin: " + testDirectory.lookup(96812394) );
    }
}
