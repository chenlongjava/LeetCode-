package com.test;

public class Demo01 {

    public int[] findTwoNUmber(int k[])
    {
        int []s=new int[2];
        int a[]=new int[k.length];

        for(int i=0;i<a.length;i++)
        {
            a[i]=k[i];
        }

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(Math.abs(a[i])<Math.abs(a[j]))
                {
                    int t;
                    t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }

        for(int i=0;i<s.length;i++)
        {
            s[i]=a[i];
            System.out.println(a[i]);
        }

        return s;
    }

    public static void main(String[] args) {

         int count=0;
         int[] k = {2, -1, 3, 4, -2, -5, -4, 8, 9, 1};
         Demo01 demo01=new Demo01();
         int s[]=demo01.findTwoNUmber(k);
         int max=s[0];
         int min=s[1];
         for(int i=0;i<k.length;i++)
        {
            int index=0;
            if(k[i]==max)
            {
                System.out.println("大于零的最小数字是"+max+"下标为"+(max=i+1));
            }
            if(k[i]==min)
            {
                System.out.println("小于零的最大数字是"+min+"下标为"+(min=i+1));
            }

        }



    }
}
