
public class Exercise1 {

   

    static boolean iWillReview = false;

    static boolean iWillNotFail = false;




    public static void main(String[] args) throws Exception  {




        App myApp = new App();




        // precondition

        assert iWillReview == true: "Studying..";




        myApp.Study();




        // postcondition

        assert iWillNotFail == true: "Wow sabit!";




        System.out.println(iWillReview);

        System.out.println(iWillNotFail);




}

        void Study() {




            iWillReview = true;

            iWillNotFail = false;

  }

}
