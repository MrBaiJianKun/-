package sample.list;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {
    public static void main(String[] args) {
        List<Book>bookList=new ArrayList<>();
        bookList.add(new Book(01,"    三国","    24"));
        bookList.add(new Book(02,"    水浒","    24"));
        bookList.add(new Book(03,"    西游","    24"));
        for (int i=0,len=bookList.size();i<len;i++){
            System.out.println(bookList.get(i).getID()+"  "+bookList.get(i).getName()+"  "+bookList.get(i).getPrice());
        }
        Book book=new Book();
        System.out.println("add方法");
        bookList.add(new Book(04,"    征服王游记","    24"));
        System.out.println(bookList);
        System.out.println("remove方法");
        bookList.remove(new Book(05,"神曲","15"));
        System.out.println(bookList);
        System.out.println("Set方法");
        bookList.set(3,new Book(04,"所罗门","45"));
        System.out.println(bookList);
        System.out.println(bookList.get(01));
        bookList.add(02,new Book(02,"    水浒","    24"));
        System.out.println(bookList);
        System.out.println(bookList.indexOf(new Book(01,"   三国","24")));
        System.out.println(bookList.lastIndexOf(new Book(02,"    水浒","    24")));
    }
}
