// break and continue
//
//
// break->In java, break statement is used when working with any kind of a loop
// or a switch statement. It breaks out of the loop or a switch statement and
// returns the control to the main body of the program. In the case of nested
// loops, it breaks the inner loop and control is returned to the outer loop.

class ofBOth {
    void breaking() {
        System.out.println("ye hai break jisme loop ke bahar aa jata hai ");
        for (int n = 1; n <= 20; n++) {
            if (n % 2 == 0) { // print iske andar hai to iska mtlb bs even value pe hi ye print krega
                System.out.println(n);
                if (n == 12) {
                    break;// it will make the it come out of the loop after printing 12
                }
            }
        }
    }

    // continue->The continue statement breaks the current iteration in the loop, if
    // a specified condition occurs, moves to the end of the loop, and continues
    // with the next iteration in the loop.

    void condition() {
        System.out.println("\nye hai continue jisme bs jump kr jata hai ");
        for (int n = 1; n <= 20; n++) {
            if (n % 2 == 0) {
                if (n == 12) {
                    continue;// iski wajah se 12 pe continue hoga aur jump ke jyega to bs ye hi print nhi
                             // krega baki sare no.print krega
                }
                System.out.println(n);// aur yha ye %2 wale if ke andr hai yani bs whi value print hongi jo even hai
            }                         // agr hm ye print phle krte break ki tarah to koi frq nhi pdta kyuki wo phel 12
                                      // print kr deta fir compare krke jump krta
        }
    }

}

class A4_java {
    public static void main(String[] args) {
        ofBOth ob = new ofBOth();
        ob.breaking();
        ob.condition();
    }
}