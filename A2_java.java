import java.util.*;

//if else 
/*
if elseif 
*/

//switch

class condition {

    void ifelse(int i) {
        // checking if else condition
        // simple example for if else condition
        System.out.println("\nye if else wale ka ans hai ");
        if (i < 30) {
            System.out.println("you are fail");
        } else {
            System.out.println("you are pass");
        }
    }

    void nestedif(int j) {
        System.out.println("\nye nested if wale ka hai");
        if (j < 30) { // 1st if
            if (j < 20) { // 2nd if
                System.out.println("you are worse");
                if (j == 0) {// 3rd if
                    System.out.println("you got perfect anda");
                } else { // 3rd if a else
                    System.out.println("you got less than 20 ");
                }
            } else {// 2nd if ka else
                System.out.println("you got more than 20 marks but still worse");
            }
        } else {// 1st if ka else
            if (j > 80) { // 4th if
                System.out.println("you are a brillient student");
                if (j == 100) {// 5th if
                    System.out.println("you got perfect saw");
                } else {// 5th if ka else
                    System.out.println("thoda aur padh leta to 100 tha koi na agli war badiya");
                }
            } else { // 4th ka else
                System.out.println("keep it up you got less than 80 but nxt time bst luck");
            }
        }
    }

    void elseif(int marks) {
        System.out.println("\nye else if hai ");
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: D");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade: E");
        } else {
            System.out.println("sry bhaiya moye moye ho gya");
        }
    }

    void switching(int i) {
        // switch statement Java mein ek control flow statement hai jo ek variable ya
        // expression ke value ke basis par alag-alag code blocks ko execute karta hai.
        // Ye ek decision-making mechanism hai jisme ek expression ki value ko multiple
        // cases ke saath compare kiya jata hai aur jab koi case match hota hai, to us
        // case ke associated code block ko execute karta hai.

        // ise likhne ke do traekee hote hai phle normal method ek nya advnce method aya
        // hai
        // but phle ye hi normal dekh lo

        System.out.println("\naur ye hai switcing");

        switch (i) {
            case 0:
                System.out.println("bade nalle nikle tum to");
                break;
            case 10:
                System.out.println("lo 10 aya hai ");
                break;
            case 20:
                System.out.println("lo 20 aa gya ");
                break;
            case 30:
                System.out.println("lo aa 30 gya ");
                break;
            case 40:
                System.out.println("lo aa 40 gya ");
                break;
            case 50:
                System.out.println("lo aa 50 gya ");
                break;
            case 60:
                System.out.println("lo aa 60 gya ");
                break;
            case 70:
                System.out.println("lo aa 70 gya ");
                break;
            case 80:
                System.out.println("lo aa 80 gya ");
                break;
            case 90:
                System.out.println("lo aa 90 gya ");
                break;
            case 100:
                System.out.println("lo aa 100 gya tum topper  ");
                break;
            // agr break nhi lgoge to jha value match krege wha execute krega aur agr break
            // nhi to uske agle wala bhi execute hoga
        }
    }
}

public class A2_java {
    public static void main(String[] args) {
        // try use kr taki ye ek war chale aur fir close ho jye execute hote hi taki
        // fltu coumpsition na ho aur baki ek term hai memory lekage wo na ho usko abhi
        // age dekhenge
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("dekho bhaiya round figure me value dalna 20 20 30 aise ");
            System.out.print("enter the value of i :");
            int i = scan.nextInt();
            System.out.println(i);
            condition con = new condition();
            con.ifelse(i);
            // this is nested if mtlb ek ek andar ek aur else if
            con.nestedif(i);
            // agr else if lader
            // use kro to comment kr kr ke dekh lo taki confusion na ho
            con.elseif(i);
            // switch staments
            con.switching(i);
        }
    }
}
