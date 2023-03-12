import java.util.Scanner;

class VictorianStyle {
    int walls = 6;
}

class RoofBedrooms {
    int walls = 3;
}

class StandardRooms {
    int walls = 4;
}

class AccentColor {
    double accentWalls = 1.0 / 3.0;
    double paint = 1.5;
    double hours = 2.5;
}

class RegularColor {
    double regularWalls = 2.0 / 3.0;
    double paint = 2.25;
    double hours = 3.25;
}

public class EuropeanTownship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] ans = new String[T];

        VictorianStyle v = new VictorianStyle();
        RoofBedrooms rb = new RoofBedrooms();
        StandardRooms s = new StandardRooms();
        AccentColor a = new AccentColor();
        RegularColor r = new RegularColor();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();

            double totalHours = 0.0;
            double accentQty = 0.0;
            double regularQty = 0.0;

            for (int j = 0; j < N; j++) {
                int totalBedRooms = sc.nextInt();
                int R = sc.nextInt();
                int S = sc.nextInt();
                int H = sc.nextInt();


                accentQty += a.paint * (R * (rb.walls * a.accentWalls))
                        + a.paint * (S * (s.walls * a.accentWalls))
                        + a.paint * (H * (v.walls * a.accentWalls));

                regularQty += r.paint * (R * (rb.walls * r.regularWalls))
                        + r.paint * (S * (s.walls * r.regularWalls))
                        + r.paint * (H * (v.walls * r.regularWalls));

                totalHours += R * (a.hours * a.accentWalls * rb.walls + r.hours * r.regularWalls * rb.walls)
                        + S * (a.hours * a.accentWalls * s.walls + r.hours * r.regularWalls * s.walls)
                        + H * (a.hours * a.accentWalls * v.walls + r.hours * r.regularWalls * v.walls);
            }
            ans[i] = ("Case #" + (i + 1) + ": " + totalHours + ", " + accentQty + ", " + regularQty);
        }
        for(int i=0; i<T; i++)
        {
            System.out.println(ans[i]);
        }
        sc.close();
    }
}
