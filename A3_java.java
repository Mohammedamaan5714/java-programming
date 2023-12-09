//loop
/*
for 
while
do while
*/
//in loop every topic may or may not define
//1.normal loop 
//2.infiite loop
//3.nested loop

//hybrid loop bhi dekhenge 
//aur dekhte hai

class looping {
    void forloop() {
        System.out.println("\n ye hai for loop");
        // creating a loop to print 0 to 10 number
        for (int i = 0; i <= 10; i++) { // for (initialization; condition; update) {code that you want to execute}
            System.out.println(i);
        }



        // creating infinte loop
        // for(int i=0;i>=0;i++){
        // System.out.println(i);
        // }


        
        // nested for
        System.out.println("\n ye nested for hai");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            for (int j = 0; j <= 10; j++) {
                System.out.print("*"); // agr print ke sath ln lha doge to ek line me aa jyega
            }
        }
        // for loop 0 se 10 tak i ko iterate karta hai.
        // Har i ke liye, System.out.println(i); line i ki value ko print karegi. Yeh
        // numbers 0 se 10 tak ek ke baad ek alag-alag lines par print honge.
        // Fir har i ke liye, ek aur for loop chalta hai j wala. Yeh * (asterisk) 11
        // baar print
        // karega, ek line me. jiske bad hi i ki value ayegi kyuki ln to hai nhi agr lga
        // hota to sb nxt line me hota

        System.out.println("\n \n hai ye bhi nested but advanced");// hme 2 war \n is liye lgae kyuki wo last wale 33
                                                                   // line pe ln nhi hai to same line pe aa rha tha
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            for (int j = 0; j <= 10; j++) {
                System.out.print("*"); // agr print ke sath ln lha doge to ek line me aa jyega
            }
            System.out.println("");
        }
        // Outer for loop i goes from 0 to 10.

        // Har i ke liye, System.out.println(i); line i ki value ko print karegi.

        // Fir har i ke liye, ek aur for loop chalta hai. Yeh inner loop 11 baar *
        // (asterisk) print karta hai, lekin System.out.print("*"); me ln ke bina
        // newline
        // character ke saath.

        // Phir System.out.println(""); newline character print karta hai, jo ek khali
        // line generate karta hai, so that next iteration ke numbers aur asterisks alag
        // line pe aayen.
    }

    void whileloop() {
        System.out.println("\n ye hai while loop");

        int i = 0;
        while (i <= 10) {// while loop me phle intialization hota hai jise line 39 me hua fir
                         // while(condition){code and then in last line update}
            System.out.println(i);

            i++;
        }

        

        // infinite while loop
        // int i = 0;

        // while (i < 1) {
        // System.out.println("sada bahar");
        // }



        // nested while loop
        System.out.println("\n y nested while hai");
        int outer = 1;

        while (outer <= 3) {
            int inner = 1;

            while (inner <= 3) {
                System.out.println("Outer: " + outer + ", Inner: " + inner);
                inner++;
            }

            outer++;
        }
    }

    void dowhileloop() {
        System.out.println("\n ye hai do while loop ");
        int a = 50;

        do {
            System.out.println(a);
            a++;
        } while (a < 60);



        // infinite

        // int c = 0;
        // do {
        // System.out.println("Count: " + c);
        // count++;
        // 
        // } while (true);




        // nested do while
        // kam ata pta nhi kha hai but fir bhi majboori
        System.out.println("\n ye hai nested do while loop jaise wo upr while wala tha");
        int i = 0;

        do {
            System.out.println(i);
            int j = 0;
            do {
                System.out.print("*");
                j++;
            } while (j <= 10);
            System.out.println("");
            i++;
        } while (i <= 10);

    }
}

public class A3_java {
    public static void main(String[] args) {
        looping yehai = new looping();
        yehai.forloop();
        yehai.whileloop();
        yehai.dowhileloop();
    }
}