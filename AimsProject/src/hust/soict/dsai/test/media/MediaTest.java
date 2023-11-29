package hust.soict.dsai.test.media;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.List;
import java.util.ArrayList;

public class MediaTest {

    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(new CompactDisc("Sơn Tùng MTP", "Ca Nhạc", "Em Của Ngày Homie", 15.00f));
        mediaList.add(new DigitalVideoDisc("Naruto", "Anime", "WibuNo1", 23, 2.50f));
        mediaList.add(new Book("Haha", "Truyện Cười", 1.50f));

        for (Media media : mediaList) {
            System.out.println(media);
        }
    }
}
