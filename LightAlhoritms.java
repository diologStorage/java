
import java.util.Arrays;

//разложение на множители
//поиск в массиве возвращает индекс
//инвертирование массива
//циклический сдвиг в массиве влево
//циклический сдвиг в массиве вправо
//решето Эратосфена поиск всех простых чисел до N

public class LightAlhoritms {
    public static void main(String[] args) {
      
        
//        for (int i = 1; i < 100; i++){
//           System.out.println(i + " is simple? " + isSimple(i)); 
//        }

//       factorizeNumber(112);
//     
//        int[]arr = {1,3,4,5,6,2};        
//        int []arr2 = invertArray(arr); 
//        System.out.println(Arrays.toString(arr2));

//        arr = moveToRight(arr);
//        System.out.println(Arrays.toString(arr));
           boolean [] arr = calculateSimpleNubmerErotosfen(1000);
           for(int i = 2; i <= 1000; i++){
               if (arr[i]){
                   System.out.println(i + " - простое");
               } else {
                   System.out.println(i + " - составное");
               }
           }
          
    }    
    public static boolean isSimple(int x) { //простое число? 
        int divisor = 2;
        while (divisor < x ){ // || x == x /2
            if(x % divisor == 0){
                return false;
            }
            divisor++;
        }
        return true;
    }
    
    public static void factorizeNumber(int x){//разложение на множители
        int divisor = 2;
        while (x > 1){
            if (x % divisor == 0){
                System.out.println(divisor);
                x /= divisor;
            } else {
                divisor++;
            }            
        }
    }
    
    public static int searchInArray (int[]array, int num){ //поиск в массиве возвращает индекс
        
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                return i; 
            }
        }        
        return -1;
    }
    
    public static int[] invertArray(int[] array){ //инвертирование массива
        
        for(int i = 0; i < array.length/2; i++){
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
            System.out.println(tmp);
        }
        return array;
    }
   
    public static int[] moveToLeft(int[]arr){ //циклический сдвиг в массиве влево
        int tmp = arr[0];        
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = tmp;
        return arr;
    }
    
    public static int[] moveToRight(int[]arr){ //циклический сдвиг в массиве вправо
        int tmp = arr[arr.length - 1];        
        for(int i = arr.length - 2; i > - 1; i--){
          arr[i + 1] = arr[i];
        }
        arr[0] = tmp;
        return arr;
    }
    
    public static boolean[] calculateSimpleNubmerErotosfen(int num){//решето Эратосфена поиск всех простых чисел до N
        boolean[]arr = new boolean[num + 1];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;
        for(int i = 2; i < num + 1; i++){
            if(arr[i]){
                for(int k = i * 2; k < num + 1; k += i){
                    arr[k] = false;
                }
            }            
        }        
        return arr;
    } 
}  
