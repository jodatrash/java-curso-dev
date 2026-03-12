package basic.c09_exeptions.ex_08;

import basic.c09_exeptions.ex_08.exceptions.WeakPasswordException;

public class CheckPassword {
    public void checkPassword(String password) throws WeakPasswordException {
        System.out.println("Analizando seguridad de la contraseña...");
        if(password.length() < 8){
            throw new WeakPasswordException("Contraseña demasiado corta");
        }else {
            System.out.println("Contraseña validada correctamente");
        }
    }
}
