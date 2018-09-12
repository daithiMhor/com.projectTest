import javax.swing.JOptionPane;



    public class Snacks {
        public static void main(String[] args) {
            String firstName, className, snacksToAString;
            int snacks;
            float priceToPay;
            final float COST = 2.00f;

            // creating input dialogs

            firstName = JOptionPane.showInputDialog("What is your name ?");
            className = JOptionPane.showInputDialog("What is your class ?");
            snacksToAString = JOptionPane.showInputDialog("How many snacks would you like ?");
            snacks= Integer.parseInt(snacksToAString);

            priceToPay = snacks*COST;

            //creating the final show dialog box

            JOptionPane.showMessageDialog(null,"Your name is " + firstName  + "and your class is " + className + " the amount you owe is € " + priceToPay,"Output Info", JOptionPane.INFORMATION_MESSAGE);



        }

    }


