class Movie {
    private String name;
    public Movie (String name) {
        this.name = name;
    }
    public Movie () {
        name = "";
    }
    public String plot() {
        return "[generic plot].";
    }
    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot(String pl) {
        return "A shark ruins summer.";
    }
}

class VelociPastor extends Movie {
    public VelociPastor() {
        super("The Velocipastor");
    }
    public String plot(String pl) {
        return "A pastor turns into a velociraptor and fights ninjas.";
    }
}

class WandaVision extends Movie {
    public WandaVision() {
        super("WandaVision");
    }
    public String plot(String pl) {
        return "Wanda deals with loss.";
    }
}

class NWH extends Movie {
    public NWH() {
        super("Spider-Man: No Way Home");
    }
    public String plot(String pl) {
        return "Multiversal shenanigans with spider-men.";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
}


public class Polymorphism {
    public static void main (String[] args) {
        // java is looking at the object called movie (variable) then go to the object type class and see
        // if there is a plot() method in that class, if not then it will go to the reference class
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n plot: " + movie.plot());
        }
    }
    public static Movie randomMovie() {
        int randomNum = (int) (Math.random() * 5 + 1);
        System.out.println("number generated: " + randomNum);
        switch(randomNum) {
            case 1:
                return new Jaws();
            case 2:
                return new Forgettable();
            case 3:
                return new NWH();
            case 4:
                return new VelociPastor();
            case 5:
                return new WandaVision();
            default:
                return null;
        }
    }
}