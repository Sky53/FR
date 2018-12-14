package Metod;

class ErrorMsq {
    String msgs[] = {
            "Error output",
            "Error input",
            "No disk spase",
            "Out of range"
    };

    String getErrorMsq(int i) {
        if (i >= 0 & i < msgs.length) {
            return msgs[i];
        } else {
            return "non-existen error code ";
        }
    }
}

class ErrMsg {
    public static void main(String[] args) {
        ErrorMsq err = new ErrorMsq();
        System.out.println(err.getErrorMsq(2));
        System.out.println(err.getErrorMsq(19));

    }
}
