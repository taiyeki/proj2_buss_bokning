import java.util.Scanner;


    public class App {
        public static void meny () {
            System.out.println("1. Boka en plats.");
            System.out.println("2. Visa lediga platser.");
            System.out.println("3. Beräkna vinst.");
            System.out.println("4. Stäng ner.");
        }
    
        public static void main(String[] args) throws Exception {
            System.out.println("Välkommen till Bussbokning!");
            
            int[] platser = new int[20];
            Scanner tb = new Scanner(System.in);
            int personnummer = 0;
            int plats = 0;
            int val = 0;
    
            while (val != 4) {
                meny();
                System.out.println("Välj ditt val 1-4");
                val = tb.nextInt();
                tb.nextLine();
            
                if (val == 1) {
                    System.out.println("Vilken plats vill du välja 1-20");
                    plats = tb.nextInt() - 1;
                    tb.nextLine();
                    System.out.println("Ange ditt personnummer: ÅÅMMDD");
                    personnummer = tb.nextInt();
                    tb.nextLine();
                    if (platser[plats] == 0) {
                        platser[plats] = personnummer;
                        System.out.println("Success, plats " + plats + " är nu bokad under " + personnummer);
                    } else {
                        System.out.println("Felaktig plats, välj en annan.");
                    }
                }
            
                if (val == 2) {
                    System.out.println("Lediga platser");
                    for (int i = 0; i < platser.length; i++) {
                        if (platser[i] == 0) {
                            System.out.println("Plats "+(i+1)+" är ledig");
                        } else {
                            System.out.println("Plats "+(i+1)+" är upptagen.");
                        }
                    }
                }
            
                if (val == 3) {
                    int bokadeplatser = 0;
                    for (int stol : platser) {
                        if (stol != 0) {
                            bokadeplatser++;
                        }
                    }
                    int vinst = bokadeplatser * 299;
                    System.out.println("Total vinst: " + vinst + " SEK");
                }
            
                if (val == 4) {
                    System.out.println("Stänger ner programmet.");
                }
            }
        }
    }
    