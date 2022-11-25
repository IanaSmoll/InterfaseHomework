import java.util.Arrays;
public interface Queue {
    public void add(int el);
    boolean isEmpty();
    public int remove();

public static void main (String[] args) {
   QueueRelease queue = new QueueRelease();// не задаем размер массива???
     
    queue.add(5);
    queue.add(4);
    queue.add(7);
    queue.add(8);
    queue.add(10);
    while (!queue.isEmpty()) {
        System.out.println(queue.remove());
    }
}
}

class QueueRelease implements Queue {
    private int[] myArray;
    private int start;
    private int length;
    private int maxLength; 

    public QueueRelease() {
        this.maxLength = 4;
        this.myArray = new int[maxLength];
        this.start = 0;
        this.length = 0;
    }
    private void resize() {
        if((start + length) >= maxLength) {
           maxLength = maxLength * 2;
           int[] myArray2 = new int[maxLength];
           for(int i = 0; i < length; i++) {
            myArray2[i] = myArray[i + start];
           }
           myArray = myArray2;
           start = 0;
        }
    }

    @Override
    public void add(int el) {
        /*myArray[myArray.length] = el;
        if (isEmpty()) {
            myArray[0] = el;
            return;
        }
        int tmp[] = new int[myArray.length + 1];

        for(int i = 0; i < myArray.length; i++)
        {
            tmp[i] = myArray[i];
        }
        tmp[myArray.length] = el;
        myArray = tmp;
        System.out.println(Arrays.toString(myArray));- простая версия*/

        resize();
        myArray[start + length] = el;
        length++;
    }

    @Override
    public boolean isEmpty()
    {
        return (length < 1);
    }       

    @Override
    public int remove() {
        if (isEmpty()) {
            return 0;
        }
        
       /* int result = myArray[0];

        int tmp[] = new int[myArray.length - 1];

        for(int i = 0; i < myArray.length - 1; i++)
        {
            tmp[i] = myArray[i + 1];
        }
        myArray = tmp;
        System.out.println(Arrays.toString(myArray));
        return result; - версия с копированием элементов в другой массив */
        
       start++;
       length--;
       return myArray[start - 1];
    }
}  

