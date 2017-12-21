import java.io.IOException;
import org.jsoup.nodes.Element;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class auctionExtracter {
	public static void main(String[] args) {

        String url = "https://www.shopgoodwill.com/Item/46581388";

        System.out.println("One moment while the information loads");

        String itemName = null, itemValue= null,itemSeller_Info=null,itemDescription=null; //declaring variables

        try {

              Document site = Jsoup.connect(url).get();//get the url

            
//assign values through the page
              
              
              itemValue=site.getElementsByClass("current-price").first().text();
              itemName=site.getElementsByClass("title").first().text();
              itemSeller_Info=site.getElementsByClass("product-data").first().text();
              itemDescription=site.getElementsByClass("product-countdown").first().text();
         
//print information
              System.out.println("Item Name: " + itemName);
              System.out.println("Item valuie: " + itemValue);
              System.out.println("Seller/product info: "+itemSeller_Info);
              System.out.println("A little about the product: "+itemDescription );
              System.out.println("\nThe source of the image is https://sgws3productimages.azureedge.net/sgwproductimages/images/122/12-7-2017/76348507152121aR.JPG");

  } 
        catch (IOException e) {

              System.out.println("Not a valid url");

        } catch (Exception e) {

              System.out.println("Incorrect information");

        }

  }

}



