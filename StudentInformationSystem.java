public class StudentInformationSystem {
    public static void main(String[] args) {
        Teacher tt1 = new Teacher("BORA ALIŞ","531", "TRH");
        Teacher tt2 = new Teacher("PİSAGOR", "532", "MAT");
        Teacher tt3 = new Teacher("BAUSS","533","FZK");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(tt1);
        Course matematik = new Course("Matematik", "202", "MAT");
        matematik.addTeacher(tt2);
        Course fizik = new Course("Fizik", "303", "FZK");
        fizik.addTeacher(tt3);

        Student s1 = new Student("Enner Valencia","1","4",tarih,fizik,matematik);
        s1.addBulkExamNote(30,40,80);
        s1.addBulkVerbalNote(70,55,90);
        s1.isPass();

        Student s2 = new Student("Miguel Crespo","2","2",tarih,fizik,matematik);
        s2.addBulkExamNote(95,80,60);
        s2.addBulkVerbalNote(60,70,90);
        s2.isPass();

        Student s3 = new Student("Ferdi Kadıoğlu","4","3",tarih,fizik,matematik);
        s3.addBulkVerbalNote(50,60,100);
        s3.addBulkExamNote(40,40,60);
        s3.isPass();


    }
}