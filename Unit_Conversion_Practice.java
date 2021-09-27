import java.util.Scanner;
public class Unit_Conversion_Practice {
    public static void km_to_mi() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        double km_in = in.nextDouble();
        System.out.println("Miles: " + (km_in / 1.609));
    }
    public static void mi_to_km() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter distance in miles: ");
        double mi_in = in.nextDouble();
        System.out.println("Kilometers: " + (mi_in * 1.609));
    }
    public static void in_to_ft() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length in inches: ");
        double in_in = in.nextDouble();
        System.out.println("Feet: " + (in_in / 12));
    }
    public static void in_to_cm() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length in inches: ");
        double in_in = in.nextDouble();
        System.out.println("Centimeters: " + (in_in * 2.54));
    }
    public static void in_to_mm() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length in inches: ");
        double in_in = in.nextDouble();
        System.out.println("Millimeters: " + (in_in * 25.4));
    }
    public static void cm_to_in() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length in centimeters: ");
        double cm_in = in.nextDouble();
        System.out.println("Inches: " + (cm_in / 2.54));
    }
    public static void cm_to_mm() {
        System.out.println("Multiply by ten.");
    }
    public static void m_to_yd() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length in meters: ");
        double m_in = in.nextDouble();
        System.out.println("Yards: " + (m_in * 1.0936));
    }
    public static void m_to_ft() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length in meters: ");
        double m_in = in.nextDouble();
        System.out.println("Feet: " + (m_in * 1.0936 * 3));
    }
    public static void ft_to_m() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length in feet: ");
        double ft_in = in.nextDouble();
        System.out.println("Meters: " + (ft_in / (1.0963 * 3)));
    }
    public static void ft_to_cm() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length in feet: ");
        double ft_in = in.nextDouble();
        System.out.println("Centimeters: " + (ft_in * 1.0963 * 30));
    }
    public static void ft_to_mm() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length in feet: ");
        double ft_in = in.nextDouble();
        System.out.println("Millimeters: " + (ft_in * 1.0963 * 300));
    }
    public static void ft_to_in() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length in feet: ");
        double ft_in = in.nextDouble();
        System.out.println("Inches: " + (ft_in * 12));
    }
    public static void ft_to_yd() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length in feet: ");
        double ft_in = in.nextDouble();
        System.out.println("Yards: " + (ft_in * 3));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the original unit: ");
            String user_in = in.next();
            System.out.println("Enter the conversion unit: ");
            String user_out = in.next();
            if (user_in.equalsIgnoreCase("feet") || user_in.equalsIgnoreCase("ft")) {
                if (user_out.equalsIgnoreCase("meters") || user_out.equalsIgnoreCase("m")) {
                    ft_to_m();
                } else if (user_out.equalsIgnoreCase("centimeters") || user_out.equalsIgnoreCase("cm")) {
                    ft_to_cm();
                } else if (user_out.equalsIgnoreCase("millimeters") || user_out.equalsIgnoreCase("mm")) {
                    ft_to_mm();
                } else if (user_out.equalsIgnoreCase("inches") || user_out.equalsIgnoreCase("in")) {
                    ft_to_in();
                } else if (user_out.equalsIgnoreCase("yards") || user_out.equalsIgnoreCase("yd")) {
                    ft_to_yd();
                }
            } else if (user_in.equalsIgnoreCase("inches") || user_in.equalsIgnoreCase("in")) {
                if (user_out.equalsIgnoreCase("feet") || user_out.equalsIgnoreCase("ft")) {
                    in_to_ft();
                } else if (user_out.equalsIgnoreCase("centimeters") || user_out.equalsIgnoreCase("cm")) {
                    in_to_cm();
                } else if (user_out.equalsIgnoreCase("millimeters") || user_out.equalsIgnoreCase("mm")) {
                    in_to_mm();
                }
            } else if (user_in.equalsIgnoreCase("centimeters") || user_in.equalsIgnoreCase("cm")) {
                if (user_out.equalsIgnoreCase("inches") || user_out.equalsIgnoreCase("in")) {
                    cm_to_in();
                } else if (user_out.equalsIgnoreCase("millimeters") || user_out.equalsIgnoreCase("mm")) {
                    cm_to_mm();
                }
            } else if (user_in.equalsIgnoreCase("meters") || user_in.equalsIgnoreCase("m")) {
                if (user_out.equalsIgnoreCase("feet") || user_out.equalsIgnoreCase("ft")) {
                    m_to_ft();
                } else if (user_out.equalsIgnoreCase("yards") || user_out.equalsIgnoreCase("yd")) {
                    m_to_yd();
                }
            } else if (user_in.equalsIgnoreCase("kilometers") || user_in.equalsIgnoreCase("km")) {
                if (user_out.equalsIgnoreCase("miles") || user_out.equalsIgnoreCase("mi")) {
                    km_to_mi();
                }
            } else if (user_in.equalsIgnoreCase("miles") || user_in.equalsIgnoreCase("mi")) {
                if (user_out.equalsIgnoreCase("kilometers") || user_out.equalsIgnoreCase("km")) {
                    mi_to_km();
                }
            }
            System.out.println("Would you like to continue? (Y/N)");
            String cont = in.next();
            if (cont.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
