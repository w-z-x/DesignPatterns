public class HomeTheaterFacade {
    Player player;
    Projector projector;
    Screen screen;

    public HomeTheaterFacade(Player player, Projector projector, Screen screen) {
        this.player = player;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie() {
        screen.down();
        projector.on();
        player.on();
    }

    public void endMovie() {
        screen.up();
        projector.off();
        player.off();
    }
}
