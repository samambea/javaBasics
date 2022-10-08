public class Sorteio {
   public int numsort1; 
   public int numsort2; 
   public int numsort3; 
   public int numsort4; 
   
   public Sorteio(){
       this(12,11,14,5);
   }
   public Sorteio(int num1,int num2,int num3, int num4){
       this.numsort1=num1;
       this.numsort2=num2;
       this.numsort3=num3;
       this.numsort4=num4;
   }
   
   public int VerificaAcertos(int n1, int n2, int n3, int n4){
       int numacertos = 0;
           if(n1 == this.numsort1||n1== this.numsort2|| n1==this.numsort3 || n1==this.numsort4){
                   numacertos++;
               }
           if(n2 == this.numsort1|| n2== this.numsort2|| n2==this.numsort3 || n2==this.numsort4){
                   numacertos++;
               }
           if(n3 == this.numsort1|| n3== this.numsort2|| n3==this.numsort3 || n3==this.numsort4){
                   numacertos++;
               }
           if(n4 == this.numsort1|| n4== this.numsort2|| n4==this.numsort3 || n4==this.numsort4){
                   numacertos++;
               }       
        return numacertos;
   }
   public double VerificaPremiação(int numA){
       double premio = 0;
       if(numA==4){
           premio = 10000.00;
       }
       else if (numA==3){
           premio = 5000.00;
       }
       else if (numA==2){
           premio = 1000.00;
       }
       else if (numA==1){
           premio = 100.00;
       }
       else{
           premio = 0;
       }
       return premio;
   }
   
}
