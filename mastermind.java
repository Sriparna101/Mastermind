//Baesd on the theme MIND.
import java.io.*;
class mastermind
{public static void main()throws IOException
    { BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("You are Supposed to guess a four digit number");
         System.out.println("A 'O' in the position of the digit
indicates the the digit is present in the number in that position
itself" );
         System.out.println("A 'X' in the position of the digit
indicates the the digit is not present in the number" );
          System.out.println("A '?' in the position of the digit
indicates the the digit is present in the number not in that position"
);
          System.out.println("In four chances you have to guess the number");
          int i,k=0, j,f,n,x;
     do
       { n= ((int)( Math.random()*9999)) + 1000 ; int dupli=n; f=0;
           int freq[]=new int[10];
           while(dupli>0)
           {freq[dupli%10]++;
            dupli/=10;
           }
           for(x=0;x<10;x++)
           {if(freq[x]>1)
              f++;
            }


        }while(f!=0);

        String copy= Integer.toString(n);
       while(k<4)
       { System.out.println();
           System.out.println("Enter a 4 digit number");

        int a= Integer.parseInt(br.readLine());
        String str=copy;
        int arr[]=new int[4]; String cpy=Integer.toString(a);
        for(i=0; i<4; i++)
        { arr[i]=(int)(cpy.charAt(i));} int ca=0;
           for(i=0;i<4; i++)
             {int flag=0;
                 for(j=0; j<4; j++)
                 {if(arr[i]==((int) (str.charAt(j)) )&& (i==j))
                   {System.out.print("O"); flag=1; ca++;}
                  else if(arr[i]==((int) (str.charAt(j)) ) && (i!=j))
                   {System.out.print("?"); flag=1;}
                }
                if(flag==0)
                 System.out.print("X");
              }
               if(ca==4)
                {System.out.println("Congratulations. You have guessed
the correct number.");
                 break;
                }
                k++;
                   }
                    if(k==4)
                    {System.out.println();
                        System.out.println("Chance over. Sorry.");
                        System.out.print("Answer is =" +n);
                    }

        }
        }
