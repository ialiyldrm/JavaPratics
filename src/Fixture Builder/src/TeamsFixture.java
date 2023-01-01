import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class TeamsFixture{
    List<String> teamList=new LinkedList<>();

    public void ligFixture(){
        System.out.println();
        if(teamList.size() % 2 != 0){//Eğer takım sayısı tek ise "Bay" ekleniyor!
            teamList.add("Bay");
        }

        if(teamList.size() != 0){
            System.out.println("Takımlar");
            for(String team:teamList){
                if(team.equals("Bay")){
                    continue;
                } else {
                    System.out.println("-" + team);
                }                                
            }
        }else{
            System.out.println("Takım Yok!");
        }
        System.out.println();
        round();
    }

    public void round(){
        List<String> teamListWeek = new LinkedList<>();

        int teamCount = teamList.size();

        int weekCount = 2 * (teamList.size() - 1);

        List<String> teamListCopy = new LinkedList<>(teamList);
        
        int value = teamList.size() / 2;


        for(int i = 1; i < teamCount ; i++){

            for(int j = 0; j <= value + 2; j += 2){

                teamListWeek.add(teamListCopy.get(j)+ "-" + teamListCopy.get(j+1));

            }

            teamListCopy.add(1,teamListCopy.get(value));
            teamListCopy.add(value,teamListCopy.get(teamListCopy.size() - 1));
            teamListCopy.remove(teamListCopy.size() - 1);
            teamListCopy.remove(teamListCopy.size() - 2);
        }

        for(int i = weekCount / 2 + 2 ; i <= weekCount + 1 ; i++){
            for(int j = 0; j <= value + 2; j += 2){

                teamListWeek.add(teamListCopy.get(j+1)+ "-" + teamListCopy.get(j));

            }

            teamListCopy.add(1,teamListCopy.get(value));
            teamListCopy.add(value,teamListCopy.get(teamListCopy.size() - 1));
            teamListCopy.remove(teamListCopy.size() - 1);
            teamListCopy.remove(teamListCopy.size() - 2);
        }

        int count=0;
        int num;
        
        for (int i = 1; i <= weekCount ; i++) {
            
            System.out.println("*********************\nRound " + i);

            List<String> tempTeamList =new LinkedList<>();

            for(int j = count; j < count + value ; j++){
                tempTeamList.add(teamListWeek.get(j));
            }

            for(int k = 0; k < value; k++){
                num = new Random().nextInt(tempTeamList.size());
                System.out.println(tempTeamList.get(num));
                tempTeamList.remove(num);
            } 
            count +=value;  
            System.out.println();            
        }
    }
    
    
}