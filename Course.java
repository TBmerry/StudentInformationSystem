public class Course {
    Teacher courseTeacher;
    String name;
    String prefix;
    String code;
    int note;
    int verbalNote;

    public Course(String name, String prefix, String code){
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addTeacher(Teacher tt){
        if (this.prefix.equals(tt.Branch)){
            this.courseTeacher = tt;
            System.out.println("Başarılı");
        } else {
            System.out.println(tt.name + " Hocamız Bu Derse Tanımlanmamıştır.");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name + " Dersinin Hocası " + courseTeacher.name );
        } else {
            System.out.println(this.name + " Dersine Hoca Atanmamıştır !!");
        }
    }
}
