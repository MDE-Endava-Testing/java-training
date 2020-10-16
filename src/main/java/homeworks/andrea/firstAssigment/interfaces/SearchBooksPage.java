package homeworks.andrea.firstAssigment.interfaces;


public class SearchBooksPage implements ProductSearch {

    /**
     * This class contains the variables and methods that allow to interact with the Book searching page
     * This class helps to simulate the actions done by a user when interacting with the Book searching page
     */


    /**
     * This method allows to search and filter books by author's name
     *
     * @param author corresponds to the author's name that will be used as a filter for searching books
     */
    public void searchByAuthor(String author) {

        System.out.println("searching books of selected author");
    }

    /**
     * This method allows to search and filter books by a defined range of prices
     *
     * @param price_min corresponds to the minimum price filter that will be applied to the books searching
     * @param price_max corresponds to the maximum price filter that will be applied to the books searching
     */
    public void searchByPrice(float price_min, float price_max) {

        System.out.println("searching books with a price between min price and max price");
    }

    /**
     * This method allows to search and filter books by category
     *
     * @param category corresponds to the desired category that will be applied as a filter when searching for books
     */
    public void searchByCategory(String category) {

        System.out.println("searching books of selected category");
    }

    /**
     * This method allows to search and filter books based on the number of pages
     *
     * @param pages_min corresponds to the minimum number of pages filter that will be applied to the books searching
     * @param pages_max corresponds to the maximum number of pages filter that will be applied to the books searching
     */
    public void searchByNumberOfPages(int pages_min, int pages_max) {

        System.out.println("searching books with a price between min price and max price");
    }


}
