import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static HashMap<Integer,String> map = new HashMap<>();
    public static int hora = 18;
    public static ArrayList<Date> datas = new ArrayList<>();
    public static SimpleDateFormat sdl = new SimpleDateFormat("HH:mm");
    public static void main(String[] args) {
    
        map.put(1, "JAT6E09");
        map.put(2, "IZE4117");
        map.put(3, "JAT6E23");
        map.put(4, "JAP7A59");
        map.put(5, "JAT6E01");
        map.put(6, "JAT7A63");
        map.put(7, "JAT7H58");
        map.put(8, "JAV2160");
        map.put(9, "JAU6J80");
        map.put(10, "JAV2E35");
        //Gera as Horas com Minutos Randomicos
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos caminhões virá?");
        resultado(sc.nextInt()/2);
        
          
    }
    public static void resultado(int caminhoes){
        Double rand = 0.0;
        Date progress = new Date();
        for(int i = 0;i<caminhoes;i++){
            if(i%3 == 0){
                rand = 0.0;
                hora++;
            }
            
            for(int b = 0; b != 1;){
                Double mic = Math.random()*59;
                if(mic > rand){
                    rand = mic;
                    b++;
                }
            }
                progress.setHours(hora);
                progress.setMinutes((int)Math.round(rand));
                System.out.print(map.get(i+1)+"->"+sdl.format(progress)+"--");
                progress.setMinutes(progress.getMinutes()+(int)Math.random()*6+6);
            System.out.println(sdl.format(progress));
        }
        
        for(int i = 0;i<caminhoes;i++){
            if(i%4 == 0){
                rand = 0.0;
                hora++;
            }
            
            for(int b = 0; b != 1;){
                Double mic = Math.random()*59;
                if(mic > rand){
                    rand = mic;
                    b++;
                }
            }
                progress.setHours(hora);
                progress.setMinutes((int)Math.round(rand));
                System.out.print(map.get(i+1)+"->"+sdl.format(progress)+"--");
                progress.setMinutes(progress.getMinutes()+(int)Math.random()*6+6);
            System.out.println(sdl.format(progress));
        }
    }
}