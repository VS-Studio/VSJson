package sco.vsjson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        testBook();
        testPerson();
        testJson2Obj();
    }
    
    public static void testBook()
    {
        Book book = new Book();
        book.isbn = "isbn11034";
        book.price =  12.32;
        
        System.out.println(Json.parse(book, Book.class));
    }
    
    public static void testPerson()
    {
        Person person = new Person();
        person.name = "testname";
        
        person.phone = new ArrayList(Arrays.asList(12334, 3422, 13444));
        HashMap hm = new HashMap();
        hm.put("k1", "v1");
        hm.put("k2", "v2");
        person.contact = hm;
        
        System.out.println(Json.parse(person, Person.class));
    }
    
    public static void testJson2Obj()
    {
        String book = "";
        String person = "";
        
        System.out.println(Json.toObj(book, Book.class));
        System.out.println(Json.toObj(person, Person.class));
    }
    
    
}


class Book{
    public String isbn;
    public double price;

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", price=" + price + '}';
    }
}

class Person{
    public String name;
    public ArrayList phone;
    public HashMap contact;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", phone=" + phone + ", contact=" + contact + '}';
    }
    
}