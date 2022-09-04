import java.nio.charset.CoderResult;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "0000","FZK");
        Teacher t3 = new Teacher("Külyutmaz","1111","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji","103","BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Şaban","123","4",tarih,fizik,bio);
        s1.addBulkExamNote(100,78,50);
        s1.addSozluNote(70,70,70);
        s1.isPass();

        Student s2 = new Student("Melahat","444","4",tarih,fizik,bio);
        s2.addBulkExamNote(50,30,70);
        s2.addSozluNote(30,50,60);
        s2.isPass();

    }
}