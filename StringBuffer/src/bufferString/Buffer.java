package bufferString;

public class Buffer {
    public static void main(String []args)
    {
        char [] arr ={'a','r','r','a','y'};
        StringBuffer cons= new StringBuffer();
        StringBuffer write = new StringBuffer();// this Allocated the space of 16 character
        String Name1="String literal";
        StringBuffer Name = new StringBuffer("Johan");
        StringBuffer buffer= Name.append("Hello ");
        System.out.println(Name.equals(buffer)); // here it will show the true because here we create one object... equal check the stored object place is same or not.
        StringBuffer convert = new StringBuffer(Name1);
        System.out.println(Name);
        System.out.println("Append Of String :"+Name.append(Name1));
        System.out.println();
        System.out.println(Name1);
        System.out.println(convert);
        System.out.println(write.capacity());
        System.out.println(Name.capacity()); // here capacity is 16(default size) + written character size... 16+5=21
        //Name.ensureCapacity(50);
        System.out.println(Name.capacity()); // here show the maximum capacity because we increase above code line (ensure Capacity)
        System.out.println("passing the array from String Buffer "+cons);
        Name.append("welcome to java language");
        System.out.println(Name.capacity()); // here object store formula is (2*16)+2 or (2*16+1)
        System.out.println(Name.equals(Name1)); // here it will show the false because stored objects are different..
        System.out.println(Name.insert(1,"zzz"));
        System.out.println(Name.reverse()); //reverse the string buffer....
    }
}
