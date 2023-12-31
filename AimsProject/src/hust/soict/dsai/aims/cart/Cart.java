package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public void addMedia(Media d) {
        itemsOrdered.add(d);
        System.out.println("The media has been added!");
    }
    public void addMedia(Media [] dList) {
        for (Media disc: dList) {
            addMedia(disc);
        }
    }
    public void addMedia(Media d1,Media d2) {
        addMedia(d1);
        addMedia(d2);
    }

    public void removeMedia (Media d) {
        try {
            itemsOrdered.remove(d);
            System.out.println("The media is removed!");
        }
        catch (Exception e) {
            System.out.println("Media has not been added yet!");
            return ;
        }
    }
    public float totalCost() {
        float total = 0;
        for(int i= 0; i< itemsOrdered.size(); i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

    // Method overloading
    // Print()
    public void print() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < this.itemsOrdered.size(); i++ ) {
            System.out.println(i+1 + ". " + itemsOrdered.get(i));
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("**************************************************");
    }
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    // Search
    public void searchId(int id) {
        for(Media item: itemsOrdered) {
            if(item.getId() == id) {
                System.out.println(item);
                return ;
            }
        }
        System.out.println("No media is matched!");
    }
    public void searchTitle(String title) {
        for(Media item: itemsOrdered) {
            if(item.getTitle().equals(title)) {
                System.out.println(item);
                return ;
            }
        }
        System.out.println("No media is matched!");
    }
}