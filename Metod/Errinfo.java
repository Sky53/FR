package Metod;

class Err {
    String msg1; // сообщение об ошибке
    int severity; // уровень серьезности

    Err(String m, int s) {
        msg1 = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs1[] = {
            "Error output",
            "Error input",
            "No disk spase",
            "Out of range"
    };
    int howbad[] = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs1.length) {
            return new Err(msgs1[i], howbad[i]);
        } else {
            return new Err("invalid error code", 0);
        }
    }
}

class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg1 + " level: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg1 + " level: " + e.severity);
    }
}
