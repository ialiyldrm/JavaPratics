package StudentNoteSystem.src;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    int matNote;
    int fizikNote;
    int kimyaNote;
    int matVerbalNote;
    int fizikVerbalNote;
    int kimyaVerbalNote;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo,Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat =mat;
        this.fizik=fizik;
        this.kimya=kimya;
        calcAvarage();
        this.isPass = false;
    }
   

    public void addBulkExamNote(int matNote, int fizikNote, int kimyaNote) {

        if (matNote >= 0 && matNote <= 100) {
            this.matNote=matNote;
        }else{
            System.out.print("Hatalı not girdiniz!");
        }

        if (fizikNote >= 0 && fizikNote <= 100) {
           this.fizikNote=fizikNote;
        }else{
            System.out.print("Hatalı not girdiniz!");
        }

        if (kimyaNote >= 0 && kimyaNote <= 100) {
            this.kimyaNote=kimyaNote;
        }else{
            System.out.print("Hatalı not girdiniz!");
        }
    }


    

    public void addBulkVerbalNote(int matVerbal,int fizikVerbal,int kimyaVerbal){
        if (matVerbal >= 0 && matVerbal <= 100) {
            this.matVerbalNote = matVerbal;
        }else{
            System.out.print("Hatalı not girdiniz!");
        }

        if (fizikVerbal >= 0 && fizikVerbal <= 100) {
            this.fizikVerbalNote = fizikVerbal;
        }else{
            System.out.print("Hatalı not girdiniz!");
        }

        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) {
            this.kimyaVerbalNote = kimyaVerbal;
        }else{
            System.out.print("Hatalı not girdiniz!");
        }

    }
    
    
 
    public void calcAvarage() {
        
        this.avarage=((matNote*mat.noteRate+fizikNote*fizik.noteRate+kimyaNote*kimya.noteRate) 
                    + (matVerbalNote*mat.verbalRate+fizikVerbalNote*fizik.verbalRate+kimyaVerbalNote*kimya.verbalRate))/3;
    }
    
    public void isPass() {
        if (this.matNote== 0 || this.fizikNote == 0 || this.kimyaNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } 
        else if(this.matVerbalNote == 0 || this.fizikVerbalNote == 0 || this.kimyaVerbalNote == 0){
            System.out.println("Notlar tam olarak girilmemiş");
        }
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matNote + "\nSözlü Notu :" + matVerbalNote);
        System.out.println("Fizik Notu : " + this.fizikNote + "\nSözlü Notu :" + fizikVerbalNote);
        System.out.println("Kimya Notu : " + this.kimyaNote + "\nSözlü Notu :" + kimyaVerbalNote);
    }
    
}
