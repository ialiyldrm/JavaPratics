package StudentNoteSystem.src;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double verbalRate;
    double noteRate;
    
    
    public Course(String name, String code, String prefix,double verbalRate,double noteRate) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalRate=verbalRate;
        this.noteRate=noteRate;
                  
    }
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }
    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
