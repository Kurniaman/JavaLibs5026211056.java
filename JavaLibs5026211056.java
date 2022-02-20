import java.util.Scanner;
public class JavaLibs5026211056{
    public static void main(String[]args){
        String name1, name2, city1, city2;
        int age1, age2, random1, random2, result2;
        double math1, math2, result1;
        Scanner keyboard = new Scanner(System.in);
        //Bagian input
        System.out.print("Siapa nama panggilan kamu? ");
        name1 = keyboard.next();
        System.out.print("Masukkan nama panggilan temanmu : ");
        name2 = keyboard.next();
        System.out.print("Masukkan umur kamu : ");
        age1 = keyboard.nextInt();
        System.out.print("Masukkan umur orang lain selain kamu : ");
        age2 = keyboard.nextInt();
        System.out.print("Masukkan satu nama kota : ");
        city1 = keyboard.next();
        System.out.print("Masukkan satu nama kota selain itu : ");
        city2 = keyboard.next();
        System.out.print("Hasil dari 5.5 + 5 : ");
        math1 = keyboard.nextDouble();
        System.out.print("Hasil dari 3.5 +3 : ");
        math2 = keyboard.nextDouble();
        result1 = math1*math2;//luas meja
        System.out.print("Ketik angka antara 1 atau 5 : ");
        random1 = keyboard.nextInt();
        System.out.print("Ketik angka antara 2 atau 4 : ");
        random2 = keyboard.nextInt();
        result2 = 2*random1+2*random2;//keliling meja lain

        //Bagian output
        System.out.println("=== Output with story ===");
        System.out.println("Suatu hari, terjadi percakapan antara sesama murid baru di SMP Tadika Mesra...");
        System.out.println("A : Hai, nama kamu siapa?");
        System.out.println("B: Hai nama saya "+name2+", kamu siapa?");
        System.out.println("A: Nama saya "+name1+".");
        System.out.println("B: Salam kenal, "+ name1 +". Kamu umur berapa "+name1+" ?");
        System.out.println("A: Saya umur "+age1+" tahun");
        System.out.println("B: Wah kamu "+age1 +". Kalau saya berumur "+age2+" tahun.");
        System.out.println("A: Ngomong-ngomong, apakah kamu betah di "+city1+"?");
        System.out.println("B: Ya, cukup betah. Namun, saya pikir kota "+city2+" tidak sepananas "+city1+".");
        System.out.println("== Suatu saat Ketika mereka tugas kelompok pelajaran matematika berdua ==");
        System.out.println("A: "+ name2+", setelah saya ukur, menurut saya panjang meja ini adalah "+math1);
        System.out.println("B: Lebarnya berapa cm?");
        System.out.println("A: Lebarnya sekitar "+math2+" cm.  Luasnya berarti sekitar "+result1+" cm^2.");
        System.out.println("A: Saya juga baru mengukur meja lain. Panjangnya "+random1+" cm dan lebar "+random2+" cm.");
        System.out.println("A: Nah, berarti sesuai rumus, maka kelilingnya adalah "+result2+" cm.");
        System.out.println("A: Wah kita keren banget, hehe.");
        System.out.println("B: Tentu dong, hehe.");

        keyboard.close();
        
    }
}