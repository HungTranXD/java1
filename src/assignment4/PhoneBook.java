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

    public void setPhoneList(ArrayList<PhoneNumber> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    void insertPhone(String name, String phone) {
        boolean nameFlag = false;
        for(PhoneNumber p: phoneList) {
            //Kiểm tra tên
            if (p.name.equals(name)) {
                //Nếu tên trùng tên sẵn có thì kiểm tra số điện thoại
                boolean telFlag = false;
                for(String n: p.tel) {
                    if (n.equals(phone)) {
                        telFlag = true;
                        break;
                    }
                }
                if(!telFlag) p.tel.add(phone);
                nameFlag = true;
                break;
            }
        }
        if(!nameFlag) this.phoneList.add(new PhoneNumber(name, phone));

    }

    @Override
    void removePhone(String name) {
        for(int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).name.equals(name)) {
                phoneList.remove(i);
                break;
            }
        }
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber p: phoneList) {
            //Tìm đến tên
            if(p.name.equals(name)) {
                //Sau khi đến tên thì tìm đến số điện thoại
                for(int i = 0; i < p.tel.size(); i++) {
                    if(p.tel.get(i).equals(oldPhone)) {
                        p.tel.set(i, newPhone);
                        break;
                    }
                }
                break;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for(PhoneNumber p: phoneList) {
            //Tìm tên
            if (p.name.equals(name)) {
                //In các số điện thoại tìm được
                System.out.println(p.tel);
                break;
            }
        }
    }

    @Override
    void sort() {
        Collections.sort(phoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }
}
