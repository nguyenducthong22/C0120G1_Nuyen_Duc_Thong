package Clients;


import java.util.ArrayList;

public class Clients {
    public static ArrayList<String[]> getClients()
    {
        String client1[]=new String[]{
                "Quy Hon ",
                "1-11-111",
        };
        String client2[]=new String[]{
                "Cuc Lac",
                "2-22-222",

        };

        String client3[]=new String[]{
                "Cuoi Hac",
                "4-44-444",
                "Tay Nguyen"
        };

        String client4[]=new String[]{
                "Thang Thien",
                "3-33-333",

        };

        ArrayList<String[]> listClients=new ArrayList<String[]>();
        listClients.add(client1);
        listClients.add(client2);
        listClients.add(client3);
        listClients.add(client4);


        return listClients;
    }
}