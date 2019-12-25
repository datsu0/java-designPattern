public class Main{
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("around the world in 80 days"));
        bookShelf.appendBook(new Book("aaaaaaaa"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("daddy-long-long"));
        Iterator it = bookShelf.Iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}