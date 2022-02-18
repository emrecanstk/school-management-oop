package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher aybuke = new Teacher(1,"Şenay Aybüke Yalçın",1300);
        Teacher necmettin = new Teacher(2,"Necmettin Yılmaz",1100);
        Teacher nese = new Teacher(3,"Neşe Alten",1200);
        Teacher huseyin = new Teacher(4,"Hüseyin Aydemir",1150);
        Teacher mustafa = new Teacher(5,"Mustafa Çağlar",1400);
        Teacher dilay = new Teacher(6,"Dilay Kermen",1300);

        Student emrecan = new Student(1,"Emre Can Satık",1);
        Student gulnur = new Student(2,"Gülnur Vırdınlı",1);
        Student eray = new Student(3,"Eray Uraz Köseoğlu",3);
        Student cihan = new Student(4,"Cihan Loyan",4);
        Student serdar = new Student(5,"Serdar Emin Salar",1);
        Student murat = new Student(6,"Murat Pangal",1);
        Student ridvan = new Student(7,"Rıdvan Yavuz",2);
        Student emirhan = new Student(8,"Emirhan Özbatmaz",2);
        Student aliosman = new Student(9,"Ali Osman Paslı",1);
        Student nazli = new Student(10,"Nazlı Şen",2);
        Student omer = new Student(11,"Ömer Över",1);
        Student irem = new Student(12,"Nimet İrem Uykucuoğlu",1);
        Student gulendam = new Student(13,"Gülendam Pirinççi",1);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(aybuke);teacherList.add(necmettin);teacherList.add(nese);
        teacherList.add(huseyin);teacherList.add(mustafa);teacherList.add(dilay);

        List<Student> studentList = new ArrayList<>();
        studentList.add(emrecan);studentList.add(gulnur);studentList.add(eray);
        studentList.add(cihan);studentList.add(serdar);studentList.add(gulendam);
        studentList.add(ridvan);studentList.add(emirhan);studentList.add(aliosman);
        studentList.add(nazli);studentList.add(omer);studentList.add(irem);studentList.add(murat);

        School saglik = new School(teacherList,studentList);

        emrecan.payFees(500);
        emrecan.payFees(300);
        aliosman.payFees(700);
        irem.payFees(1000);
        serdar.payFees(3400);
        omer.payFees(150);

        System.out.println("> School of Sağlık has earned "+saglik.getTotalMoneyEarned()+" TL.");
        necmettin.receiveSalary(necmettin.getSalary());
        System.out.println("> School of Sağlık has spent for salary to " + necmettin.getName()
        +" and now School has " + saglik.getTotalMoneyEarned() +" TL.");

    }

}
