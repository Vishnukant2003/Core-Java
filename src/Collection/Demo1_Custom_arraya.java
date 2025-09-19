package Collection;

public class Demo1_Custom_arraya {
    public static  void main(String[]args){
        class ArrayList{
            Object[] values;
            int capacity = 10;
            int size=0;
            ArrayList(){
                values = new Object[capacity];
            }
            ArrayList(int capacity){
                if(capacity >0){
                    this.capacity = capacity;
                }
                values = new Object[this.capacity];
            }
            public void add(Object obj){
                if (size>= capacity){
                    capacity = (int) (capacity*1.5 + 1);
                    Object[] temp = new Object[capacity];
                    if (size >= 0) System.arraycopy(values, 0, temp, 0, size);
                    values = temp;
                }
                values[size++] = obj;
            }

            public void print (){
                    for (Object temp : values){
                        System.out.println(temp);
                    }

            }
            public int getCapacity(){
                return capacity;
            }
        }
        ArrayList arrayList =new ArrayList(50);
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.print();
        System.out.println("size is " +arrayList.size);
        System.out.println("capacity is "+ arrayList.capacity);

    }
}
