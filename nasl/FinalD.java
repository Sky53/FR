package nasl;

class ErrorMsg2 {
    /**
     * Коды ошибок
     * Константы объявленные с помощью слова final
     */
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs2[] = {"Error output", "Error input","Disk Full", "Index Out-Of-Bounds"};
    // Возврат значения об ошибке
    String getErrorMsg2(int i){
        if ( i >= 0 & i <msgs2.length){
            return msgs2[i];
        }else {
            return "Invalid Error Code";
        }
    }
}

public class FinalD {
    public static void main(String[] args) {
        ErrorMsg2 err = new ErrorMsg2();
        /**
         * При вызове используются константы,
         * объявленные с помощью слова final
         */
        System.out.println(err.getErrorMsg2(err.OUTERR));
        System.out.println(err.getErrorMsg2(err.DISKERR));
    }
}
