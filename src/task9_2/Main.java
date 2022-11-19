package task9_2;

import java.util.*;

public class Main {
    public static void main(String[] args){

        ArrayList<Account> accounts1 = new ArrayList<>(10);
        accounts1.add(new Account(101,"A1","AA1",15030.505));
        accounts1.add(new Account(102,"A2","AA1",15000.505));
        accounts1.add(new Account(103,"A3","AA1",1510.505));
        accounts1.add(new Account(104,"A10","AA1",1500.505));
        accounts1.add(new Account(105,"A4","AA1",150.505));
        accounts1.add(new Account(106,"A5","AA1",150.505));
        accounts1.add(new Account(107,"A6","AA1",150.505));
        accounts1.add(new Account(108,"A7","AA1",1500.505));
        accounts1.add(new Account(109,"A8","AA1",1501.505));
        accounts1.add(new Account(110,"A9","AA1",15020.505));

        ArrayList<Account> accounts2 = new ArrayList<>(10);
        accounts2.add(new Account(201,"A1","AA1",15000.505));
        accounts2.add(new Account(202,"A2","AA1",15000.505));
        accounts2.add(new Account(203,"A3","AA1",150));
        accounts2.add(new Account(204,"A10","AA1",1100.505));
        accounts2.add(new Account(205,"A4","AA1",150200.505));
        accounts2.add(new Account(206,"A5","AA1",154530.505));
        accounts2.add(new Account(207,"A6","AA1",1500.505));
        accounts2.add(new Account(208,"A7","AA1",15000.505));
        accounts2.add(new Account(209,"A8","AA1",123000.505));
        accounts2.add(new Account(210,"A9","AA1",13100.505));

        ArrayList<Account> accounts3 = new ArrayList<>(10);
        accounts3.add(new Account(301,"A1","AA1",152000.505));
        accounts3.add(new Account(302,"A2","AA1",1100.505));
        accounts3.add(new Account(303,"A3","AA1",151000.505));
        accounts3.add(new Account(304,"A10","AA1",11200.505));
        accounts3.add(new Account(305,"A4","AA1",150.505));
        accounts3.add(new Account(306,"A5","AA1",150.505));
        accounts3.add(new Account(307,"A6","AA1",150000.505));
        accounts3.add(new Account(308,"A7","AA1",152300.505));
        accounts3.add(new Account(309,"A8","AA1",1500.505));
        accounts3.add(new Account(310,"A9","AA1",153100.505));

        ArrayList<BankApplication> bankApplications = new ArrayList<>(3);
        bankApplications.add(new BankApplication("Kaspi Bank",accounts1));
        bankApplications.add(new BankApplication("Halyk Bank",accounts2));
        bankApplications.add(new BankApplication("Jusan Bank",accounts3));

        Collections.sort(bankApplications, new Comparator<BankApplication>() {
            @Override
            public int compare(BankApplication o1, BankApplication o2) {
                if (o1.getAverageBalance() > o2.getAverageBalance()){
                    return -1;
                }else if (o1.getAverageBalance() < o2.getAverageBalance()){
                    return 1;
                }else return 0;
            }
        });
        System.out.println("--------------------------");
        for (BankApplication b: bankApplications){
            System.out.println(b.getBankData());
            System.out.println("--------------------------");
        }
    }
}
