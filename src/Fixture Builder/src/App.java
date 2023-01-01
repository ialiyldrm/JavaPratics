import java.util.Scanner;

public class App {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("**************Fikstur Oluşturucuya Hoşgeldiniz.**************");
        System.out.print("Turunuvadaki takım sayısını giriniz: ");
        int teamCount=input.nextInt();
        
        TeamsFixture teams=new TeamsFixture();

        for(int i=0;i<teamCount;i++){
            System.out.print("Takım Adını Giriniz: ");
            String teamName=input.next();
            teams.teamList.add(teamName);
        }
        /*
        teams.teamList.add("Galatasaray");
        teams.teamList.add("FenerBahce");
        teams.teamList.add("Besiktas");
        teams.teamList.add("Bursaspor");
        teams.teamList.add("Hatayspor");
        teams.teamList.add("Trabzonspor");
        teams.teamList.add("Boluspor");
        teams.teamList.add("Adanaspor");
        */
        teams.ligFixture();

    }
}
