package lessons.lambda;

public class TestAuth {



    public static void main(String[] args) {
        String key= "Key: iou4io32uiu2431oiu4oi2u13p4pou3d5f9";
        String access = " has access";

        Authentication a = t -> t.toUpperCase();

        Authentication b = t ->{
            return String.valueOf(t.hashCode());
        };

        String cadena = "claro que lo entendemos";

        testAuthenticationToUpperCase("Key: iou4io32uiu2431oiu4oi2u13p4pou3d5f9");
        testAuthenticationGetHashCode("Key: iou4io32uiu2431oiu4oi2u13p4pou3d5f9");

//        Authentication c = str -> System.out.println(str.hashCode());
//
//        Authentication a = new Authentication() {
//            @Override
//            public void auth(String key) {
//                System.out.println(key.toUpperCase()+" has access");
//            }
//      };
        testAuthentication(cadena);


        }

    public static void testAuthentication(String c) {
        ;
        System.out.println(c+" has access");

    }

    public static void testAuthenticationToUpperCase(String c) {

        System.out.println(String.valueOf(c.hashCode()) +" has access");

    }

    public static void testAuthenticationGetHashCode(String c) {

        System.out.println(c.toUpperCase() +" has access");

    }





        //authentication.auth("Key: iou4io32uiu2431oiu4oi2u13p4pou3d5f9");




    }

