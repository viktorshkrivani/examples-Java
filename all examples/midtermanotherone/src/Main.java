public class Main {
    public static void main(String[] args) {
                Powerstrip powerstrip = new Powerstrip(3);
                System.out.println("Max plugs: " + powerstrip.getMaxPlugs());

                boolean pluggedIn = powerstrip.plugIn();
                System.out.println("Plug 1 inserted: " + pluggedIn);

                pluggedIn = powerstrip.plugIn();
                System.out.println("Plug 2 inserted: " + pluggedIn);

                pluggedIn = powerstrip.plugIn();
                System.out.println("Plug 3 inserted: " + pluggedIn);

                pluggedIn = powerstrip.plugIn();
                System.out.println("Plug 4 inserted: " + pluggedIn);

                boolean unplugged = powerstrip.unplug();
                System.out.println("Plug 3 unplugged: " + unplugged);

                unplugged = powerstrip.unplug();
                System.out.println("Plug 2 unplugged: " + unplugged);

                unplugged = powerstrip.unplug();
                System.out.println("Plug 1 unplugged: " + unplugged);

                unplugged = powerstrip.unplug();
                System.out.println("Plug 0 unplugged: " + unplugged);
            }
        }