package Vista;

import Controlador.Controlador;

public class Vista {

    private Login login;
    private Menu menu;

    public Vista(Controlador controlador) {
        this.login = new Login(controlador);
        this.menu = new Menu();
        this.login.setVisible(true);
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
