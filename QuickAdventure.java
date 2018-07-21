import java.sql.SQLOutput;
import java.util.Scanner;

public class QuickAdventure {
    public static void main(String[] args){
        Scanner print = new Scanner(System.in);

        String input;

        //CHANGE ANSWER HERE
        String A1 = "attack";
        String A2 = "run";
        String B1 = "block";
        String B2 = "dodge";
        String B3 = "jump";
        String B4 = "hide";
        String C1 = "charge";
        String C2 = "run";
        String C3 = "knife";
        String C4 = "dodge";
        String C5 = "gasp";
        String C6 = "stay";
        String C7 = "knife";
        String C8 = "dodge";

        //Beginning Story Text todo: Edit beginning storyline
        System.out.println("The Quick Adventure!");
        System.out.println("You are in a forest and you run into a direwolf. You carry a knife and you are starving.");
        System.out.println("Do you decide to \"attack\" or \"run\" away.");

        //First Input Here
        input = print.next();

        if(input.equals(A1)){
            //todo: chosen A1 storyline
            System.out.println("You charged at the direwolf with your knife and you end up missing.");
            System.out.print("The direwolf then goes in for his attack.");
            System.out.print(" Do you \"block\" with your knife or \"dodge\".");
            //Second Input Here
            input = print.next();
            if(input.equals(B1)){
                //todo: chosen B1 storyline
                System.out.println("You were able to block the direwolf's attack but you have lost the knife.");
                System.out.println("The direwolf is trying to recover from the attack.");
                System.out.println("Do you \"charge\" at the direwolf or \"run\" away.");
                input = print.next();
                if(input.equals(C1)){
                    //todo: chosen C1 storyline
                    System.out.println("You charged at the direwolf. However, the direwolf recovered faster than you expected.");
                    System.out.println("The direwolf was able to catch you off guard. He goes in and attacks.");
                    System.out.println("You failed to kill the direwolf. You have multiple bite wounds and losing blood.");
                    System.out.println("You then die by loss of blood");
                }
				else if(input.equals(C2)){
                    //todo: chosen C2 storyline
                    System.out.println("You run away from the direwolf. Finding the closest tree, you then hide behind it.");
                    System.out.println("The direwolf lost visual of you. He then wanders around hoping to find you.");
                    System.out.println("He then gives up and walks away.");
                    System.out.println("You were able to run away and continue your journey");
                }
				else	System.out.println("Error within B1:C section");
            }
            else if(input.equals(B2)){
                //todo: chosen B2 storyline
                System.out.println("You dodged the direwolf attack but without hesitation the direwolf goes in for the second attack.");
                System.out.println("Do you pull out your \"knife\" or \"dodge\".");
                input = print.next();
                if(input.equals(C3)){
                    //todo: chosen C3 storyline
                    System.out.println("You pull out your knife and pointed the knife at the direwolf.");
                    System.out.println("The direwolf has momentum and cannot change his direction.");
                    System.out.println("You stab the direwolf with your knife in the throat.");
                    System.out.println("The direwolf is unable to recover from your attack.");
                    System.out.println("You now have food and direwolf fur to wear.");
                    System.out.println("You now continue your journey");
                }
				else if(input.equals(C4)){
                    //todo: chosen C4 storyline
                    System.out.println("You try to dodge the direwolf's attack again. The direwolf did not fall for your dodge technique.");
                    System.out.println("The direwolf then bites your legs.");
                    System.out.println("You are unable to move causing you to die from the direwolf.");
                }
				else System.out.println("Error within B2:C section");
            }
			else System.out.println("Error within A1:B section");
        }
        else if(input.equals(A2)){
            //todo: chosen A2 Storyline
            System.out.println("You run away from the direwolf but the direwolf was able to spot you before you fled.");
            System.out.println("The direwolf chases you from behind but he is quite far from you.");
            System.out.println("There is a lake and a bush.");
            System.out.println("Do you \"jump\" in the lake or \"hide\" in the bush.");
            input = print.next();
            if(input.equals(B3)){
                //todo: chosen B3 storyline
                System.out.println("You jump into the lake hoping that the direwolf didn't see you.");
                System.out.println("The direwolf did not see you jump into the lake.");
                System.out.println("However, the direwolf wanders around the area sniffing for your scent.");
                System.out.println("You are about to run out of breath under water.");
                System.out.println("Do you go up to \"gasp\" for air or \"stay\" under water.");
                input = print.next();
                if(input.equals(C5)){
                    //todo: chosen C5 storyline
                    System.out.println("You went up to gasp for air but the direwolf was still around the area.");
                    System.out.println("The direwolf spots you. The direwolf jumps into the lake hunting you down.");
                    System.out.println("You are not that mobile in water but you try your best to get away from the direwolf.");
                    System.out.println("The direwolf catches up to you and bites you from your thighs.");
                    System.out.println("Now you are unable to swim, you then drown to your death.");
                }
				else if(input.equals(C6)){
                    //todo: chosen C6 storyline
                    System.out.println("You stay underwater for a little longer. You are desperately in need for air but you indure the urge to go up.");
                    System.out.println("The direwolf is getting tired of looking for you and starts walking away.");
                    System.out.println("Within seconds, you then pop out of the lake gasping for air. You're coughing out water.");
                    System.out.println("You are able to continue your journey but you stay around the lake to find something to eat.");
                }
				else System.out.println("Error within B3:C section");
            }
			else if(input.equals(B4)){
                //todo: chosen B4 storyline
                System.out.println("You hide in the bush and hoping  that the direwolf didn't see you.");
                System.out.println("The direwolf did not see you hide into the bush.");
                System.out.println("However, the direwolf wanders around the area sniffing for your scent.");
                System.out.println("The direwolf is able to pick up your scent and proceed to charge at the bush.");
                System.out.println("Do you pull out your \"knife\" or \"dodge\".");
                input = print.next();
                if(input.equals(C7)){
                    //todo: chosen C7 storyline
                    System.out.println("You pull out your knife and you prepare for an attack as the direwolf attacks you.");
                    System.out.println("As the direwolf attacks you, you are able to stab him in the head.");
                    System.out.println("You now have food and direwolf fur to wear.");
                    System.out.println("You then continue your journey.");
                }
				else if(input.equals(C8)){
                    //todo: chosen C8 storyline
                    System.out.println("You try to dodge as the direwolf charged at you.");
                    System.out.println("However you get stuck in the bush from all the branches. You are unable to escape in time.");
                    System.out.println("The direwolf was able to bite your arms.");
                    System.out.println("You try to fight it off but the direwolf as extraordinary strength. You weren't able to overcome his strength.");
                    System.out.println("You then die from the direwolf.");
                }
				else System.out.println("Error within B4:C section");
            }
			else System.out.println("Error within A2:B section");
        }
		else System.out.println("Error within A section");


    }
}
