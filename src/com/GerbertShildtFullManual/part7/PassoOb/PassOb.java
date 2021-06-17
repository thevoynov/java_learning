package com.GerbertShildtFullManual.part7.PassoOb;

class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    //  возвратить логическое значение true, если в
    //  качестве параметра o указан вызывающий объект
    boolean equalTo(Test o) {
        if(o.a == a && o.b == b)
            return true;
        else
            return false;
    }
}

class PassOb {
    public static void main(String args[]) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
