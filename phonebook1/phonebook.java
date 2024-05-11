package phonebook1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class phonebook {
    private HashMap<String, TreeSet<String>> name2phone = new HashMap<>();
    private HashMap<String, String> phone2name = new HashMap<>();

    public void add(String telNum, String lastName) {
        TreeSet<String> allNumbers = name2phone.get(lastName);
        if (allNumbers == null) {
            allNumbers = new TreeSet();
            name2phone.put(lastName, allNumbers);
        }
        allNumbers.add(telNum);
        phone2name.put(telNum, lastName);
    }

    public String getByTelNum(String telNum) {
        return phone2name.get(telNum);
    }

    public TreeSet<String> getByLastName(String lastName) {
        return name2phone.get(lastName);
    }

    private int getMaxNumberOfPersonalPhones() {
        int maxNum = 0;
        for (var entry : name2phone.entrySet()) {
            int numOfPhones = entry.getValue().size();
            if (numOfPhones > maxNum) maxNum = numOfPhones;
        }
        return maxNum;
    }

    public void printByDecreasingNumberOfPersonalPhones() {
        int maxNum = getMaxNumberOfPersonalPhones();
        for (int i = maxNum; i > 0; --i) {
            TreeSet<String> lastName = new TreeSet<String>();
            for (var entry : name2phone.entrySet()) {
                int numOfPhones = entry.getValue().size();
                if (numOfPhones == i) lastName.add(entry.getKey());
            }
            Iterator<String> itr = lastName.iterator();
            while (itr.hasNext()) {
                String name = itr.next();
                TreeSet<String> phones = name2phone.get(name);
                Iterator<String> itrPhones = phones.iterator();
                while (itrPhones.hasNext()) {
                    String telNum = itrPhones.next();
                    System.out.println(name + ": " + telNum);
                }
            }
        }
    }
}