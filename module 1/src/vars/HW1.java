package vars;

public class HW1 {
    public static void main(String[] args){
        //арифметическии операции между однотипами
        int a = 3; // создание переменной с инициализацей
        int b = 7;
        int c = a - b; // инициализация переменной путем вычитания других переменных
        System.out.println(a + b);
        System.out.println(a-c);
        System.out.println(b * c);
        System.out.println(b/a + " результат деления приводится к целочисленному значению, вся нецелая часть отсекается");
        System.out.println(b%a); // получаем остаток по модудю

        byte d,e,f,r; //создание переменных без инициализации
        d = 127;      //инициализиция переменной числовым значением
        e = 25;
        f = (byte) (d - e);
        r = (byte) (d / e);
        System.out.println(d % e);
        System.out.println(f);
        System.out.println(r);

        short h = 12222;
        short k = -34;
        short g = (short) (h + k);
        System.out.println(g);
        System.out.println(h+k);
        System.out.println(h-k);
        System.out.println(h*k);
        System.out.println(h%k);

        long aa = -909;
        long bb = aa + 23;
        long dd = aa + bb;
        long cc = bb/aa;
        System.out.println(dd);
        System.out.println(cc);
        System.out.println((double) bb/aa);
        System.out.println(aa%bb);
        System.out.println(aa-bb);

        //арифметическии операции между разными типами
        long mm = aa + b;
        int n = (int) (aa + b);
        long nn = aa%b;
        int w = (int) (aa%b);
        System.out.println(mm);
        System.out.println(n);
        System.out.println(nn);
        System.out.println(w);


        int p = d + b;
        byte q = (byte) (d + b);
        System.out.println (p);
        System.out.println (q);
        System.out.println (d+b);

        short t = (short) (e - k);
        byte v = (byte) (e - k);
        System.out.println(t);
        System.out.println(v);

        double l  = 3.5;
        double o = 2.6;
        System.out.println((l/o));

        float u = 12.45f;
        float i = (float) 3.9;
        float ui = u*i;
        System.out.println(ui);


        double lu = u * l;
        System.out.println((int)lu);// в  результате преобразования double в int после умножения отсекается все, что после запятой и остается только целая часть
        double ab = a *b;
        double da = a;
        System.out.println(ab);
        System.out.println(da);

        // константы
        final int FIRST = 3;
        final int SECOND = 5;
          //FIRST = 66; - при попытке переприсвоить значение константы выдает ошибку, т.к. значение константы нельзя изменить
          //SECOND = 12;


        //работа с char

        char l1 = 89;
        char l2 = 117;
        char l3 = 108;
        char l4 = 105;
        char l5 = 97;
        System.out.println(l1 +""+l2+""+l3+""+l4+""+l4+""+l5);
        System.out.println(l1+l2+l3+l4+l5);

        // boolean

        boolean bool = (a<b);
        boolean boolF = (a>b);

        if (bool){
            System.out.println("Выражение a<b верно");
        }

        if (boolF){
            System.out.println("Выражение a<b неверно");
        }
    }
}
