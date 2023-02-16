import javax.swing.JOptionPane;

public class osuscore
{

    public static void main(String[] args)
    {

      int quantosprecisao[] = new int[3];
        quantoprecisao(quantosprecisao);
        int ondeprecisao[][] = new int[3][];
        ondeprecisao(ondeprecisao, quantosprecisao);
        
      
    }


    public static void combo(int combo)
    {
        
        for (int i = 0; i>=combo; i++)
        {

            

        }


    }

    public static int[] quantoprecisao( int quantos[])
    {
        
      for (int i = 0; i < quantos.length; i++)
      {
        if (i == 0)
        {

    quantos[i]  =  Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos 100 de de precisão você tirou durante a play?"));
        }else if(i == 1)
        {

          quantos[i]  =  Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos 50 de de precisão você tirou durante a play?"));


        }else{

          quantos[i]  =  Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos vezes errou durante a play?"));

        }

   
      }
      return quantos;
  
    }
  
    public static int[][] ondeprecisao(int onde[][], int quantos[])
    {

      for(int i = 0; i > 3; i++)  
      {
        if ( i == 0)
        {
        for (int j = 0; j > quantos[i]; j++)
        {

         onde[quantos.length][quantos[i]] = Integer.parseInt(JOptionPane.showInputDialog(null, "Onde dropou seu "+j+1+"° 100 na play?"));

        }
        }
        else if(i == 1)
        {
          for (int j = 0; j > quantos[i]; j++)
          {
  
            onde[quantos.length][quantos[i]] = Integer.parseInt(JOptionPane.showInputDialog(null, "Onde dropou seu "+j+1+"° 50 na play?"));
  
          }
        }
        else
        {

          for (int j = 0; j > quantos[i]; j++)
          {
  
            onde[quantos.length][quantos[i]] = Integer.parseInt( JOptionPane.showInputDialog(null, "Onde errou pela "+j+1+"° na play?"));
  
          }

        }
      
      }
    //onde[2][0] = primeiro lugar que errou, onde[1][0] primeiro que pegou 50, e onde[0][0] = primeiro 100.
      return onde;
    }

    }