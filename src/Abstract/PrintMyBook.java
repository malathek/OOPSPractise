public class PrintMyBook extends Book {

        @Override
    void getDetails(String name, String author, String price) {
            System.out.println("The Bookname is " +name + " By "+author+" and available @$" + price);
    }
}
