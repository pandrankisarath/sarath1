package Multiplecatchblocks;


public class Transfer {

        int availableBalance=1000;

        public void getTransfer(int transferAmount) throws Exception{
            if(availableBalance>=transferAmount){
                availableBalance = availableBalance-transferAmount;
                System.out.println("Remaining Balance: "+availableBalance);
                System.out.println("Transferred Successfully ");
            }else{
                throw  new Exception("Insufficient Funds");
            }
        }



        public void handleSecurityException(Bank bank) throws SecurityException{
            try{
                bank.getMpin(1122 );
            }catch(SecurityException e){
                System.out.println("Wrong Pin");
                throw e;
            }
        }


    }
