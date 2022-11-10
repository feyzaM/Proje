package karisikSorular;

public class F02_Karakter {
    public static void main(String[] args) {

        /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        String name1="tuna";
        String name2="feyza";

        int name1KrkSayisi=name1.length();

        if (name1KrkSayisi%2==0){


            System.out.println(name1.substring(0,(name1.length()/2)).concat(name2).
                    concat(name1.substring(name1.length()/2)));
        }else{
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }
    }
}
