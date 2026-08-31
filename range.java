class range{
    public static void main(String[] args){
        for(int i=1;i<=100;i=i+1)
        {
            //System.out.println(i);
            if(i % 3 == 0 &&  i % 5 == 0){
                System.out.println("num divisible by 3 and 5:" +i);
            }
        }
    }
}