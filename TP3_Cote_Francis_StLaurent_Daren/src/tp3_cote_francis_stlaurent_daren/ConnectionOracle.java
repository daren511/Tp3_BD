/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// ---------------------------
// Cette classe défnit une classe ConnectionOracle.
// C'est ici qu'on identifie les paramètres de connexion
// C'est ici que l'on «Charge le Driver».
// Elle contient les méthode connecter et deconnecter
// On instancie un Objet de cette Classe dans toutes les autres Classes.

package tp3_cote_francis_stlaurent_daren;
import java.sql.*;
import oracle.jdbc.pool.*;


public class ConnectionOracle {
private String nomUsager;
private String motdePasse;
String url="jdbc:oracle:thin:@205.237.244.251:1521:orcl";
   /**
    * @param args the command line arguments
    */
   
private Connection conn;
public void setConnection( String u, String m)
{
   nomUsager = u;
   motdePasse = m;
};

   // La Méthode getConnection retourne un objet conn de type Connection
   public  Connection getConnection()

   {
      return conn;
   }

//La méthode connecter qui sera appeler au moment de la connection
// par le bouton  Se Connecter de l'interface (Classe Identifier)
public void connecter()
{
   try
   {
      OracleDataSource ods = new OracleDataSource();
      ods.setURL(url);
      ods.setUser(nomUsager);
      ods.setPassword(motdePasse);
      conn=ods.getConnection();
      System.out.println("vous êtes connectés");
   }
      catch(SQLException se)
      {
      System.out.println(se);       
      conn = null;
   }
}


public void deconnecter()
{
      try 
      { 
           conn.close();
           System.out.println("connexion fermée");
      }

      catch(SQLException se)
      {
         conn = null;  
      }
}

}



