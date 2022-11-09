public class Student {
    Course matematik;
    Course tarih;
    Course fizik;
    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String classes, String studentNo, Course matematik, Course tarih, Course fizik){
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.tarih = tarih;
        this.matematik = matematik;
        this.fizik = fizik;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkVerbalNote(int verbalMatematik, int verbalFizik, int verbalTarih){
        if (verbalMatematik >= 0 && verbalMatematik <= 100){
            this.matematik.verbalNote = verbalMatematik;
        }
        if (verbalFizik >= 0 && verbalFizik <= 100){
            this.fizik.verbalNote = verbalFizik;
        }
        if (verbalTarih >= 0 && verbalTarih <= 100){
            this.tarih.verbalNote = verbalTarih;
        }
    }

    public void addBulkExamNote(int matematik, int fizik, int tarih){
        if (matematik >= 0 && matematik <= 100){
            this.matematik.note = matematik;
        }
        if (tarih >= 0 && tarih <= 100){
            this.tarih.note = tarih;
        }
        if (fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
        }
    }

    public void isPass(){
        if ((this.matematik.note == 0 || this.matematik.verbalNote == 0) || (this.fizik.note == 0 || this.fizik.verbalNote == 0) || (this.tarih.note == 0 || this.tarih.verbalNote == 0)){
            System.out.println("Yetersiz Not Girişi !");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalamanız " + this.average);
            if (this.isPass){
                System.out.println("Sınıfı Geçtiniz Tebrikler");
            } else {
                System.out.println("Sınıfı Geçemediniz!");
            }
        }
    }

    public void calcAverage(){
        double fizikAverage = this.fizik.note*0.80 + this.fizik.verbalNote*0.20;
        double tarihAverage = this.tarih.note*0.80 + this.tarih.verbalNote*0.20;
        double matematikAverage = this.matematik.note*0.80 + this.matematik.verbalNote*0.20;
        double grade = (fizikAverage + tarihAverage + matematikAverage) / 3.0;
        this.average = Math.round(grade*100)/100;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 60;
    }

    public void printNote(){
        System.out.println("------------------");
        System.out.println("Öğrenci " + this.name);
        System.out.println("Matematik   , Sınav Notu : " + this.matematik.note +    "   | Sözlü Notu : "+this.matematik.verbalNote);
        System.out.println("Fizik       , Sınav Notu : " + this.fizik.note +        "   | Sözlü Notu : "+this.fizik.verbalNote);
        System.out.println("Tarih       , Sınav Notu : " + this.tarih.note +        "   | Sözlü Notu : "+this.tarih.verbalNote);
    }

}
