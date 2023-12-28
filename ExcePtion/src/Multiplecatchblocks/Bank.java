package Multiplecatchblocks;

import java.io.IOException;

public class Bank {

        boolean accountStatus=true;
        boolean connection=true;
        int mPin=1122;


        public void getConnection()throws IOException{
            if(!connection){
                throw new IOException("Please Try again later");
            }

        }
        public void getMpin(int enteredPin) throws SecurityException{
            if(mPin != enteredPin){
                System.out.println ("Invalid Pin ");
            }
        }
        public void getStatus()throws Exception{
            if(!accountStatus){
                throw new  Exception("Your Account is expired");
            }
        }

}




