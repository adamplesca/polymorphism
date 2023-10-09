import javax.swing.JOptionPane;

public class AnimalApp{

    public static void main(String []args){

        animal ani = new animal();

        int choice;

        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick a number for an animal"));
        ani.setChoice(choice);

        switch(choice){
            case 1: cat cat = new cat();
                    cat.cry();
                break;
            case 2: dog dog = new dog();
                    dog.cry();
                break;
            case 3: bird bird = new bird();
                    bird.cry();
                break;
        }
    }
}