import java.util.Scanner;
public class Unit_Conversion_Practice_v1 {
    public static void main(String[] args) {
        Unit_Conversion_v1_Reference ref = new Unit_Conversion_v1_Reference();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter original unit (in, ft, m, cm, mm): ");
        String unit_in = in.nextLine();
        System.out.println("Enter conversion unit (cannot be the same as the original): ");
        String unit_out = in.next();
        System.out.println("Enter the amount: ");
        double x = in.nextDouble();
        boolean in_foot = unit_in.equalsIgnoreCase("ft");
        boolean in_inch = unit_in.equalsIgnoreCase("in");
        boolean in_meter = unit_in.equalsIgnoreCase("m");
        boolean in_centi = unit_in.equalsIgnoreCase("cm");
        boolean in_milli = unit_in.equalsIgnoreCase("mm");
        boolean out_foot = unit_out.equalsIgnoreCase("ft");
        boolean out_inch = unit_out.equalsIgnoreCase("in");
        boolean out_meter = unit_out.equalsIgnoreCase("m");
        boolean out_centi = unit_out.equalsIgnoreCase("cm");
        boolean out_milli = unit_out.equalsIgnoreCase("mm");
        while (true) {
            if (in_foot) {
                if (out_inch) {
                    System.out.println(ref.ft_to_in(x));
                } else if (out_meter) {
                    System.out.println(ref.ft_to_m(x));
                } else if (out_centi) {
                    System.out.println(ref.ft_to_cm(x));
                } else if (out_milli) {
                    System.out.println(ref.ft_to_mm(x));
                }
            } else if (in_inch) {
                if (out_foot) {
                    System.out.println(ref.in_to_ft(x));
                } else if (out_meter) {
                    System.out.println(ref.in_to_m(x));
                } else if (out_centi) {
                    System.out.println(ref.in_to_cm(x));
                } else if (out_milli) {
                    System.out.println(ref.in_to_mm(x));
                }
            } else if (in_meter) {
                if (out_centi) {
                    System.out.println(ref.m_to_cm(x));
                } else if (out_milli) {
                    System.out.println(ref.m_to_mm(x));
                } else if (out_inch) {
                    System.out.println(ref.m_to_in(x));
                } else if (out_foot) {
                    System.out.println(ref.m_to_ft(x));
                }
            } else if (in_centi) {
                if (out_meter) {
                    System.out.println(ref.cm_to_m(x));
                } else if (out_milli) {
                    System.out.println(ref.cm_to_mm(x));
                } else if (out_inch) {
                    System.out.println(ref.cm_to_in(x));
                } else if (out_foot) {
                    System.out.println(ref.cm_to_ft(x));
                }
            } else if (in_milli) {
                if (out_meter) {
                    System.out.println(ref.mm_to_m(x));
                } else if (out_centi) {
                    System.out.println(ref.mm_to_cm(x));
                } else if (out_inch) {
                    System.out.println(ref.mm_to_in(x));
                } else if (out_foot) {
                    System.out.println(ref.mm_to_ft(x));
                }
            }
            System.out.println("Would you like to continue? (Y/N): ");
            String cont = in.next();
            if (cont.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
