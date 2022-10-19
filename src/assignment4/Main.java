package assignment4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        pb.insertPhone("John Smith","111111111");
        pb.insertPhone("John Smith","111112222");
        pb.insertPhone("John Smith","111113333");
        pb.insertPhone("Rick Hammer","222222222");
        pb.insertPhone("Emma Jane","33333333");
        pb.insertPhone("Hardy Watson","444444444");
        pb.insertPhone("Sherlock Home","55555555");
        pb.insertPhone("Sherlock Home","55556666");
        pb.insertPhone("Sherlock Home","55557777");

        pb.removePhone("Hardy Watson");

        pb.updatePhone("John Smith","111112222", "0000000000");

        pb.sort();

        ArrayList<PhoneNumber> phoneList = pb.getPhoneList();
        for(PhoneNumber p: phoneList) {
            System.out.println(p.name + "--" + p.tel);
        }

        System.out.println("\nKet qua tim \"John Smith\"");
        pb.searchPhone("John Smith");


    }
}
