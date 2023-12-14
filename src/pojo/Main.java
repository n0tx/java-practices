package pojo;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            Student riki = new Student("a1523000" + i,
                    switch (i) {
                        case 1 -> "Riki";
                        case 2 -> "Candra";
                        case 3 -> "Buana";
                        default -> "Anonymous";
                    },
                    "21/09/1983",
                    "Java Master Class");
            System.out.println(riki);
        }

        for (int i = 1; i <= 4; i++) {
            StudentRecord rikiReocrd = new StudentRecord("a1523000" + i,
                    switch (i) {
                        case 1 -> "Riki";
                        case 2 -> "Candra";
                        case 3 -> "Buana";
                        default -> "Anonymous";
                    },
                    "21/09/1983",
                    "Java Master Class");
            System.out.println(rikiReocrd);
        }
    }
}
