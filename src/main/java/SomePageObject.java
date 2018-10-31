public class SomePageObject {
    /* So if I have a project with the same structure
     * but with different class names and content,
     * what should happen if I try to merge those two project into a one branch? */

    public void matchingName() {
        int a = 2 + 5;
        System.out.println(a);
    }

    private String notMatchingName() {
        return "heheh";
    }
}
