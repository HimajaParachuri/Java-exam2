/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person("Paul", "3289 Kildeer Drive, Georgia", "757-268-1108", "qlowu91lep@temporary-mail.net");
        System.out.println(p.toString());

        Student s = new Student(5, "Molly K Taylor", "3961 Willow Oaks Lane,Louisiana", "337-334-9522", "l1meq6ci9xj@temporary-mail.net");
        System.out.println(s.toString());

        Employee e = new Employee("NWMSU", 1500.00, "12/01/2017", "Georgia G Daigre", "1163 Sand Fork Road,Indiana", "574-896-7525", "tudtsl966ge@temporary-mail.net");
        System.out.println(e.toString());

        Faculty f = new Faculty(8, 2, "NWMSU", 1000.00, "01/10/2016", "David J Howe", "2877 Cliffside Drive, NY", "607-467-5746", "se8tsiprc7@temporary-mail.net");
        System.out.println(f.toString());

        Staff st = new Staff("Professor", "NWMSU", 2000.00, "01/15/2011", "John D Bush", " 1916 Pretty View Lane, California", "707-788-5302", "pd2nyol5b4@temporary-mail.net");
        System.out.println(st.toString());

    }
}
