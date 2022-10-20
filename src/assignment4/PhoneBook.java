package assignment4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    private ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    public ArrayList<PhoneNumber> getPhoneList() {
        return phoneList;
    }


    @Override
    void insertPhone(String name, String phone) {
        for(PhoneNumber p: getPhoneList()) {
            //Kiểm tra tên
            if (p.getName().equals(name)) {
                //Nếu tên trùng tên sẵn có thì kiểm tra số điện thoại
                for(String n: p.getTel()) {
                    if (n.equals(phone)) {
                        return;
                    }
                }
                p.tel.add(phone);
                return;
            }
        }
        this.phoneList.add(new PhoneNumber(name, phone));

    }

    @Override
    void removePhone(String name) {
//        for(int i = 0; i < phoneList.size(); i++) {
//            if (phoneList.get(i).name.equals(name)) {
//                phoneList.remove(i);
//                break;
//            }
//        }
        for(PhoneNumber p: getPhoneList()) {
            if(p.getName().equals(name)) {
                getPhoneList().remove(p);
                return;
            }
        }
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber p: getPhoneList()) {
            //Tìm đến tên
            if(p.getName().equals(name)) {
                //Sau khi đến tên thì tìm đến số điện thoại
//                for(int i = 0; i < p.tel.size(); i++) {
//                    if(p.tel.get(i).equals(oldPhone)) {
//                        p.tel.set(i, newPhone);
//                        break;
//                    }
//                }
//                break;
                p.getTel().remove(oldPhone);
                p.getTel().add(newPhone);
                return;
            }
        }
    }

    @Override
    PhoneNumber searchPhone(String name) {
//        for(PhoneNumber p: phoneList) {
//            //Tìm tên
//            if (p.name.equals(name)) {
//                //In các số điện thoại tìm được
//                System.out.println(p.tel);
//                break;
//            }
//        }
        for(PhoneNumber p: getPhoneList()) {
            if(p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    @Override
    void sort() {
//        Collections.sort(getPhoneList(), new Comparator<PhoneNumber>() {
//            @Override
//            public int compare(PhoneNumber o1, PhoneNumber o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        for(int i = 0; i < getPhoneList().size() - 1; i++) {
//            for(int j = 0; j < getPhoneList().size() - 1 - i; j++) {
//                if(getPhoneList().get(j).getName().compareTo(getPhoneList().get(j+1).getName()) > 0) {
//                    PhoneNumber temp = getPhoneList().get(j);
//                    getPhoneList().set(j,getPhoneList().get(j+1));
//                    getPhoneList().set(j+1, temp);
//                }
//            }
//        }


        //Học về Anonymous class
        //Lambda expression
        Comparator<PhoneNumber> cp = (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(getPhoneList(), cp);
    }
}
