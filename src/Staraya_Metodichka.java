import java.util.Scanner;


public class Staraya_Metodichka {
    public static void main(String[] args) {

//--------------------------TASK-1--------------------------
//        Scanner scan = new Scanner(System.in);
//        int size_a = scan.nextInt();
//
//        int[] arr = new int[size_a];
//        for(int a = 0; a<size_a; a++){
//            arr[a]=scan.nextInt();
//        }
//        int sum_a=0;
//        for(int i = 0; i<size_a; i++){
//            sum_a+=arr[i];
//        }
//        System.out.println(sum_a);
//
//
//        int size_b = scan.nextInt();
//        int[] arr_b = new int[size_b];
//        int sum_b=0;
//        int b=0;
//        while(b<size_b){
//            arr_b[b]=scan.nextInt();
//            sum_b+=arr_b[b];
//            b++;
//        }
//        System.out.println(sum_b);
//
//
//
//        int size_c = scan.nextInt();
//        int[] arr_c = new int[size_c];
//        int sum_c=0;
//        int c=0;
//        do{
//            arr_c[c]=scan.nextInt();
//            sum_c+=arr_c[c];
//            c++;
//        }while(c<size_c);
//        System.out.println(sum_c);
//
//        scan.close();


//--------------------------TASK-2--------------------------
//        double sum=0;
//        double tmp=1.0;
//        for(int i=1;i<11;i++){
//            System.out.println(String.format("%(.3f",tmp/i));
//            sum+=tmp/i;
//        }
//        System.out.println(String.format("%(.3f",sum));


//--------------------------TASK-3--------------------------
        /*
        int arr[]=new int[10];
        for(int i=0;i<5;i++){
            arr[i]=(int)Math.round((Math.random()*100));
            System.out.println(arr[i]);
        }

        Random rand = new Random();
        for(int i=5;i<10;i++){
            arr[i]=rand.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("Отсортированный массив: ");
        Arrays.sort(arr);
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }*/

//--------------------------TASK-4--------------------------
        /*
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int arr[]=new int[x+n+1];
        arr[0]=1;
        arr[1]=1;
        int i=2;
        int sum=0;
        while (i<=x+n){
            arr[i]=arr[i-1]+arr[i-2];
            i+=1;
        }
        for(int i1=x;i1<n+x;i1++){
            System.out.println(arr[i1]);
        }*/



//--------------------------TASK-5--------------------------
        //5 - написать прогу, которая генерит массив, элемент от 0 до 100, кол-во задаем сами, после ввода кол-ва массива
        // вывести сам массив и кол-во элементов, потом ввод числа, которое надо удалить из массива,
        // потом снова вывод всего массива без удаленных чисел и выводим длину массива, от 0-9 удаляет числа,
        // кот оканчиваются этой цифрой
        /*
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        int count=0;
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=(int)Math.round((Math.random()*100));
            System.out.println(arr[i]);
        }
        System.out.println("Кол-во элементов: " + arr.length);
        int x=scan.nextInt();
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                arr[i]=-1;
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=-1) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Кол-во элементов: " + (arr.length-count));
        int c=scan.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]!=100){
                if(arr[i]%10==c){
                    arr[i]=-1;
                    count++;
                }
            }
            if(arr[i]==100) {
                if (arr[i] % 100 == c) {
                    arr[i] = -1;
                    count++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=-1) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Кол-во элементов: " + (arr.length-count));*/
//6 - на ввод 2 числа, 1ое (double) в 10ичной, 2ое то, в какую СС перевести, вывести число в новой системе счисления + в 16ичной 2ичной
//--------------------------TASK-6--------------------------
        Scanner scan = new Scanner(System.in);
        double number1 = scan.nextDouble();
        int number=(int)number1;
        double ost = number1-number;
        int CC = scan.nextInt();
        int tmp;
        char temp;
        String newnum=new String();

        while(true){
            tmp=number%CC;
            if(tmp>=10){
                temp=(char)(tmp+55);
                newnum+=temp;
            }
            else{
                newnum+=Integer.toString(tmp);
            }

            number/=CC;
            if(number==0){
                break;
            }
        }
        String itog=new String();
        for(int i=newnum.length()-1;i>=0;i--){
            itog+=newnum.charAt(i);
        }
        String newnum1=new String();
        int tmp1;
        for(int i=0;i<3;i++){
            tmp1=(int)(ost*CC);
            if(tmp1>=10){
                char temp1=(char)(tmp1+55);
                newnum1+=temp1;
            }
            else{
                newnum1+=Integer.toString(tmp1);
            }

            ost*=CC;
            int ost1 = (int)ost;
            ost-=ost1;
            //ost+=ost1;
            /*BigDecimal result = new BigDecimal(ost);
            result = result.setScale(3, BigDecimal.ROUND_UP);
            System.out.println(ost);*/
        }

        String itog1=new String();

        /*for(int i=newnum1.length()-1;i>=0;i--){
            itog1+=newnum1.charAt(i);
        }*/

        itog=itog+"."+newnum1;

        System.out.println(itog);

    }
}