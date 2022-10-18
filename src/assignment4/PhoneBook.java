package assignment4;

import java.util.ArrayList;

public class PhoneBook extends Phone{
    private ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone) {
        boolean nameFlag = false;
        for(PhoneNumber p: phoneList) {
            //Kiểm tra tên
            if (p.name.compareTo(name) == 0) {
                //Nếu tên trùng tên sẵn có thì kiểm tra số điện thoại
                boolean telFlag = false;
                for(String n: p.tel) {
                    if (n.compareTo(phone) == 0) {
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
            if (phoneList.get(i).name.compareTo(name) == 0) {
                phoneList.remove(i);
                break;
            }
        }
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber p: phoneList) {
            //Tìm đến tên
            if(p.name.compareTo(name) == 0) {
                //Sau khi đến tên thì tìm đến số điện thoại
                for(String n: p.tel) {
                    if(n.compareTo(oldPhone) == 0) {
                        n = newPhone;
                        break;
                    }
                }
                break;
            }
        }
    }

    @Override
    void searchPhone(String name) {

    }

    @Override
    void sort() {

    }
}
