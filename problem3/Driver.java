package problem3;

public class Driver {
    public static void main(String[] args) {
        Figure[] arr = {
                new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()
        };

        for (Figure fig: arr) {
            fig.getFigure();
        }
        System.out.print("\n");
        for (Figure fig: arr) {
            System.out.print(fig.getClass().getSimpleName() + ": ");
            fig.getFigure();
            System.out.print("\n");

        }
    }
}
