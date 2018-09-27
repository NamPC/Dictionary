public class Main {

    public static void main(String args[])  {
        LibraryManagement.loadProgram();
        LibraryManagement libraryManagement = new LibraryManagement();
        libraryManagement.showAllWords();
        //libraryManagement.tools();
        // Cac ham co the goi la showAllWord tools vs loadProgram(mac dinh luon goi tu dau)
    }
}
//