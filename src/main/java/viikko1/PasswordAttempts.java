package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String pass = "java123";
    String passväärin = "Salasana väärin!";
    String passOikein = "Tervetuloa!";

    if(tries.length == 2)
  {
    String failure = "Liian monta virheellistä yritystä.";
    System.out.println(failure);
    return failure;
  }

  if(tries.length > 3)
  {
    String failure = "Liian monta virheellistä yritystä.";
    System.out.println(failure);
    return failure;
  }
  else
  { 
    for(int i =0; i <= 3; i++)
    {
        if(tries[i].equals(pass)){
            
            System.out.println(passOikein);
            return passOikein;
        }
        else{
            System.out.println(passväärin);
        }
    }
    return passväärin;
  }
    }
}
