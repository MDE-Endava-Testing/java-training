package homeworks.andrea.firstAssigment.interfaces;

public interface ProductSearch {

    /**
     * This interface offers a default blueprint to users in order to search for a product or for a thing based on some filters.
     * User can filter and search a product based on author's name, price range, product category and number of pages range.
     *
     * @see SearchBooksPage
     * @see SearchEbooksPage
     * @see SearchComicsPage
     */


    /**
     * Searches by author's name
     *
     * @param author corresponds to the author's name that will be used as a filter to search
     */
    void searchByAuthor(String author);

    /**
     * Searches a product by a defined range of prices
     *
     * @param price_min corresponds to the minimum price filter that will be applied on the searching
     * @param price_max corresponds to the maximum price filter that will be applied on the searching
     */
    void searchByPrice(float price_min, float price_max);

    /**
     * Searches a product by product category
     *
     * @param category corresponds to the desired category that will be applied as a filter when searching for a product
     */
    void searchByCategory(String category);

    /**
     * Searches a product based on the number of pages
     *
     * @param pages_min corresponds to the minimum number of pages filter that will be applied to the product searching
     * @param pages_max corresponds to the maximum number of pages filter that will be applied to the product searching
     */
    void searchByNumberOfPages(int pages_min, int pages_max);


}

